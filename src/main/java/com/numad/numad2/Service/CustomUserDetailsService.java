package com.numad.numad2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.numad.numad2.Configuration.CustomUserDetails;
import com.numad.numad2.Model.User;
import com.numad.numad2.Repository.UserRepo;

public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepo.findByEmail(username);
		
		if (user == null)
		{
			throw new UsernameNotFoundException("No admin found for the given email");
			
		}
		
		return new CustomUserDetails(user);
	}

}
