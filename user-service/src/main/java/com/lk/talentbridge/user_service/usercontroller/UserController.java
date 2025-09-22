package com.lk.talentbridge.user_service.usercontroller;


import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
//	@Autowired
	private final UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService=userService;
	}

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

	@GetMapping("/allUserDetails")
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> users =userService.findAllUsers();
		return new ResponseEntity(users,HttpStatus.OK);
		
	}
	
	// Get all users
//    @GetMapping
//    public ResponseEntity<List<User>> getAllUsers() {
//        List<User> users = userService.findAllUsers();
//        return ResponseEntity.ok(users);
//   
	
	//get user bu id
	
	@GetMapping("/fetchUserBy/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Long id){
		Optional<User> userOpt = userService.findById(id);
		return new ResponseEntity(userOpt,HttpStatus.OK);
	}
	
	//update an existing user by ID
	
	@PutMapping("updateduserDetails/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User userDetails){
		
		Optional<User> userOpt =userService.findById(id);
		if(userOpt.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		User existingUser = userOpt.get();
		existingUser.setUsername(userDetails.getUsername());
		existingUser.setPassword(userDetails.getPassword());
        existingUser.setEmail(userDetails.getEmail());
        existingUser.setRole(userDetails.getRole());
        User updatedUser =userService.registerUser(existingUser);
        return ResponseEntity.ok(updatedUser);	
	}
	
	//delete user by id
	
	@DeleteMapping("deletebyId/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable long id){
		Optional<User> userOpt = userService.findById(id);
		if(userOpt.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		userService.deleteUser(id);
		return ResponseEntity.noContent().build();
	}
	
	
	
}

