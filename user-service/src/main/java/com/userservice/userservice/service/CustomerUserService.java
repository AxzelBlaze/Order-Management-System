package com.userservice.userservice.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userservice.userservice.dto.BuyerDTO;
import com.userservice.userservice.dto.LoginDTO;
import com.userservice.userservice.dto.SellerDTO;
import com.userservice.userservice.entity.Buyer;
import com.userservice.userservice.entity.Seller;
import com.userservice.userservice.repository.BuyerRepository;
import com.userservice.userservice.repository.SellerRepository;

@Service
public class CustomerUserService {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	BuyerRepository buyRepo;
	
	@Autowired
	SellerRepository sellRepo;
	
	public void createBuyer(BuyerDTO buyDTO) {
		logger.info("Creation request for Buyer {}", buyDTO);
		Buyer buy = buyDTO.createEntityBuyer();
		buyRepo.save(buy);
	}
	public void createSeller(SellerDTO sellDTO) {
		logger.info("Creation request for Seller {}", sellDTO);
		Seller sell = sellDTO.createEntitySeller();
		sellRepo.save(sell);
	}

	// Login
	
	public boolean login1(LoginDTO loginDTO) {
		logger.info("Login request for Buyer {} with password {}", loginDTO.getEmail(),loginDTO.getPassword());
		Optional<Buyer> optCust = buyRepo.findById(loginDTO.getEmail());
		if (optCust.isPresent()) {
			Buyer buy = optCust.get();
			if (buy.getUserPassword().equals(loginDTO.getPassword())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean login(LoginDTO loginDTO) {
		logger.info("Login request for Seller {} with password {}", loginDTO.getEmail(),loginDTO.getPassword());
		Optional<Seller> optCust = sellRepo.findById(loginDTO.getEmail());
		if (optCust.isPresent()) {
			Seller sell = optCust.get();
			if (sell.getUserPassword().equals(loginDTO.getPassword())) {
				return true;
			}
		}
		return false;
	
	}

	// Fetches full profile of a specific customer
	
	public SellerDTO getCustomerProfile( String Email) {
		SellerDTO custDTO = null;
	logger.info("Profile request for customer {}", Email);
		Optional<Seller> optCust = sellRepo.findById(Email);
	if (optCust.isPresent()) {
			Seller cust = optCust.get();
			custDTO = SellerDTO.valueOf(cust);
}


	logger.info("Profile for customer : {}", custDTO);
		return custDTO;
	}


}
