package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.UserRepository;
import com.app.dto.ResponseDTO;
import com.app.pojos.User;

@CrossOrigin
@RestController
public class AuthController {
	@Autowired
	private AuthenticationManager authManager;
	@Autowired
	private JwtUtil jwtUtils;
	@Autowired
	private UserRepository userRepo;

	@PostMapping("/login")
	public ResponseEntity<?> authenticate(@RequestBody Credentials cred) {
		try {
			Authentication auth = new UsernamePasswordAuthenticationToken(cred.getEmail(), cred.getPassword());
			auth = authManager.authenticate(auth);
			ShopUser user = (ShopUser) auth.getPrincipal();
			System.out.println("got principal:"+user);
			String token = jwtUtils.generateToken(user);
			System.out.println("generated tocken:"+ token);
			
			User originalUser=userRepo.findByEmail(cred.getEmail());
			
			//return ResponseEntity.ok(token);
			return new ResponseEntity<>(new ResponseDTO<>("success", originalUser, token), HttpStatus.OK);
		}catch (BadCredentialsException e) {
			return ResponseEntity.notFound().build();
		}
	}
}
