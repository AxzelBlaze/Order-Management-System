package com.userservice.userservice.entity;

import javax.persistence.*;

@Entity
@Table (name = "seller")

public class Seller{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int sellerId;

    public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	@Column (name = "name", nullable = false, unique = true, length = 50)
    private String userName;
    @Column (name = "user_password", nullable = false, length = 50)
    private String userPassword;
    @Column (name = "Isactive")
    private int active;
    private String email;
    private long phoneNumber;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	//public Long getId() {
		// TODO Auto-generated method stub
	//	return null;
	//}
}
    

   // @OneToOne (cascade = CascadeType.ALL)
   // @JoinColumn (name = "user_details_id")
  //  private UserDetails userDetails;

   // @ManyToOne
  //  @JoinColumn (name = "role_id")
   // private UserRole role;

