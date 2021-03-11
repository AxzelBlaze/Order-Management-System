package com.userservice.userservice.entity;



import javax.persistence.*;

@Entity
@Table (name = "wishlist")

public class Wishlist {

	@EmbeddedId
	private MyKey myKey;
    
    private int quantity;

	


	public MyKey getMyKey() {
		return myKey;
	}

	public void setMyKey(MyKey myKey) {
		this.myKey = myKey;
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

