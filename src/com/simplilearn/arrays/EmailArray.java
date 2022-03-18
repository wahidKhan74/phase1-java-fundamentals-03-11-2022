package com.simplilearn.arrays;

public class EmailArray {

	public static void main(String[] args) {
		
		// empty array
		// String email[] = new String[5];
		
		// arrays with default values
		String emails[] = {"john@gmail.com","will@gmail.com","smith@gmail.com","marry@gmail.com"};
		
		System.out.println("Size :: "+emails.length);
		
		System.out.println("Email at index 1 :: "+emails[1]);
		System.out.println("Email at index 3 :: "+emails[3]);
		
		// System.out.println("Email at index 4 :: "+emails[4]); // ArrayIndexOutOfBoundsException
		
		System.out.println("------------");
		// iterate over emails
		for (int index = 0; index < emails.length; index++) {
			System.out.println("Element at index : " + index + " value : " + emails[index]);
		}
	}

}
