package com.userservice.userservice.dto;

import com.userservice.userservice.entity.Wishlist;

public class WishListDTO {

	
	int buyerId;
	
	int prodId;

	

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

	




	@Override
	public String toString() {
		return "WishlistDTO [BuyerID=" + buyerId + ", ProductId=" + prodId + "]";
	}
	
	// Converts Entity into DTO
			public static WishListDTO valueOf(Wishlist wishlistEntity) {
				WishListDTO wishlistDTO = new WishListDTO();
				wishlistDTO.setBuyerId(wishlistEntity.getBuyerId());
				wishlistDTO.setProdId(wishlistEntity.getProdId());

				return wishlistDTO;
			}

			// Converts DTO into Entity
			public Wishlist createEntity() {
				Wishlist wishlistEntity = new Wishlist();
				wishlistEntity.setBuyerId(this.getBuyerId());
				wishlistEntity.setProdId(this.getProdId());
				return wishlistEntity;
			}
	
}



