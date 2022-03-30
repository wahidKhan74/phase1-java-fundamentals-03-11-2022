package com.simplilearn.exception.handling.bank.exception;

//create a checked exception extends with Exception
public class AccountNotFound extends Exception {

	private static final long serialVersionUID = 1L;
	
	public AccountNotFound(String message) {
		super(message);
	}
}
