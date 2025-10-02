package com.paratti.product_service.configuration;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}
	
	// withDefaultPasswordEncoder() with proper, secure password encoding (BCrypt).
	//Your passwords stored in memory or DB will be hashed, improving security
	@Bean
	public InMemoryUserDetailsManager userDetailsService(PasswordEncoder passwordEncoder) {
	    List<UserDetails> users = new ArrayList<>();

	    UserDetails user1 = User.withUsername("adminakil")
	        .password(passwordEncoder.encode("123"))  // encode the plaintext password with the encoder.
	        .roles("USER")
	        .build();

	    users.add(user1);

	    return new InMemoryUserDetailsManager(users);
	}
	
//this approach fetch from application.prop file
	
//	@Value("${app.security.user.name}")
//    private String userName;
//
//    @Value("${app.security.user.password}")
//    private String userPassword;
//
//    @Value("${app.security.admin.name}")
//    private String adminName;
//
//    @Value("${app.security.admin.password}")
//    private String adminPassword;
    
 // Define PasswordEncoder bean (e.g., BCryptPasswordEncoder here)...

	/*
    @Bean
    public UserDetailsService userDetailsService() {
    	
    	List<UserDetails> users = new ArrayList<>();
    	
    	UserDetails user1 = User.withDefaultPasswordEncoder()
				    			.username("adminakil")  // not comes from database
				    			.password("123") ///not encryted password
				    			.roles("user")
				    			.build();
    	

    	
    	 * withDefaultPasswordEncoder() internally creates a PasswordEncoder
    	 *  that automatically encodes the password string when .build() is called
    	 *  not recommended for production
    	 */
        /*
    	UserDetails user2 = User.withDefaultPasswordEncoder()
    			.username("adminvignesh")
    			.password("1234")
    			.roles("user")
    			.build();

    	users.add(user1);
    	users.add(user2);
    	return new InMemoryUserDetailsManager(users);
    	
//        return new InMemoryUserDetailsManager(user1,user2); //varaargs
    } */
	
	/*
	 * disable CSRF for testing
	 * require authentic for any HTTP reqst
	 * Basic authentication, which prompts user for username & password
	 * builds a SecurityFilterChain
	 * that contains all the security filters configured to apply to incoming requests
	 */
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
		.csrf(csrf -> csrf.disable())  //disable csrf for testing
		.authorizeHttpRequests( auth -> auth.anyRequest().authenticated()
				).httpBasic(Customizer.withDefaults());
		return http.build();
	}
}
