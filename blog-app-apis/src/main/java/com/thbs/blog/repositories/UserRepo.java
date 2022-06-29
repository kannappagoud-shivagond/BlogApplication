package com.thbs.blog.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thbs.blog.entities.User;
/**
 * 
 * @author kannappagoud_shiva
 *
 */
public interface UserRepo extends JpaRepository<User, Integer>{
		
	
	Optional<User> findByEmail(String email);
}
