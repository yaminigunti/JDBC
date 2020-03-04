package com.cts.model;

public class Products {
	private int productId;
	private String productName;
	private float price;
	private double discount;
	private int sellerId;
	
	public Products() {
		
	}

	public Products(int productId, String productName, float price, double discount, int sellerId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.discount = discount;
		this.sellerId = sellerId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

}

