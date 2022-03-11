package com.simplilearn.accessmodifier;

public class PrivateAccessModifierDemo {

	public static void main(String[] args) {

		// create object
		BankAccount account = new BankAccount();
		
		// account.balance; // compile time error.
		// account.username;   // compile time error.
		// account.password; // compile time error.
		
		// account.showBalance();  // compile time error.
		
		account.printDetails();
		
	}

}

class BankAccount {

	// private variable
	private double balance = 456567.676;
	private String username = "johnSmith";
	private String password = "john@123";

	// private methods
	private double showBalance() {
		return balance;
	}

	private String showUsername() {
		return username;
	}

	public void printDetails() {
		System.out.println("The user : " + username + " has balance :" + balance);
	}
	
	// private constructor : class cannot be instantiated (cannot create object )
	// private BankAccount(){ }
}