package com.numad.numad2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.numad.numad2.Model.User;
import java.util.List;


public interface UserRepo extends JpaRepository<User, Integer> {
	
	//User findByUsername(String username);
	
	public List<User> findByEmail(String email);

	

}
