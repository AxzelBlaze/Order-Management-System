package com.userservice.userservice.dto;

import com.userservice.userservice.entity.Cart;

public class CartDTO {

	
	int buyerId;
	
	int prodId;

	int quantity;

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




	@Override
	public String toString() {
		return "CartDTO [quantity=" + quantity + "]";
		
	}
	public static CartDTO valueOf(Cart cartEntity) {
		CartDTO cartDTO = new CartDTO();
		cartDTO.setBuyerId(cartEntity.getBuyerId());
		cartDTO.setProdId(cartEntity.getProdId());
		cartDTO.setQuantity(cartEntity.getQuantity());
		return cartDTO;

	}
	public Cart createEntity() {
		Cart cartEntity = new Cart();
		cartEntity.setQuantity(this.getQuantity());
		
		return cartEntity;
	}


}
