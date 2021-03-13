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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.infytel.friend.dto.OrderDetailsDTO;
import com.infosys.infytel.friend.dto.ProductsOrderedDTO;
import com.infosys.infytel.friend.entity.ProductOrdered;
import com.infosys.infytel.friend.repository.ProductsOrderedRepository;
//import com.infosys.infytel.friend.dto.ProductsOrderedDTO;
import com.infosys.infytel.friend.service.OrderService;


@RestController
@RequestMapping("/orders")
@CrossOrigin
public class OrderController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	OrderService friendService;
	
	@Autowired
	ProductsOrderedRepository productsOrderedRepo;

	//for inputting orders in orderdetails
	@PostMapping(value = "/",  consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveFriend(@RequestBody OrderDetailsDTO orderDTO) {
		logger.info("Order creation", orderDTO);
		friendService.saveFriend(orderDTO);
	}
	
	
	 
	 
	
	//for specific order in orderdetails
	@GetMapping(value = "/{orderId}",  produces= MediaType.APPLICATION_JSON_VALUE)
	public OrderDetailsDTO getSpecificFriends(@PathVariable int orderId) 
	{
		logger.info("Friend and Family numbers for customer {}", orderId);
		return friendService.getSpecificOrder(orderId);
	}
	
	
	//for specific orderId
	  @GetMapping(value = "/orders/{orderId}", produces =MediaType.APPLICATION_JSON_VALUE) 
	  public OrderDetailsDTO getForOrder(@PathVariable int orderId)
	  {
		  OrderDetailsDTO orderDetails=friendService.getSpecificOrder(orderId);
		  List<ProductOrdered> orders=productsOrderedRepo.findByIdOrderId(orderId);
		  orderDetails.setProductsOrder(orders);
		  return orderDetails;
	  }
	  
}
