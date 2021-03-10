package com.userservice.userservice.dto;

public class CartDTO {

	
	String buyerId;
	
	String prodId;

	Integer quantity;

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}




	//@Override
	//public String toString() {
	//	return "PlanDTO [planId=" + planId + ", planName=" + planName + ", nationalRate=" + nationalRate
			//	+ ", localRate=" + localRate + "]";
//	}


}
