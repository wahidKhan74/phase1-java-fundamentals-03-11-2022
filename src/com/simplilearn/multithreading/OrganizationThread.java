package com.simplilearn.multithreading;

public class OrganizationThread {

	public static void main(String[] args) {

		// create a john thread
		John t1 = new John();
		t1.start();

		// create a mike thread
		Mike t2 = new Mike();
		t2.start();

		// create a sam thread
		Sam t3 = new Sam();
		t3.start();
	}

}

// Java Thread Example by extending Thread class
class John extends Thread {

	@Override
	public void run() {
		System.out.println("John Thread is running ...");
	}
}

class Mike extends Thread {

	@Override
	public void run() {
		System.out.println("Mike Thread is running ...");
	}
}

class Sam extends Thread {

	@Override
	public void run() {
		System.out.println("Sam Thread is running ...");
	}
}
