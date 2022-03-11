package com.simplilearn.typecasting;

public class SuperHero {
	
	// protected variables
	protected int rank =21;
	protected String power = "Tech Power";
	protected String name = "Iron Man";

	// protected methods
	protected String showPower() {
		return power;
	}
	public void printDetails() {
		System.out.println("The hero is : " + name + " and has rank : " + rank);
	}
}
