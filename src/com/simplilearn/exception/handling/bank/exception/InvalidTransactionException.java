package com.simplilearn.exception.handling.bank.exception;

//create a unchecked exception extends with RuntimeException
public class InvalidTransactionException  extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public InvalidTransactionException(String message) {
		super(message);
	}
}
