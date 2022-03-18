package com.simplilearn.arrays;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		// arrays is an ordered collection of similar type of data elements.
		int[] numbers = new int[10];
		
		// add values 
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		numbers[5] = 60;
		
		numbers[9] = 600;
		// access data from arrays by index
		System.out.println("The value at index 3 -> "+numbers[3]);
		System.out.println("The value at index 5 -> "+numbers[5]);
		System.out.println("The value at index 6 -> "+numbers[6]);
		
		System.out.println("The value at last index (length-1) -> "+numbers[numbers.length-1]);
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("---------------------");
		// access element with iteration
		for (int index = 0; index < numbers.length; index++) {
			System.out.println("Element at index : "+index + " value : "+numbers[index]);
		}
		
	}

}
