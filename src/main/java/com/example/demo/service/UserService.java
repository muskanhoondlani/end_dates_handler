package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.entity.repository.UserRepository;
import com.example.demo.model.LoginDto;
import com.example.demo.model.UserDto;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public void saveUser(UserDto user) {
		User emailExist = userRepository.findByEmail(user.getEmail());
		
		if(emailExist != null) {
			throw new RuntimeException("email exists");
		}
		User entity = new User(user);
		userRepository.save(entity);
	}

	public User findByUsername(String username) {
		return userRepository.findByUserName(username);
	}

	public UserDto validate(LoginDto loginUser) {
		UserDto userDto= null;
		
		User userentity = userRepository.findByUserName(loginUser.getUserName());
		
		if(userentity.getPassword().equals(loginUser.getPassword())) {
			userDto = new UserDto(userentity);
		}
		return userDto;
	}
}
