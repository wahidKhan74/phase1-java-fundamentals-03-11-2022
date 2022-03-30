package com.simplilearn.exception.handling;

public class ExceptionHandlingWithMethods {

	public static void main(String[] args) {

//		transaction(10);
//		transaction(0);
//		transaction(5);

//		lengthCalculator("Today is a wonderfull day !");
//		lengthCalculator(null);
//		lengthCalculator("Today is a good day !");

//		numberConvertor("34568");
//		numberConvertor("348abc");
//		numberConvertor("878");

		multiTask("34545", 67);

		multiTask("Today is a good day!", 67);
		multiTask("67867", 0);
		multiTask(null, 10);
	}

	private static void transaction(int userCount) {
		try {
			int totalBlance = 50000;
			int result = totalBlance / userCount;
			System.out.println("Result : " + result);
		} catch (ArithmeticException ex) {
			System.out.println("-----------------");
			System.out.println("Exception Occured ! " + ex.getClass());
			System.out.println("Exception Message : " + ex.getMessage());
			System.out.println("Rollback !");
			System.out.println("-----------------");
		}
	}

	private static void lengthCalculator(String data) {
		try {
			int length = data.length();
			System.out.println("Input data string length : " + length);
		} catch (NullPointerException ex) {
			System.out.println("-----------------");
			System.out.println("Exception Occured ! " + ex.getClass());
			System.out.println("Exception Message : " + ex.getMessage());
			System.out.println("-----------------");
		}
	}

	private static void numberConvertor(String data) {
		try {
			int result = Integer.parseInt(data);
			System.out.println("Result  : " + result);
		} catch (NumberFormatException ex) {
			System.out.println("-----------------");
			System.out.println("Exception Occured ! " + ex.getClass());
			System.out.println("Exception Message : " + ex.getMessage());
			System.out.println("-----------------");
		}
	}

	private static void multiTask(String data, int number) {
		try {
			float result = 2000 / number;
			int length = data.length();
			int response = Integer.parseInt(data);

			System.out.println("Result : " + result);
			System.out.println("Str length : " + length);
			System.out.println("Converted number  : " + response);
		} catch (ArithmeticException ex) {
			System.out.println("-----------------");
			System.out.println("Exception Occured ! " + ex.getClass());
			System.out.println("Exception Message : " + ex.getMessage());
			System.out.println("-----------------");
		} catch (NumberFormatException ex) {
			System.out.println("-----------------");
			System.out.println("Exception Occured ! " + ex.getClass());
			System.out.println("Exception Message : " + ex.getMessage());
			System.out.println("-----------------");
		} catch (NullPointerException ex) {
			System.out.println("-----------------");
			System.out.println("Exception Occured ! " + ex.getClass());
			System.out.println("Exception Message : " + ex.getMessage());
			System.out.println("-----------------");
		} catch (Exception ex) {
			System.out.println("-----------------");
			System.out.println("Exception Occured ! " + ex.getClass());
			System.out.println("Exception Message : " + ex.getMessage());
			System.out.println("-----------------");
		}

	}
}
