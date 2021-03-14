package com.infosys.infytel.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.infytel.user.dto.CartDTO;
import com.infosys.infytel.user.entity.CartEntity;
import com.infosys.infytel.user.repository.CartRepository;

@Service
public class CartService {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CartRepository cartRepository;
	
	public List<CartDTO> getByBuyerId(Integer buyerId) {
		logger.info("======Cart  details : {}======", buyerId);
		List<CartDTO> cartDTOList = new ArrayList<CartDTO>();
		
		List<CartEntity> cartList = cartRepository.findByBuyerId(buyerId);
		if (!cartList.isEmpty()) {
			for(CartEntity cart : cartList) {
				CartDTO cartDTO = new CartDTO();
				cartDTO.setBuyerId(cart.getBuyerId());
				cartDTO.setProductId(cart.getProductId());
				cartDTO.setQuantity(cart.getQuantity());
				cartDTOList.add(cartDTO);
			}
		}

		return cartDTOList;
	}
	
	public void addToCart(CartDTO cartDTO) {
		logger.info("======Cart Creation Request for data {}======", cartDTO);
		CartEntity cart = cartDTO.createEntity();
		cartRepository.save(cart);
	}
	
	public void deleteFromCart(CartDTO cartDTO) {
		logger.info("======Cart Deletion Request for cart========");
		CartEntity cart = cartDTO.createEntity();
		cartRepository.delete(cart);
	}
	
	
}
