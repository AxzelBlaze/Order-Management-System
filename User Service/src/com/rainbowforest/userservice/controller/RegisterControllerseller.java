package com.rainbowforest.userservice.controller;

import com.rainbowforest.userservice.entity.Seller;
import com.rainbowforest.userservice.http.header.HeaderGenerator;
import com.rainbowforest.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@RestController
public class RegisterControllerseller {

    @Autowired
    private UserService userService;
    
    @Autowired
    private HeaderGenerator headerGenerator;
    
    @PostMapping(value = "/registration")
    public ResponseEntity<Seller> addUser(@RequestBody Seller user, HttpServletRequest request){
    	if(user != null)
    		try {
    			userService.saveUser(user);
    			return new ResponseEntity<Seller>(
    					user,
    					headerGenerator.getHeadersForSuccessPostMethod(request, user.getSellerId()),
    					HttpStatus.CREATED);
    		}catch (Exception e) {
    			e.printStackTrace();
    			return new ResponseEntity<Seller>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
    	return new ResponseEntity<Seller>(HttpStatus.BAD_REQUEST);
    }
}
