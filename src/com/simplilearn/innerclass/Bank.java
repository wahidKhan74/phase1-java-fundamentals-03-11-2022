package com.simplilearn.innerclass;

public class Bank {
	
	private String name = "Iron Bank";
	private double assets = 454565.456;
	
	class Banking {
		// properties & methods
		private double balance = 56567.567;
		
		public double showBalance() {
			return balance;
		}
		
		public double deposit(double amount) {
			return balance + amount;
		}
		
		public double withdraw(double amount) {
			return balance + amount;
		}
	}
	
	class Insurance {
		// properties & methods
	}
	
	class Lockers {
		// properties & methods
	}
	
	class Finance {
		// properties & methods
	}
}
