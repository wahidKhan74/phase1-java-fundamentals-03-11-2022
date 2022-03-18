package com.simplilearn.methods;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("-----------------------------------");
		System.out.println(" :: Welcome to Arithmatic Calculator :: ");
		System.out.println(" :: Calculator Name : " + Operation.calculatorName);
		System.out.println(" :: Calculator Input Count : " + Operation.noOfInput);		
		System.out.println("-----------------------------------");
		
		// create object of Operation
		Operation operation = new Operation();
		
		// step 1. collect input from user console.
		Scanner input = new Scanner(System.in);
		
		System.out.println(" :: Enter a number 1 vaule :: ");		
		int x =  input.nextInt();
		
		System.out.println(" :: Enter a number 2 vaule :: ");		
		int y =  input.nextInt();
		
		float result1 = operation.add(x, y);
		System.out.println("The addition is : " + result1);
		
		short result2 = operation.sub(x, y);
		System.out.println("The substraction is : " + result2);
		
		float result3 = operation.mul(x, y);
		System.out.println("The multiplication is : " + result3);
		
		float result4 = Operation.div(x, y);
		System.out.println("The division is : " + result4);
		
		double result5 = Operation.avg(x, y);
		System.out.println("The Avg is : " + result5);
		
		input.close();
	}
	

}


class Operation {
	
	public static String calculatorName ="Basic Calculous";
	public static int noOfInput = 2;
	
	// Addition
	public float add(int num1 , int num2) {
		return num1 + num2;
	}
	
	// Subtraction
	public short sub(int num1 , int num2) {
		return (short) (num1 - num2);
	}
	
	// Multiplication
	public float mul(int num1 , int num2) {
		return num1 * num2;
	}
	
	// Division
	public static float div(int num1 , int num2) {
		return num1 / num2;
	}
	
	// Avg
	public static double avg(int num1 , int num2) {
		return (num1 +num2) / 2;
	}
	
	// public Operation() {}
}