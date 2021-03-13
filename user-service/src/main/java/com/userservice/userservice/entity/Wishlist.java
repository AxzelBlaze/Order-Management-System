package com.userservice.userservice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="wishlist")
@IdClass(Wishlist.class)
public class Wishlist implements Serializable {
	@Id
	@Column(name="BUYERID",nullable = false)
	private int buyerId;
	
	@Id
	@Column(name="PRODID",nullable = false)
	private int prodId;

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
	
	
	
	}
