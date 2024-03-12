package com.app;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.app.dao.UserRepository;
import com.app.pojos.User;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {
	@Autowired
	private JwtUtil jwtUtil;
	@Autowired
	private UserRepository userDao;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String authHeader = request.getHeader("Authorization");
		boolean validHeader = authHeader != null && authHeader.startsWith("Bearer ");
		ShopUser principal = null;
		if(validHeader) {
			String token = authHeader.substring(7);/* authHeader.replace("Bearer", "").trim(); */
			System.out.println("Token: " + token);
			String email = jwtUtil.getTokenUsername(token);
			System.out.println("Email: " + email);
			User user = userDao.findByEmail(email);
			if(user != null) {
				principal = new ShopUser(user);
				System.out.println("Principal: " + principal);
				if(!jwtUtil.validateToken(token, principal))
					principal = null;
			}
		}
		if(principal != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(principal, null, principal.getAuthorities());
			SecurityContextHolder.getContext().setAuthentication(auth);
		}
		// pre-processing
		filterChain.doFilter(request, response); // call next filter in the chain
		// post-processing
	}
	
}
