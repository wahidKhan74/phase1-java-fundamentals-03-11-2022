package com.simplilearn.exception.handling.bank;


import com.simplilearn.exception.handling.bank.exception.AccountNotFound;
import com.simplilearn.exception.handling.bank.exception.InvalidTransactionException;

public class BankOperation {

	public static String bankName ="Iron Bank";
	
	// show balance
	public double showBalance(Account account) throws AccountNotFound {
		if(account!= null) {
			return account.balance;
		}
		throw new AccountNotFound("Account does not exist !");
	}
	
	// deposit amount
	public double despositAmount(Account account, double amount) {
		if(amount>0) {
			account.balance += amount ; // account.balance =  account.balance + amount; 
			return account.balance;
		} else {
			throw new InvalidTransactionException(amount + " Invalid deposit Amount.");
		}
	}
	
	// withdraw amount
	public double withdrawAmount(Account account, double amount) {
		if(amount>0) {
			account.balance -= amount ; // account.balance =  account.balance - amount; 
			return account.balance;
		} else {
			throw new InvalidTransactionException(amount + " Invalid withdraw Amount.");
		}
	}
}
