package com.infy.OrderMS.controller;

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

import com.infy.OrderMS.dto.OrderDetailsDTO;
import com.infy.OrderMS.entity.ProductOrdered;
import com.infy.OrderMS.repository.ProductsOrderedRepository;
import com.infy.OrderMS.service.OrderService;




@RestController
@RequestMapping("/orders")
@CrossOrigin
public class OrderController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	OrderService orderService;
	
	@Autowired
	ProductsOrderedRepository productsOrderedRepo;

	//for inputting orders in orderdetails
	@PostMapping(value = "/",  consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveOrder(@RequestBody OrderDetailsDTO orderDTO) 
	{
		logger.info("Order creation", orderDTO);
		orderService.saveOrder(orderDTO);
	}
	
	//for specific order in orderdetails
	@GetMapping(value = "/{orderId}",  produces= MediaType.APPLICATION_JSON_VALUE)
	public OrderDetailsDTO getSpecificOrder(@PathVariable int orderId) 
	{
		logger.info("Order details for orderId", orderId);
		return orderService.getSpecificOrder(orderId);
	}
	
	
	//for specific orderId all the details
	  @GetMapping(value = "/orders/{orderId}", produces =MediaType.APPLICATION_JSON_VALUE) 
	  public OrderDetailsDTO getForOrder(@PathVariable int orderId)
	  {
		  OrderDetailsDTO orderDetails=orderService.getSpecificOrder(orderId);
		  List<ProductOrdered> orders=productsOrderedRepo.findByIdOrderId(orderId);
		  orderDetails.setProductsOrder(orders);
		  return orderDetails;
	  }
	  
}
