package com.userservice.userservice.dto;

import com.userservice.userservice.entity.Buyer;


public class BuyerDTO {

	int buyerId;
	String name;
	String email;
	long phoneNumber;
	String password;
	String isPrivilaged;
	String rewardPoints;
	int isActive;
	





	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
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

	public String getIsPrivilaged() {
		return isPrivilaged;
	}

	public void setIsPrivilaged(String isPrivilaged) {
		this.isPrivilaged = isPrivilaged;
	}

	public String getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(String rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "BuyerDTO [phoneNo=" + phoneNumber + ", name=" + name + ",  password=" + password + ", RewardPoints=" + rewardPoints
				+ ", IsPrivileged=" + isPrivilaged + "]";
	}

		// Converts Entity into DTO
		public static BuyerDTO valueOf(Buyer buy) {
			BuyerDTO buyDTO = new BuyerDTO();
			buyDTO.setBuyerId(buy.getBuyerId());
			buyDTO.setEmail(buy.getEmail());
			buyDTO.setName(buy.getUserName());
			buyDTO.setPhoneNumber(buy.getPhoneNumber());
			buyDTO.setPassword(buy.getUserPassword());
			buyDTO.setIsActive(buy.getActive());
			buyDTO.setIsPrivilaged(buy.getIsPrivilaged());
			buyDTO.setRewardPoints(buy.getRewardPoints());
//			buyDTO.setPassword(buy.getPassword());
			
			
		//	PlanDTO planDTO = new PlanDTO();
		//	planDTO.setPlanId(cust.getPlanId());
		//	custDTO.setCurrentPlan(planDTO);
		//	custDTO.setCurrentPlan(planDTO);
			
			
			
			return buyDTO;
		}

		// Converts DTO into Entity
		public Buyer createEntityBuyer() {
			Buyer buy = new Buyer();
			buy.setEmail(this.getEmail());
			buy.setPhoneNumber(this.getPhoneNumber());
			buy.setUserName(this.getName());
			buy.setUserPassword(this.getPassword());
			buy.setActive(this.getIsActive());
			buy.setIsPrivilaged(this.getIsPrivilaged());
			buy.setRewardPoints(this.getRewardPoints());
			
			buy.setBuyerId(this.getBuyerId());
			return buy;
		}


}
