package com.infosys.infytel.friend.entity;



import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class OrderKeyID implements Serializable{
	
	private int orderId;
	private int prodId;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	
	
}
