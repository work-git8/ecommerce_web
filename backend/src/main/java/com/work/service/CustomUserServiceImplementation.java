package com.work.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.work.model.User;
import com.work.repository.UserRepository;

@Service
public class CustomUserServiceImplementation implements UserDetailsService{

	private UserRepository userRepository;
	
	public CustomUserServiceImplementation(UserRepository userRepository) {
		
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User  user = userRepository.findByEmail(username);
		if(user == null) {
			throw new UsernameNotFoundException("user not found with email-"+username);
		}
		
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), authorities);
	}
	
}
