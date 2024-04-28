package com.numad.numad2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.numad.numad2.Model.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	User findByUsername(String username);

	

}
