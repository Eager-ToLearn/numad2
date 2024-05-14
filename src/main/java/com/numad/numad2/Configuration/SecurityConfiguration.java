package com.numad.numad2.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@Order(1)
public class SecurityConfiguration {
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
	{
		http.authorizeRequests().requestMatchers("/").permitAll();
		//http.authorizeRequests().requestMatchers("/").permitAll();
		
		
		
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
