package com.work.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.work.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{

	
}
