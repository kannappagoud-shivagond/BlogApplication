package com.thbs.blog.services;

import java.util.List;

import com.thbs.blog.payloads.CategoryDto;
/**
 * 
 * @author kannappagoud_shiva
 *
 */
public interface CategoryService {

	// create
	CategoryDto createCategory(CategoryDto categoryDto);

	// update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

	// delete
	void deleteCategory(Integer categoryId);

	// get
	CategoryDto getCategory(Integer categoryId);

	// get All

	List<CategoryDto> getCategories();

}
