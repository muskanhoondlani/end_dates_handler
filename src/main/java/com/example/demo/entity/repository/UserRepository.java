package com.example.demo.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	public User findByUserName(String userName);
	
	public User findByEmail(String email);
}
