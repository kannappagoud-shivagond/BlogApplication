package com.thbs.blog.services;

import java.util.List;

import com.thbs.blog.payloads.UserDto;
/**
 * 
 * @author kannappagoud_shiva
 *
 */
public interface UserService {

	UserDto registerNewUser(UserDto user);
	
	
	UserDto createUser(UserDto user);

	UserDto updateUser(UserDto user, Integer userId);

	UserDto getUserById(Integer userId);

	List<UserDto> getAllUsers();

	void deleteUser(Integer userId);

}
