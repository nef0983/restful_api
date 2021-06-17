package com.example.demo.myapp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
	
	
	@Query(value = "select * from user_data where username = ?1", nativeQuery=true)
	UserEntity queryByName(String username);
	
	
	@Query(value = "select * from user_data where email = ?1", nativeQuery=true)
	UserEntity queryByUserid(String userid);
   
	@Query(value = "select * from user_data where country = ?1", nativeQuery=true)
	List <UserEntity> queryByCountry(String country);// List 可返還多筆資料
	
	
	
}
