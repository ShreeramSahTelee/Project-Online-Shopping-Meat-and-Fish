package com.shopping;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.shopping.entity.User;
import com.shopping.repository.UserRepository;
@EnableEurekaClient
@SpringBootApplication
//public class ProjectUserApplication implements CommandLineRunner{
//	@Autowired
//	UserRepository userRepository;
public class ProjectUserApplication{
	public static void main(String[] args) {
		SpringApplication.run(ProjectUserApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//	User user=	userRepository.getUserByUserName("raman");
//	System.out.println(user.getUserNumber());
//	
//		
//	}

}
