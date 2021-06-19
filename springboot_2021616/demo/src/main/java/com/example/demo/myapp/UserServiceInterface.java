package com.example.demo.myapp;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {

// Optional 用來快速檢查是否為空值 fial fast

	

	void  addUser(UserEntity userentity);//新增 user

	Optional<UserEntity> findById(Long id);

	UserEntity getByUser(String user);

	List<UserEntity> findAll();

	UserEntity updateUser(UserEntity userentity);
	
}
