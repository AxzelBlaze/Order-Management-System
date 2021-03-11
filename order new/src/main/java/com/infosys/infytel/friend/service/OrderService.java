package com.infosys.infytel.friend.service;

import java.util.ArrayList;
import java.util.List;
/*import java.util.ArrayList;
import java.util.List;*/
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.infytel.friend.dto.OrderDetailsDTO;
import com.infosys.infytel.friend.dto.ProductsOrderedDTO;
import com.infosys.infytel.friend.entity.OrderDetails;
import com.infosys.infytel.friend.entity.ProductOrdered;
import com.infosys.infytel.friend.repository.OrderRepository;
import com.infosys.infytel.friend.repository.ProductsOrderedRepository;






@Service
public class OrderService {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	OrderRepository friendRepo;
	
	@Autowired
	ProductsOrderedRepository productsOrderedRepo;

	// Create Friend Family
	
	/*
	 * public void saveFriend(Long phoneNo, OrderDetailsDTO friendDTO) {
	 * logger.info("Creation request for customer {} with data {}", phoneNo,
	 * friendDTO); friendDTO.setPhoneNo(phoneNo); FriendFamily friend =
	 * friendDTO.createFriend(); friendRepo.save(friend); }
	 */
	
	// Get friend and family phone number list of a given customer
	public OrderDetailsDTO getSpecificOrder(int orderId){
		logger.info("Friend and family detailsfor customer {} ", orderId);
		OrderDetailsDTO orderDetailsDTO = null;
		Optional<OrderDetails> optOrder = friendRepo.findById(orderId);
		if (optOrder.isPresent()) {
			OrderDetails order = optOrder.get();
			orderDetailsDTO = OrderDetailsDTO.valueOf(order);
		}

		return orderDetailsDTO;
	}
	
	public List<ProductsOrderedDTO> getAllOrdered() {

		List<ProductOrdered> orders = productsOrderedRepo.findAll();
		List<ProductsOrderedDTO> orderDTOs = new ArrayList<>();

		for (ProductOrdered order : orders) {
			ProductsOrderedDTO orderDTO = ProductsOrderedDTO.valueOf(order);
			orderDTOs.add(orderDTO);
		}

		
		return orderDTOs;
	}

}