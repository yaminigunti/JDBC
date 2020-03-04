package com.cts.model;

public class Category {
	private int categoryId;
	private String categoryName;
	private double GST;
	
	public Category() {
		
	}

	public Category(int categoryId, String categoryName, double GST) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.GST = GST;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public double getGST() {
		return GST;
	}

	public void setGST(double gST) {
		GST = gST;
	}

	

}
