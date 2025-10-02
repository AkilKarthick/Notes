package com.lk.talentbridge.user_service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lk.talentbridge.user_service.entity.User;
import com.lk.talentbridge.user_service.repository.UserRepository;
import com.lk.talentbridge.user_service.service.UserService;

@Service
public class UserServiceImpl implements UserService {

//	@Autowired
	private final UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository= userRepository;
	}
	
	@Override
	public User registerUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public Optional<User> findById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
		
	}
	
	@Override
	public List<User> saveAllUsers(List<User> users) {
	    return userRepository.saveAll(users);
	}

	
	
	
}
