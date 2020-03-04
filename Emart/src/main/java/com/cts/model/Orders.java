package com.cts.model;

import java.util.Date;

public class Orders {
	private int orderId;
	private Date orderDate;
	private float totalAmount;

	
	public Orders() {
		
	}

	public Orders(int orderId, Date orderDate, float totalAmount) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.totalAmount = totalAmount;
		
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}


}
