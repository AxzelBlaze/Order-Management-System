package com.infosys.infytel.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infytel.user.entity.CartEntity;


public interface CartRepository extends JpaRepository<CartEntity, Integer>{

	List<CartEntity> findByBuyerId(Integer buyerId);

	//CartEntity findByBuyerIdProductId(Integer buyerId, Integer productId);

	

}
