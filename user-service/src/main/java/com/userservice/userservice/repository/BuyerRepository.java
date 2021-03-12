package com.userservice.userservice.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userservice.userservice.entity.Buyer;

public interface BuyerRepository extends JpaRepository<Buyer, Integer> {

	
	List<Buyer> getByEmail(String email);

}
