package com.cts.model;

import java.util.Date;

public class Payment {
	private int paymentId;
	private int orderId;
	private Date paymentDate;
	private double paymentAmount;
	private String paymentMode;
	private String paymentStatus;
	
	public Payment() {
		
	}

	public Payment(int paymentId, int orderId, Date paymentDate, double paymentAmount, String paymentMode, String paymentStatus) {
		super();
		this.paymentId = paymentId;
		this.orderId = orderId;
		this.paymentDate = paymentDate;
		this.paymentAmount = paymentAmount;
		this.paymentMode = paymentMode;
		this.paymentStatus = paymentStatus;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

}
