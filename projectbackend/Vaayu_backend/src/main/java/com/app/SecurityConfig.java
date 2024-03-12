package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@SuppressWarnings("deprecation")
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private ShopUserDetailsService userDetailsService;
	@Autowired
	private JwtRequestFilter jwtRequestFilter;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}
	
	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	

	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http.csrf().disable()
	        .authorizeRequests()
	       // .antMatchers("/superadmin/**").hasAuthority("SUPERADMIN")
	        .antMatchers("/superadmin/**").permitAll()
	        //.antMatchers("/admin/**").hasAuthority("ADMIN")
	        .antMatchers("/admin/**").permitAll()
	        .antMatchers("/user/signup").permitAll() // allow anyone to access signup endpoint
	        .antMatchers("/user/**").hasAuthority("CUSTOMER")
	       // .antMatchers("/user/**").permitAll()
	      
	        .antMatchers("/home/**","/login").permitAll() // allow anyone to access login endpoint
	        .anyRequest().authenticated()
	        .and()
	        .cors()
	        .and()
	        .addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class)
	        .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}

}
