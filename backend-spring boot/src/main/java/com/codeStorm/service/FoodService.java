package com.codeStorm.service;

import java.util.List;

import com.codeStorm.Exception.FoodException;
import com.codeStorm.Exception.RestaurantException;
import com.codeStorm.model.Category;
import com.codeStorm.model.Food;
import com.codeStorm.model.Restaurant;
import com.codeStorm.request.CreateFoodRequest;

public interface FoodService {

	public Food createFood(CreateFoodRequest req,Category category,
						   Restaurant restaurant) throws FoodException, RestaurantException;

	void deleteFood(Long foodId) throws FoodException;
	
	public List<Food> getRestaurantsFood(Long restaurantId,
			boolean isVegetarian, boolean isNonveg, boolean isSeasonal,String foodCategory) throws FoodException;
	
	public List<Food> searchFood(String keyword);
	
	public Food findFoodById(Long foodId) throws FoodException;

	public Food updateAvailibilityStatus(Long foodId) throws FoodException;
}
