package com.simplilearn.exception.handling;

public class ThrowsDemo {

	public static void main(String[] args) {
		
		// throws : throws keyword is used to declare exception.

		try {
			ageCalculator(1990);
		} catch (Exception ex) {
			System.out.println("-----------------");
			System.out.println("Exception Occured ! " + ex.getClass());
			System.out.println("Exception Message : " + ex.getMessage());
			System.out.println("-----------------");
		}
		
		try {
			ageCalculator(-1990);
		} catch (Exception ex) {
			System.out.println("-----------------");
			System.out.println("Exception Occured ! " + ex.getClass());
			System.out.println("Exception Message : " + ex.getMessage());
			System.out.println("-----------------");
		}
		
		
		try {
			ageCalculator(2002);
		} catch (Exception ex) {
			System.out.println("-----------------");
			System.out.println("Exception Occured ! " + ex.getClass());
			System.out.println("Exception Message : " + ex.getMessage());
			System.out.println("-----------------");
		}
	}

	public static void ageCalculator(int yearOfBith) throws Exception {
		if(yearOfBith > 0 ) {
			int currentYear = 2022;
			int age = currentYear - yearOfBith;
			System.out.println("Your age  :  "+age);
		} else {
			throw new Exception(yearOfBith + " Not a valid year !");
		}
	}
}
