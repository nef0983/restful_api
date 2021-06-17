package com.example.demo.myapp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserServiceImplement uServiceImp;

	@Autowired
	private UserRepository uRepostory;

	@GetMapping("/show")
	public String show() {
		return uServiceImp.show();
	}

	@GetMapping("/test")
	public String show2() {

		return "test";
	}

	@GetMapping("/users")
	public List<UserEntity> getusers() {
		return uRepostory.findAll();
	}

//	  RESTful API 在HTTP傳送方式就先分歧 使用"GET"模式傳送URL http://localhost:8080/request 會執行get() ,
//	   使用"POST"模式傳送URL http://localhost:8080/request 會執行post()。

	@GetMapping("/request")
	public String get() {
		return "get";
	}

	@PostMapping("/request")
	public String post() {
		return "post";
	}

	@GetMapping("/users/{id}") // @PathVariable 解析路徑 ("/get/user/{id}" 取的{id} id 查詢user資訊
	public Optional<UserEntity> getuserById(@PathVariable Long id) {

		return uRepostory.findById(id);

	}

	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable Long id) {

		uRepostory.deleteById(id);
		return "Deleted user by Id : " + id;
	}

	@PutMapping("/users/")
	public String addUser(@RequestBody UserEntity userentity) {

		uRepostory.save(userentity);
		return "Add user byUsername :" + userentity.getUsername();
	}

}
