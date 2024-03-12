package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.UserRepository;
import com.app.dto.LoginDTO;
import com.app.dto.ResponseDTO;
import com.app.dto.UserDTO;
import com.app.pojos.User;
import com.app.service.IUserService;

@CrossOrigin("http://localhost:3000")
@RestController

@RequestMapping("/user")
public class UserController {
	public UserController() {
		System.out.println("in ctor of : " + getClass().getName());
	}

	@Autowired
	private IUserService userService;

	@Autowired
	private UserRepository userRepo;

	

	

	@PutMapping("/edit_profile")
	public ResponseEntity<?> updateUserProfile(@RequestParam int uid, @RequestBody UserDTO userDTO) {
		System.out.println("inside update User profile(controller method)" + userDTO);
		userService.updateUserProfile(uid, userDTO);
		return new ResponseEntity<>("User details updated!!!!!", HttpStatus.OK);

	}

	@GetMapping("/get_user/{userid}")
	public ResponseEntity<?> getUserById(@PathVariable int userid) {
		return new ResponseEntity<>(new ResponseDTO<>("success", userRepo.findById(userid)), HttpStatus.OK);
	}
}
