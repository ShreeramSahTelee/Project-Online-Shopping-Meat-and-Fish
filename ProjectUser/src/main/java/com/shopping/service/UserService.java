package com.shopping.service;

import java.util.List;

import com.shopping.dto.UserDto;
import com.shopping.entity.User;

public interface UserService {
	UserDto addUser(UserDto userDto);
	List<UserDto> getAllUser();
	UserDto getUserById(int id);
	UserDto updateUserById(int id,UserDto userDto);
	String deleteUserById(int id);
	UserDto getUserByUserName(String userName);


}
