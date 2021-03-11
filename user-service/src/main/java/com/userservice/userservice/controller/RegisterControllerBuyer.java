package com.userservice.userservice.controller;

import com.userservice.userservice.dto.BuyerDTO;
import com.userservice.userservice.entity.Buyer;
import com.userservice.userservice.http.header.HeaderGenerator;
import com.userservice.userservice.service.CustomerUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@RestController
public class RegisterControllerBuyer {

    @Autowired
    private CustomerUserService userService;
    
    @Autowired
    private HeaderGenerator headerGenerator;
    
    @PostMapping(value = "/registration")
    public ResponseEntity<Buyer> addUser(@RequestBody BuyerDTO user, HttpServletRequest request){
    	if(user != null)
    		try {
    			userService.createBuyer(user);
    			return new ResponseEntity<Buyer>(
    					headerGenerator.getHeadersForSuccessPostMethod(request, user.getBuyerId()),
    					HttpStatus.CREATED);
    		}catch (Exception e) {
    			e.printStackTrace();
    			return new ResponseEntity<Buyer>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
    	return new ResponseEntity<Buyer>(HttpStatus.BAD_REQUEST);
    }
}
