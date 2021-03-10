package com.infy.OrderMS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.OrderMS.entity.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {
	
	List<OrderDetails> getByOrderId(int orderId);
}
