package com.example.demo.myapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="UserData")
public class UserEntity {
	
	@Id
	@GeneratedValue()
	private Long id;
	@NotNull(message = "user can't be null")  //@NotNull 搭配@Vaild 來驗證內容   
	private String user;
	@NotNull(message = "password can't be null")
	private String password;
	@NotNull(message = "email can't be null")
	@Email//可驗證email 格式
	private String email;
	private String country;
	private int age =100;  // 可設定預設值 age=100
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

	
}
