package com.simplilearn.exception.handling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		System.out.println("Program started ...");
		try {
			// logic under observation for exception
			int balance = 54656;
			int amount = 50;
			int result = balance / amount;
			System.out.println("Result Balance :: "+result);
			
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Occured and handled ");
			System.out.println("Exception Class :: "+e.getClass());
			System.out.println("Exception Message :: "+e.getMessage());
			// e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception Occured and handled ");
			System.out.println("Exception Class :: "+e.getClass());
			System.out.println("Exception Message :: "+e.getMessage());
			// e.printStackTrace();
		} finally {
			System.out.println("Aways running !");
		}
		
		System.out.println("Program is ended ...");
	}

}
