package com.userservice.userservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.userservice.userservice.dto.BuyerDTO;
import com.userservice.userservice.dto.LoginDTO;
import com.userservice.userservice.dto.SellerDTO;
import com.userservice.userservice.service.CustomerUserService;

@RestController
@CrossOrigin
@RibbonClient (name="custribbon",configuration=CustRibbonConfig.class)
public class CustomerController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CustomerUserService custService;
	
	@Autowired
	RestTemplate template;
	
//	@Value("${plan.uri}")
	//String planUri;

	
	// Create a new buyer
	@PostMapping(value = "/buyer",  consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createBuyer(@RequestBody BuyerDTO buyDTO) {
		logger.info("Creation request for buyer {}", buyDTO);
		custService.createBuyer(buyDTO);
	}
	// create new seller
	@PostMapping(value = "/seller",  consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createSeller(@RequestBody SellerDTO sellDTO) {
		logger.info("Creation request for seller {}", sellDTO);
		custService.createSeller(sellDTO);
	}

	// Login buyer
	@PostMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean login1(@RequestBody LoginDTO loginDTO) {
		logger.info("Login request for customer {} with password {}", loginDTO.getEmail(),loginDTO.getPassword());
		return custService.login(loginDTO);
	}
	
	// Login seller
	@PostMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean login(@RequestBody LoginDTO loginDTO) {
		logger.info("Login request for customer {} with password {}", loginDTO.getEmail(),loginDTO.getPassword());
		return custService.login(loginDTO);
	}

	// Fetches full profile of a specific customer
//	@GetMapping(value = "/customers/{phoneNo}",  produces = MediaType.APPLICATION_JSON_VALUE)
//	public CustomerDTO getCustomerProfile(@PathVariable Long phoneNo) {
//		
//		logger.info("Profile request for customer {}", phoneNo);
		
//		CustomerDTO custDTO=custService.getCustomerProfile(phoneNo);
//		PlanDTO planDTO=new RestTemplate().getForObject(planUri+custDTO.getCurrentPlan().getPlanId(), PlanDTO.class);
//		custDTO.setCurrentPlan(planDTO);
		
//		@SuppressWarnings("unchecked")
//		List<Long> friends=template.getForObject("http://custribbon/customers/"+phoneNo+"/friends", List.class);
//		custDTO.setFriendAndFamily(friends);
//		return custDTO;
//	}



}
