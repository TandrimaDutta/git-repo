package com.lti.model;

import java.time.LocalDate;

public class Transaction {
	int transId;
	LocalDate date;
	double amount;
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Transaction(int transId, LocalDate date, double amount) {
		super();
		this.transId = transId;
		this.date = date;
		this.amount = amount;
	}
	

}
