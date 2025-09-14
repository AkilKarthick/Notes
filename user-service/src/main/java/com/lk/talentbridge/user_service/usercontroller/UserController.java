package com.lk.talentbridge.user_service.usercontroller;


import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lk.talentbridge.user_service.entity.User;
import com.lk.talentbridge.user_service.service.UserService;

import ch.qos.logback.classic.Logger;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("/api/users")
@Validated
public class UserController {
	
	private static final Logger log = (Logger) LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;

	//Register a new user
	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@Valid @RequestBody User user){
		log.info("Registering user: {}", user);
		log.info("Received user registration request: {}", user);
		User savedUser = userService.registerUser(user);	
		return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
	}
	
	@PostMapping("/register/bulk")
	public ResponseEntity<List<User>> registerUsersBulk(@RequestBody List<User> users) {
	    List<User> savedUsers = userService.saveAllUsers(users);
	    return new ResponseEntity<>(savedUsers, HttpStatus.CREATED);
	}

	
}

