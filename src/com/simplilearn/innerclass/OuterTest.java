package com.simplilearn.innerclass;

public class OuterTest {

	// data variables
	private double amount = 45456.56;
	private String message = "Today is a good day!";
	
	// inner class : non static inner class
	class InnerTest {
		
		private String data = "Hello & Welcome";
		private String username = "John SMith";
		
		public void showData() {
			System.out.println("Inner Class :: data : " + data);
			System.out.println("Inner Class :: username : " + username);
			System.out.println("Outer Class :: amount "+ amount);
			System.out.println("Outer Class :: message "+ message);
		}
	}	
	
	public static void main(String[] args) {
		
		// create outer class object
		OuterTest outer = new OuterTest();
		
		//create  inner class object from outer class object
		InnerTest inner = outer.new InnerTest();
		
		inner.showData();		
	}

}
