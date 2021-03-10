package com.infy.OrderMS.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.OrderMS.dto.OrderDetailsDTO;
import com.infy.OrderMS.entity.OrderDetails;
import com.infy.OrderMS.repository.OrderDetailsRepository;
import com.infy.OrderMS.repository.ProductsOrderedRepository;

@Service
public class OrderDetailsService {
	
	@Autowired
	OrderDetailsRepository orderDetailsRepo;
	
	@Autowired
	ProductsOrderedRepository productsOrderedRepo;
	
	public void saveOrder(OrderDetailsDTO orderDTO)
	{
		
		OrderDetails order=orderDTO.createOrder();
		orderDetailsRepo.save(order);
	}
	
	public List<OrderDetailsDTO> getAllOrders() {

		List<OrderDetails> orders = orderDetailsRepo.findAll();
		List<OrderDetailsDTO> orderDTOs = new ArrayList<>();

		for (OrderDetails order : orders) {
			OrderDetailsDTO orderDTO = OrderDetailsDTO.valueOf(order);
			orderDTOs.add(orderDTO);
		}

		
		return orderDTOs;
	}
	
	public OrderDetailsDTO getSpecificorder(int orderId) {
		
		OrderDetailsDTO orderDetailsDTO = null;
		Optional<OrderDetails> optOrder = orderDetailsRepo.findById(orderId);
		if (optOrder.isPresent()) {
			OrderDetails order = optOrder.get();
			orderDetailsDTO = OrderDetailsDTO.valueOf(order);
		}

		return orderDetailsDTO;

	}
}
