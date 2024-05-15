package com.numad.numad2.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.numad.numad2.Service.CustomUserDetailsService;

@Configuration
@Order(1)
public class SecurityConfiguration {
	
	@Bean
	public UserDetailsService userDetailsService()
	{
		
		return new CustomUserDetailsService();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		
		
	return NoOpPasswordEncoder.getInstance();
	}
	
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
	{
		http.authorizeRequests().requestMatchers("/").permitAll();
		//http.authorizeRequests().requestMatchers("/").permitAll();
		
		//http.antMatcher("/admin/**").authorizeRequests().
		
		
		
		return http.build();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//    @SuppressWarnings("deprecation")
//	protected void configure(HttpSecurity http) throws Exception {
//        http
//            .authorizeRequests()
//                .requestMatchers("/").permitAll() // Permit access to home page
//                .requestMatchers("/admin/**").authenticated() // Require authentication for pages under /secure
//            .and()
//            .formLogin(); // Enable form based authentication
//    }
//    
//    @Bean
//    public BCryptPasswordEncoder bCryptPasswordEncoder()
//    {
//    	return new BCryptPasswordEncoder();
//    }
}
