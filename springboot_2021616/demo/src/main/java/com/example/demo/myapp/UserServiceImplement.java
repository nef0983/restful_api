package com.example.demo.myapp;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImplement implements UserServiceInterface {

	private UserRepository uRepository;
	
	public String show() {
		return "ok";
	}


	public UserEntity addUser(UserEntity userentity) {
		
		return uRepository.save(userentity);
	}

	
	
	
}
