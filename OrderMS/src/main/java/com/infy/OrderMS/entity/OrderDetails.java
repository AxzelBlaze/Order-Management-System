package com.infy.OrderMS.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderdetails")
public class OrderDetails {
	
	@Id
	@Column(name="ORDERID")
	int orderId;
	
	@Column(name="BUYERID")
	int buyerId;
	
	@Column(name="AMOUNT")
	double amount;
	
	@Column(name="DATE")
	LocalDate date;
	
	@Column(name="ADDRESS")
	String address;
	
	@Column(name="STATUS")
	String status;

	
	  public int getOrderId() { return orderId; }
	  
	  public void setOrderId(int orderId) { this.orderId = orderId; }
	  
	  public int getBuyerId() { return buyerId; }
	  
	  public void setBuyerId(int buyerId) { this.buyerId = buyerId; }
	  
	  public double getAmount() { return amount; }
	  
	  public void setAmount(double amount) { this.amount = amount; }
	  
	  public LocalDate getDate() { return date; }
	  
	  public void setDate(LocalDate date) { this.date = date; }
	  
	  public String getAddress() { return address; }
	  
	  public void setAddress(String address) { this.address = address; }
	  
	  public String getStatus() { return status; }
	  
	  public void setStatus(String status) { this.status = status; }
	 
	
	
}
