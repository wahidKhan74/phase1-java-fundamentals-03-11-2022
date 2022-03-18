package com.simplilearn.methods;

public class MethodDemo {

	public static void main(String[] args) {
		
		// method calling
		MethodDemo demo = new MethodDemo();
		demo.showMessage();
		
		demo.displayAuthor("John Smith");
		demo.displayAuthor("Will Smith");		
		
		demo.ageCalculator(1990);
		demo.ageCalculator(1980);
		demo.ageCalculator(1994);
		
		System.out.println("-------------");
		demo.retirementCalculator("John Smith", 1880);
		System.out.println("-------------");
		demo.retirementCalculator("Will Smith", 1970);
	}
	
	// user defined methods
		 // 1. non parameterized method
		 // 2. parameterized method
	
	// method deceleration
	// non parameterized method
	public void showMessage() {
		System.out.println("Welcome to java methods.");
	}
	
	// one parameterized method
	public void displayAuthor(String author) {
		System.out.println("The Author : "+author);
	}
	
	public int ageCalculator(int yearOfBirth) {
		int currentYear = 2022;
		int age = currentYear - yearOfBirth;
		System.out.println("The user age is : "+age);
		return age;
	}
	
	// multi parameter method
	public void retirementCalculator(String username , int yearBirth) {
		int refAge = 60;
		int age = ageCalculator(yearBirth);
		if(age >= refAge) {
			System.out.println("Hi , '"+username +"' you are already retired.");
		} else {
			System.out.println("Hi , '"+username +"' you have "+(refAge-age) +" for your retirement.");
		}
	}
	
}
