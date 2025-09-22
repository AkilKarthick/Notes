package com.lk.talentbridge.user_service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.lk.talentbridge.user_service.entity.User;
import com.lk.talentbridge.user_service.repository.UserRepository;
import com.lk.talentbridge.user_service.serviceImpl.UserServiceImpl;

public class UserServiceTest {

	@Mock
	private UserRepository userRepository;
	
	@InjectMocks
	private UserServiceImpl userService;
	
	@Test
	void testRegisterUser() {
		User user = new User();
		user.setUsername("testuser1");
		user.setEmail("test@gmail.com");
		user.setRole("pass123");
		user.setRole("JOB_SEEKER");
		
		when(userRepository.save(any(User.class))).thenReturn(user);

        User savedUser = userService.registerUser(user);

        assertNotNull(savedUser);
        assertEquals("testuser", savedUser.getUsername());
        verify(userRepository).save(user);
	}
	
}
