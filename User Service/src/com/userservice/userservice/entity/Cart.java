package com.userservice.userservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table (name = "Cart")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cart {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private String buyerId;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private String prodId;

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
    
	}
    

   // @OneToOne (cascade = CascadeType.ALL)
   // @JoinColumn (name = "user_details_id")
  //  private UserDetails userDetails;

   // @ManyToOne
  //  @JoinColumn (name = "role_id")
   // private UserRole role;

