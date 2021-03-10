package com.infy.OrderMS.entity;

import java.io.Serializable;
import java.util.Objects;

public class OrderPK implements Serializable{
	
	public int orderID;
	
	public int prodID;
	
	
	
	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public int getProdID() {
		return prodID;
	}

	public void setProdID(int prodID) {
		this.prodID = prodID;
	}

	public OrderPK() {}
	
	public OrderPK(int orderId,int prodId)
	{
		this.orderID=orderId;
		this.prodID=prodId;
	}	
		  
	@Override
	public boolean equals(Object o) 
	{
		if (this == o) return true;
		if (!(o instanceof OrderPK)) return false;
		OrderPK that = (OrderPK) o;
		return Objects.equals(getOrderID(), that.getOrderID()) && Objects.equals(getProdID(), that.getProdID());
	}
		  
	@Override
    public int hashCode() 
	{
        return Objects.hash(getOrderID(), getProdID());
    }

}
