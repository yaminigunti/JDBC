package com.cts.model;

import java.util.Date;

public class Discounts {
	
	String discountId;
	String discountCode;
	int percentage;
	String item;
	Date ValidFrom;
	Date ValidTo;
	
	public Discounts() {
		super();
	}
	public Discounts(String discountId, String discountCode, 
			int percentage, String item,Date ValidFrom, Date ValidTo) {
		super();
		this.discountId = discountId;
		this.discountCode = discountCode;
		this.percentage = percentage;
		this.item = item;
		this.ValidFrom=ValidFrom;
		this.ValidTo=ValidTo;
	}
	public String getDiscountId() {
		return discountId;
	}
	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}
	public String getDiscountCode() {
		return discountCode;
	}
	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Date getValidFrom() {
		return ValidFrom;
	}
	public void setValidFrom(Date validFrom) {
		ValidFrom = validFrom;
	}
	public Date getValidTo() {
		return ValidTo;
	}
	public void setValidTo(Date validTo) {
		ValidTo = validTo;
	}
	
}