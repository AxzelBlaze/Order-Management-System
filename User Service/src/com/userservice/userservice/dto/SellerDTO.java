package com.userservice.userservice.dto;

import java.util.List;

import com.infosys.infytel.customer.entity.Customer;
import com.userservice.userservice.entity.Seller;


public class SellerDTO {

	String sellerId;
	String name;
	String email;
	long phoneNumber;
	String password;

	int isActive;
	







//	@Override
//	public String toString() {
//		return "CustomerDTO [phoneNo=" + phoneNo + ", name=" + name + ", age=" + age + ", gender=" + gender
//				+ ", friendAndFamily=" + friendAndFamily + ", password=" + password + ", address=" + address
	//			+ ", currentPlan=" + currentPlan + "]";
	//}

		public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

		// Converts Entity into DTO
		public static SellerDTO valueOf(Seller sell) {
			SellerDTO sellDTO = new SellerDTO();
			sellDTO.setSellerId(sell.getSellerId());
			sellDTO.setName(sell.getUserName());
			sellDTO.setEmail(sell.getEmail());
			sellDTO.setPhoneNumber(sell.getPhoneNumber());
			sellDTO.setPassword(sell.getUserPassword());
			sellDTO.setIsActive(sell.getActive());
			
			
			//PlanDTO planDTO = new PlanDTO();
			//planDTO.setPlanId(cust.getPlanId());
		//	custDTO.setCurrentPlan(planDTO);
			//custDTO.setCurrentPlan(planDTO);
			
			
			
			return sellDTO;
		}

		// Converts DTO into Entity
		public Seller createEntity() {
			Seller cust = new Seller();
			cust.setPhoneNumber(this.getPhoneNumber());
			cust.setEmail(this.getEmail());
			cust.setUserName(this.getName());
			cust.setUserPassword(this.getPassword());
			cust.setActive(this.getIsActive());
//			cust.setPassword(this.getPassword());
		//	cust.setPlanId(this.getCurrentPlan().planId);
			return cust;
		}


}
