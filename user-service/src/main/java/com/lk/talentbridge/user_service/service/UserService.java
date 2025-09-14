package com.lk.talentbridge.user_service.service;

import java.util.List;
import java.util.Optional;

import com.lk.talentbridge.user_service.entity.User;

public interface UserService {

	User registerUser(User user);
    Optional<User> findById(Long id);
    List<User> findAllUsers();
    void deleteUser(Long id);
	List<User> saveAllUsers(List<User> users);
}
