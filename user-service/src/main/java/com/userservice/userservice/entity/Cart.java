package com.userservice.userservice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="cart")
@IdClass(Cart.class)
public class Cart implements Serializable {
    
	@Id
	@Column(name="BUYERID",nullable = false)
	private int buyerId;
	@Id
	@Column(name="PRODID",nullable = false)
	private int prodId;
	@Column(name="QUANTITY",nullable = false)
	private int Quantity;
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
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	
	
}