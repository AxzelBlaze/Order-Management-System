package com.infosys.infytel.friend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.infytel.friend.dto.ProductsOrderedDTO;
import com.infosys.infytel.friend.service.OrderService;

@RestController
@RequestMapping("/ordered")
@CrossOrigin
public class ProductController {
	
	@Autowired
	OrderService friendService;
	
	
	  
	 

	//for all orders in product ordered
		@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
		public List<ProductsOrderedDTO> getAllOrdered()
		{
			//logger.info("Fetching all ordered");
			return friendService.getAllOrdered();
		}
		
		
		 @PostMapping(value = "/ordered", consumes = MediaType.APPLICATION_JSON_VALUE)
		  public void saveFriend(@RequestBody ProductsOrderedDTO orderDTO) {
		  //logger.info("Order creation", orderDTO); 
			 friendService.saveProduct(orderDTO);
		  }
		
		 @PostMapping(value = "/ordered/{orderId}/{prodId}",consumes = MediaType.APPLICATION_JSON_VALUE)
			 public void saveFriend(@PathVariable int orderId,@PathVariable int prodId)
			 {
			 ProductsOrderedDTO orderDTO=friendService.getSpecificOrdered(orderId,prodId);
			 friendService.saveProduct(orderDTO);
			 }
		 
		//for specific orderid and prodid
		  @GetMapping(value = "/{orderId}/{prodId}", produces =MediaType.APPLICATION_JSON_VALUE) 
		  public ProductsOrderedDTO getSpecificOrdered(@PathVariable int orderId,@PathVariable int prodId)
		  {
		  //logger.info("Fetching all ordered"); 
		  return friendService.getSpecificOrdered(orderId,prodId); 
		  }
		 
		  
		  //for specific orderid
		  @GetMapping(value = "/{orderId}", produces =MediaType.APPLICATION_JSON_VALUE) 
		  public List<ProductsOrderedDTO> getForOrder(@PathVariable int orderId)
		  {
		  //slogger.info("Fetching all ordered of orderid"); 
		  return friendService.getForOrder(orderId);
		  }

}
