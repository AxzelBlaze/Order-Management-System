package com.userservice.userservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table (name = "Buyer")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Wishlist {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private String buyerId;

   
    private String prodId;
    
    private int quantity;

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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}}
	
    

   // @OneToOne (cascade = CascadeType.ALL)
   // @JoinColumn (name = "user_details_id")
  //  private UserDetails userDetails;

   // @ManyToOne
  //  @JoinColumn (name = "role_id")
   // private UserRole role;

