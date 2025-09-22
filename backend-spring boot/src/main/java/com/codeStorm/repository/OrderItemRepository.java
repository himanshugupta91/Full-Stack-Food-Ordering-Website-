package com.codeStorm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeStorm.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
