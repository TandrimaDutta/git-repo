package com.lti.model;

public class Product {
	int prodId;
	String prodName;
	int price;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Product(int prodId, String prodName) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
	}
	

}
