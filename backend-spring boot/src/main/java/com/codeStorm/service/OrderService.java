package com.codeStorm.service;

import java.util.List;

import com.stripe.exception.StripeException;
import com.codeStorm.Exception.CartException;
import com.codeStorm.Exception.OrderException;
import com.codeStorm.Exception.RestaurantException;
import com.codeStorm.Exception.UserException;
import com.codeStorm.model.Order;
import com.codeStorm.model.PaymentResponse;
import com.codeStorm.model.User;
import com.codeStorm.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
