package com.shopping.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.shopping.dto.UserDto;
import com.shopping.entity.User;

public interface UserRepository extends MongoRepository<User, Integer> {
	
	@Query("{'userName':?0}")
	Optional<User> getUserByUserName(String userName);

}
