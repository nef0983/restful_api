package com.example.demo.myapp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplement implements UserServiceInterface {

	@Autowired
	private UserRepository uRepository;

	
	
	@Override
	public Optional<UserEntity> findById(Long id) {

		return uRepository.findById(id);
	}

	@Override
	public void addUser(UserEntity userentity) {

		uRepository.save(userentity);
	}

	
	@Override
	public UserEntity getByUser(String user) {

		return uRepository.getByUser(user);
	}

	@Override
	public List<UserEntity> findAll() {
		return uRepository.findAll();

	}

	@Override
	public UserEntity updateUser(UserEntity userentity) {
		
		
		return uRepository.save(userentity);
	}

	



}
