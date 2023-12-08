package com.work.service;

import com.work.exception.UserException;
import com.work.model.User;

public interface UserService {

	public User findUserById(Long userId) throws UserException; 

	
	public User findUserProfileByJwt(String jwt) throws UserException ;
}
