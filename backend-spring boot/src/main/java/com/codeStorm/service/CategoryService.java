package com.codeStorm.service;

import java.util.List;

import com.codeStorm.Exception.RestaurantException;
import com.codeStorm.model.Category;

public interface CategoryService {
	
	public Category createCategory (String name,Long userId) throws RestaurantException;
	public List<Category> findCategoryByRestaurantId(Long restaurantId) throws RestaurantException;
	public Category findCategoryById(Long id) throws RestaurantException;

}
