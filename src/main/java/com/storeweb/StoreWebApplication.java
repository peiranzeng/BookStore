package com.storeweb;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.storeweb.domain.User;
import com.storeweb.domain.security.Role;
import com.storeweb.domain.security.UserRole;
import com.storeweb.service.UserService;
import com.storeweb.utility.SecurityUtility;

@SpringBootApplication
public class StoreWebApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userservice;
	
	public static void main(String[] args) {
		SpringApplication.run(StoreWebApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		User user1 = new User();
		user1.setFirstName("John");
		user1.setLastName("Adams");
		user1.setUsername("j");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("p"));
		user1.setEmail("JAdams@gmail.com");
		
		Role role1 = new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		Set<UserRole> userRoles = new HashSet<>();
		userRoles.add(new UserRole(user1, role1));
		
		userservice.createUser(user1, userRoles);
	}
}
