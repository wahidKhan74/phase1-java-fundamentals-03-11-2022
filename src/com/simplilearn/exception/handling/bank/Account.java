package com.simplilearn.exception.handling.bank;

public class Account {

	// data variables / properties
	public long accNo;
	public double balance;
	public String username;
	public String email;

	// non parameterized constructor
	public Account() {
	}

	// parameterized constructor
	public Account(long accNo, double balance, String username, String email) {
		this.accNo = accNo;
		this.balance = balance;
		this.username = username;
		this.email = email;
	}

	// parameterized constructor
	public Account(long accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
}
