package com.example.demo.myapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
	
	

	@Query(value = "select * from user_data where user= ?1", nativeQuery=true)
	UserEntity getByUser(String user);
	
	
	
}
