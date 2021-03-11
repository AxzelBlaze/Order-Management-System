package com.userservice.userservice.controller;

import com.userservice.userservice.dto.BuyerDTO;
import com.userservice.userservice.dto.SellerDTO;
import com.userservice.userservice.entity.Buyer;
import com.userservice.userservice.entity.Seller;
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
public class RegisterControllerSeller {

    @Autowired
    private CustomerUserService userService;
    
    @Autowired
    private HeaderGenerator headerGenerator;
    
    @PostMapping(value = "/registration")
    public ResponseEntity<Seller> addUser(@RequestBody SellerDTO user, HttpServletRequest request){
    	if(user != null)
    		try {
    			userService.createSeller(user);
    			return new ResponseEntity<Seller>(
    					headerGenerator.getHeadersForSuccessPostMethod(request, user.getSellerId()),
    					HttpStatus.CREATED);
    		}catch (Exception e) {
    			e.printStackTrace();
    			return new ResponseEntity<Seller>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
    	return new ResponseEntity<Seller>(HttpStatus.BAD_REQUEST);
    }
}
