package com.cts.model;

public class Seller {
	private int sellerId;
	private String sellerName;
	private String mobileNumber;
	 private String brand;
	 private int productId;
	 
	 public Seller() {
		 
	 }

	public Seller(int sellerId, String sellerName, String mobileNumber, String brand, int productId) {
		super();
		this.sellerId = sellerId;
		this.sellerName = sellerName;
		this.mobileNumber = mobileNumber;
		this.brand = brand;
		this.productId = productId;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

}

