package com.cts.model;

public class subCategory {
	private  int subcategoryId;
	private String subcategoryName;
	private int categoryId;
	
	public subCategory() {
		
	}

	public subCategory(int subcategoryId, String subcategoryName, int categoryId) {
		super();
		this.subcategoryId = subcategoryId;
		this.subcategoryName = subcategoryName;
		this.categoryId = categoryId;
	}

	public int getSubcategoryId() {
		return subcategoryId;
	}

	public void setSubcategoryId(int subcategoryId) {
		this.subcategoryId = subcategoryId;
	}

	public String getSubcategoryName() {
		return subcategoryName;
	}

	public void setSubcategoryName(String subcategoryName) {
		this.subcategoryName = subcategoryName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	

}
