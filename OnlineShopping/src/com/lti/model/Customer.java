package com.lti.model;

public class Customer {
	int custId;
	String custName;
	public Customer(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	

}
