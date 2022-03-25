package com.simplilearn.multithreading;

public class CompanyThread {

	public static void main(String[] args) {
		// create a bob object
		Bob bob = new Bob();  // this is not thread
		// create a thread instance
		Thread  t1 = new Thread(bob);   // using the constructor Thread(Runnable r)  
		t1.run();
		

		Thread t2 = new Thread(new Will());  // using the constructor Thread(Runnable r)  
		t2.start();
	}

}

class Work {
	
	public String status ="Inprogress";
	
	public String updateStatus(String status) {
		return this.status = status;
	}
}

// Java Thread creation by implementing Runnable interface
class Bob extends Work implements Runnable {

	@Override
	public void run() {
		System.out.println("Bob Thread is running ...");
	}
}

class Will implements Runnable {

	@Override
	public void run() {
		System.out.println("Will Thread is running ...");
	}
}