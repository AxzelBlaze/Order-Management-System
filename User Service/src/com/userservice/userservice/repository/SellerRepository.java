package com.userservice.userservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infytel.customer.entity.Customer;
import com.userservice.userservice.entity.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

	

}
