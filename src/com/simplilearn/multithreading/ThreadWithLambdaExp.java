package com.simplilearn.multithreading;

public class ThreadWithLambdaExp {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			System.out.println("Thread One is running ..."+ Thread.currentThread().getName());
		});
		t1.start();

		Thread t2 = new Thread(() -> {
			System.out.println("Thread Two is running ..."+ Thread.currentThread().getName());
		});
		t2.start();

	}

}