package com.simplilearn.multithreading;

class Customer  {
	
	double balance = 1000.00;
	
	// show balance
	public synchronized void showBalance() {
		System.out.println("The Account balance is : "+balance);
	}
	
	// deposit
	public synchronized void deposit(double amount) {
		System.out.println("Deposit Begin ...");
		balance += amount;
		System.out.println("Deposit is cmpleted & new balance is "+ balance);
	}
	
	// withdraw
	public synchronized void withdraw(double amount) {
		if(balance <= amount) {
			System.out.println("In sufficient fund");
			return;
		}
		balance -= amount;
		System.out.println("Withdraw is completed & new balance is "+ balance);
	}
}


public class BanKOperation {

	public static void main(String[] args) {
		
		// create customer object
		Customer customer = new Customer();
		
		// create thread for each functionality
		Thread t1 = new Thread(()->{
			customer.withdraw(1000);
			System.out.println("--------------");
		});

		Thread t2 = new Thread(()->{
			customer.deposit(5000);
			System.out.println("--------------");
		});
		
		Thread t3 = new Thread(()->{
			customer.showBalance();
			System.out.println("--------------");
		});
		
		t1.start();
		t2.start();
		t3.start();
	}

}
