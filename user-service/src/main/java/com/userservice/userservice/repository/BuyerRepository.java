package com.userservice.userservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.userservice.userservice.entity.Buyer;

public interface BuyerRepository extends JpaRepository<Buyer, String> {

	

}
