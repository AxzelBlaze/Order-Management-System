package com.infosys.infytel.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infytel.user.entity.CartEntity;
import com.infosys.infytel.user.entity.CartId;


public interface CartRepository extends JpaRepository<CartEntity, CartId>{

	List<CartEntity> findByBuyerId(Integer buyerId);

	//CartEntity findByBuyerIdProductId(Integer buyerId, Integer productId);

	

}
