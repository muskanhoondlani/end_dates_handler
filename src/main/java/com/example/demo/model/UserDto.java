package com.example.demo.model;

import com.example.demo.entity.User;

public class UserDto {
	
	public UserDto() {}
	
	public UserDto(User user){
		super();
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.userName = user.getUserName();
		this.email = user.getEmail();
		this.fullName = user.getFirstName() + " " + user.getLastName();
	}
	
	private String userName;
	private String userNameSignup;
	private String passwordSignup;
	private String firstName;
    private String lastName;
    private String password; 
    private String email;
    private String fullName;
   

    public String getUserNameSignup() {
		return userNameSignup;
	}

	public void setUserNameSignup(String userNameSignup) {
		this.userNameSignup = userNameSignup;
	}

	public String getPasswordSignup() {
		return passwordSignup;
	}

	public void setPasswordSignup(String passwordSignup) {
		this.passwordSignup = passwordSignup;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
    
    
}
