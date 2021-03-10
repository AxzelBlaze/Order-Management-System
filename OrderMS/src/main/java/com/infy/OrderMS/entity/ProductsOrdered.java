package com.infy.OrderMS.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(OrderPK.class)
@Table(name="productsordered")
public class ProductsOrdered {
	
	
	@Id
	@Column(name="ORDERID") 
	int orderId;
	  
	@Id
	@Column(name="PRODID") 
	int prodId;
	
	@Column(name="SELLERID")
	int sellerId;
	
	@Column(name="QUANTITY")
	int quantity;
	
	@Column(name="STATUS")
	String status;
	
	@Column(name="PRICE")
	double price;

	
	  public int getOrderId() { return orderId; }
	  
	  public void setOrderId(int orderId) { this.orderId = orderId; }
	  
	  public int getProdId() { return prodId; }
	  
	  public void setProdId(int prodId) { this.prodId = prodId; }
	 
	  public int getSellerId() { return sellerId; }
		  
	  public void setSellerId(int sellerId) { this.sellerId = sellerId; }
		  
	  public int getQuantity() { return quantity; }
		  
	  public void setQuantity(int quantity) { this.quantity = quantity; }
		  
	  public String getStatus() { return status; }
		  
	  public void setStatus(String status) { this.status = status; }
		  
	  public double getPrice() { return price; }
		  
	  public void setPrice(double price) { this.price = price; }
		 
	
	
	

}
