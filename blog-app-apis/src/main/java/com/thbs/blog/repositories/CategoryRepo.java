package com.thbs.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thbs.blog.entities.Category;
/**
 * 
 * @author kannappagoud_shiva
 *
 */
public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
