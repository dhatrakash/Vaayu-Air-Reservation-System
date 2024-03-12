package com.app;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.LoginDTO;
import com.app.dto.ResponseDTO;
import com.app.dto.UserDTO;
import com.app.pojos.User;
import com.app.service.UserServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("/home")
public class HomeController {
	//PasswordEncoder passwordEncoder=new BCryptPasswordEncoder()
	@Autowired
	UserServiceImpl userService;
	
	@PostMapping("/")
	public String home() {
		return "Home";
	}
	
	@PostMapping("/signup")
	public ResponseEntity<?> signupUser(@RequestBody UserDTO userdto) {
		System.out.println("in signup user : " + userdto);
		userService.saveUser(userdto);
		return new ResponseEntity<>(new ResponseDTO<>("success", "Signup Successful...Please login...!!!"),
				HttpStatus.OK);
	}

//	@PostMapping("/login")
//	public ResponseEntity<?> authenticateUser(@RequestBody LoginDTO loginDto) {
//		System.out.println("in authenticate user : " + loginDto.getEmail() + " " + loginDto.getPassword());
//		
//		User user = userService.getUser(loginDto.getEmail(), loginDto.getPassword());
//		return new ResponseEntity<>(new ResponseDTO<>("success", user), HttpStatus.OK);
//	}
	
	@PostMapping("/user")
	public String user(Principal principal) {
		return "User " + principal.getName();
	}

	@PostMapping("/admin")
	public String admin(Principal principal) {
		return "Admin " + principal.getName();
	}
	
	@PostMapping("/superadmin")
	public String superadmin(Principal principal) {
		return "SuperAdmin " + principal.getName();
	}
	
	
}

