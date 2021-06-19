package com.example.demo.myapp;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	// UserServiceImplement 重新包裝JAP 來調用
	@Autowired
	UserServiceImplement uServiceimp;

	@Autowired
	UserRepository uRepository;

	@GetMapping("/users")

	public List<UserEntity> findAll() {
		return uServiceimp.findAll();
	}

//	  RESTful API 在HTTP傳送方式就先分歧 使用"GET"模式傳送URL http://localhost:8080/

	
	@GetMapping("/users/{user}")// find by user
	public UserEntity findByUser(@PathVariable String user) {

		return uServiceimp.getByUser(user);
	}

	@PostMapping("/users/")
	public UserEntity addUser(@Valid @RequestBody UserEntity userentity) {

		uServiceimp.addUser(userentity);
		return userentity;
	}

	@PutMapping("/users/{id}")
	public UserEntity updataUser(@PathVariable Long id, @RequestBody UserEntity userentity) {
		
		userentity.setId(id);
		uServiceimp.updateUser(userentity);
		return userentity;

	}

}
