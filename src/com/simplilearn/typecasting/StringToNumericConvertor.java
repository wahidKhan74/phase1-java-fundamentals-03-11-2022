package com.simplilearn.typecasting;

public class StringToNumericConvertor {

	public static void main(String[] args) {

		// String to numeric convert only convertible value
		String price = "123"; // convertible value
		String amount = "123abz"; // non convertible value (NumberFormatException)

		int intPrice = Integer.parseInt(price); // string -> int

		long longPrice = Long.parseLong(price); // string -> long

		double doublePrice = Double.parseDouble(price); // string -> double

		float floatPrice = Float.parseFloat(price); // string -> float
		
		
		// float floatPrice2 = Float.parseFloat(amount); // string -> float

		System.out.println("Integer Price : " + intPrice);
		System.out.println("Double Price : " + doublePrice);
		System.out.println("Long Price : " + longPrice);
		System.out.println("Float Price : " + floatPrice);
	}
}
