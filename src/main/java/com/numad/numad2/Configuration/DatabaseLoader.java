package com.numad.numad2.Configuration;

import java.util.List;

import org.hibernate.tool.schema.spi.CommandAcceptanceException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.numad.numad2.Model.Role;
import com.numad.numad2.Model.User;
import com.numad.numad2.Repository.UserRepo;

@Configuration
public class DatabaseLoader {
	
	private UserRepo userRepo;

	public DatabaseLoader(UserRepo userRepo) {
		
		this.userRepo = userRepo;
	}
	
	@Bean
	public CommandLineRunner initializeDatabase()
	{
		
		
		return args ->{
			
			//User user1 = new User("numadAdmin1@gmail.com", "admin123", Role.ADMIN);
			User user1 = new User(1, "numadAdmin1@gmail.com", "admin123", Role.ADMIN);
			User user2 = new User(2, "numadAdmin2@gmail.com", "admin123", Role.ADMIN);
			//User user3 = new User("numadAdmin3@gmail.com", "admin123", Role.ADMIN);
			
			userRepo.saveAll(List.of(user1, user2));
			
			System.out.println("Sample database initialised");
		};
	}
	
	
	 

}
