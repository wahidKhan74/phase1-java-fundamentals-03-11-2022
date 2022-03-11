package com.simplilearn.accessmodifier;

import com.simplilearn.typecasting.Home;

public class DefaultAccessModifierDemo {

	public static void main(String[] args) {
		
		// create House object
		House house = new House();
		
		System.out.println("The House : "+ house.houseName);
		System.out.println("The Rooms Count : "+ house.noOfRooms);
		System.out.println("The House is Open ?? : "+ house.isOpen);
		
		// create home object
		Home home = new Home();		
		// System.out.println("The House : "+ home.name);   // compile time error
		// System.out.println("The Rooms Count : "+ home.noOfRooms);   // compile time error
		// System.out.println("The House is Open ?? : "+ home.isOpen);   // compile time error
	}

}

class House {
	
	// default variable
	int noOfRooms = 400;
	String houseName = "White House";
	boolean isOpen = false;
	
	// default method
	void showAll() {
		System.out.println("The House "+ houseName +" has no of rooms "
						+noOfRooms +" Is it open ? "+isOpen);
	}
	
}
