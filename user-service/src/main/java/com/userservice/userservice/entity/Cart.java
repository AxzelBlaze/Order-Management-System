package com.userservice.userservice.entity;

import javax.persistence.*;

@Entity
@Table (name = "cart")

public class Cart {

 @EmbeddedId
 private MyKey myKey;
 
 public MyKey getMyKey() {
	 return myKey;
 }
 public void setMyKey(MyKey myKey) {
	 this.myKey=myKey;
 }
    
	}
    

   // @OneToOne (cascade = CascadeType.ALL)
   // @JoinColumn (name = "user_details_id")
  //  private UserDetails userDetails;

   // @ManyToOne
  //  @JoinColumn (name = "role_id")
   // private UserRole role;

