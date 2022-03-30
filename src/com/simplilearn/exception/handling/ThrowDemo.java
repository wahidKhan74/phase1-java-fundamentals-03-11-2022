package com.simplilearn.exception.handling;

public class ThrowDemo {

	public static void main(String[] args) {
		// throw :- throw keyword is used to throw an exception

//		ageValidator(20);
//		try {
//			ageValidator(10);
//		} catch (RuntimeException ex) {
//			System.out.println("-----------------");
//			System.out.println("Exception Occured ! " + ex.getClass());
//			System.out.println("Exception Message : " + ex.getMessage());
//			System.out.println("-----------------");
//		}
//		
//		ageValidator(30);
		
		ageCalculator(1990);
		try {
			ageCalculator(-1990);
		} catch (RuntimeException ex) {
			System.out.println("-----------------");
			System.out.println("Exception Occured ! " + ex.getClass());
			System.out.println("Exception Message : " + ex.getMessage());
			System.out.println("-----------------");
		}		
		ageCalculator(1890);
	}

	public static void ageValidator(int age) {
		if(age>18) {
			System.out.println("Your age is a valid age "+age);
			System.out.println("Welcome to online voting !");
		} else {
			throw new RuntimeException(age + " Not a valid age !");
		}
	}
	
	public static void ageCalculator(int yearOfBith) {
		if(yearOfBith > 0 ) {
			int currentYear = 2022;
			int age = currentYear - yearOfBith;
			System.out.println("Your age  :  "+age);
		} else {
			throw new RuntimeException(yearOfBith + " Not a valid year !");
		}
	}
}
