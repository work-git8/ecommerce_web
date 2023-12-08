package com.work.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.work.model.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
	public User findByEmail(String email);
}
