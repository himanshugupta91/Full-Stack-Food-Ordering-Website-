package com.codeStorm.service;

import java.util.List;

import com.codeStorm.model.Notification;
import com.codeStorm.model.Order;
import com.codeStorm.model.Restaurant;
import com.codeStorm.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
