package com.simplilearn.exception.handling.bank;

import com.simplilearn.exception.handling.bank.exception.AccountNotFound;

public class Test {

	public static void main(String[] args) {
		
		// create a account object
		Account account = new Account(1212, 10000, "Iron Man", "iron.man@ironbank.com");
		
		// create a BankOperation object
		BankOperation operation = new BankOperation();
		
		System.out.println("Welcome to the bank :: '"+BankOperation.bankName +"' ");
		
		try {
			System.out.println("The user balance : " +operation.showBalance(null));
		} catch (AccountNotFound ex) {
			System.out.println("-----------------");
			System.out.println("Exception Occured ! " + ex.getClass());
			System.out.println("Exception Message : " + ex.getMessage());
			System.out.println("-----------------");
		}
		
		try {
			System.out.println("The user balance after deposit: "+operation.despositAmount(account, 1000));
			System.out.println("The user balance after deposit: "+operation.despositAmount(account, -400));
		} catch (Exception ex) {
			System.out.println("-----------------");
			System.out.println("Exception Occured ! " + ex.getClass());
			System.out.println("Exception Message : " + ex.getMessage());
			System.out.println("-----------------");
		}
	
		
		try {
			System.out.println("The user balance after withdraw: "+operation.withdrawAmount(account, 1000));
			System.out.println("The user balance after withdraw: "+operation.withdrawAmount(account, -400));
		} catch (Exception ex) {
			System.out.println("-----------------");
			System.out.println("Exception Occured ! " + ex.getClass());
			System.out.println("Exception Message : " + ex.getMessage());
			System.out.println("-----------------");
		}
	
		
	}

}
