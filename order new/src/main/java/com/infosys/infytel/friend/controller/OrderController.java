package com.infosys.infytel.friend.controller;

import java.util.List;

//import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.infytel.friend.dto.OrderDetailsDTO;
import com.infosys.infytel.friend.dto.ProductsOrderedDTO;
import com.infosys.infytel.friend.service.OrderService;


@RestController
@CrossOrigin
public class OrderController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	OrderService friendService;

	// Create Friend Family
	/*
	 * @PostMapping(value = "/customers/{phoneNo}/friends", consumes =
	 * MediaType.APPLICATION_JSON_VALUE) public void saveFriend(@PathVariable Long
	 * phoneNo, @RequestBody FriendFamilyDTO friendDTO) {
	 * logger.info("Creation request for customer {} with data {}", phoneNo,
	 * friendDTO); friendService.saveFriend(phoneNo, friendDTO); }
	 */

	// Fetches friend and family numbers of a given customer phoneNo
	@GetMapping(value = "/orders/{orderId}",  produces= MediaType.APPLICATION_JSON_VALUE)
	public OrderDetailsDTO getSpecificFriends(@PathVariable int orderId) {
		logger.info("Friend and Family numbers for customer {}", orderId);
		return friendService.getSpecificOrder(orderId);
	}
	
	@GetMapping(value = "/ordered", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductsOrderedDTO> getAllOrdered() {
		logger.info("Fetching all ordered");
		return friendService.getAllOrdered();
	}

}
