package com.userservice.userservice.dto;

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




	//@Override
	//public String toString() {
	//	return "PlanDTO [planId=" + planId + ", planName=" + planName + ", nationalRate=" + nationalRate
			//	+ ", localRate=" + localRate + "]";
//	}


}
