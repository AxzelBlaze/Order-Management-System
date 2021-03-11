package com.infosys.infytel.friend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infytel.friend.entity.OrderDetails;



public interface OrderRepository extends JpaRepository<OrderDetails, Integer> {

	List<OrderDetails> getByOrderId(int orderId);
}
