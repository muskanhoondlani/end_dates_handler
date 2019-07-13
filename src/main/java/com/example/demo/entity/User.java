package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import com.example.demo.model.UserDto;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@NotEmpty
	private String userName;
	
	@Column
	@NotEmpty
	private String firstName;
	
	@Column
	@NotEmpty
	private String lastName;

	
	@Column
	@NotEmpty
	private String password;
	
	@Column
	@NotEmpty
	private String email;

	public User() {}
	
	public User(UserDto user) {
		super();
		this.userName = (user.getUserName() != null ? user.getUserName(): user.getUserNameSignup());
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.password = (user.getPassword() != null ? user.getPassword() : user.getPasswordSignup());
		this.email = user.getEmail();
	}

	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
