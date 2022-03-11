package com.simplilearn.accessmodifier;

import com.simplilearn.typecasting.SuperHero;

public class ProtectedAccessmodifierDemo extends SuperHero {
	
	public static void main(String[] args) {
		
		// create object
		Hero hero = new Hero();
		
		System.out.println("The Hero : "+ hero.name);
		System.out.println("The Power : "+ hero.power);
		System.out.println("The Rank : "+ hero.rank);
		
		System.out.println("-------");
		System.out.println(hero.showPower());;
		hero.printDetails();
		
		
		// create superhero object
		SuperHero superhero = new SuperHero();
		// System.out.println("The Hero : "+ superhero.name);  // compile time error
		// System.out.println("The Power : "+ superhero.power); // compile time error
		// System.out.println("The Rank : "+ superhero.rank);  // compile time error
		
		System.out.println("-------");
		ProtectedAccessmodifierDemo pamd = new ProtectedAccessmodifierDemo();
		System.out.println("The Hero : "+ pamd.name);
		System.out.println("The Power : "+ pamd.power);
		System.out.println("The Rank : "+ pamd.rank);
		
	}
}


class Hero {
	
	// protected variables
	protected int rank = 1;
	protected String power = "Healing Power";
	protected String name = "Wolworeen";
	
	// protected methods
	protected String showPower() {
		return power;
	}
	
	public void printDetails() {
		System.out.println("The hero is : "+name +" and has rank : "+rank);
	}
}