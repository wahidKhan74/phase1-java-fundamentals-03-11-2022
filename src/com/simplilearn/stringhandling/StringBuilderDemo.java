package com.simplilearn.stringhandling;

public class StringBuilderDemo {

	public static void main(String[] args) {

		// StringBuilder is allow to create a mutable string.
		// String builder is not tread safe : String builder can be used under multi
		// thread env.
		// It is faster

		StringBuilder text = new StringBuilder("Today is wonderfull day !");
		System.out.println(text);

		// string modification
		// append operation
		text.append(" Happy Learning !");
		System.out.println(text);

		// replace text
		text.replace(0, 1, "t");
		System.out.println(text);

		// delete text
		text.delete(0, 26);
		System.out.println(text);
	
		// insert text
		text.insert(0, "Welcome, ");
		System.out.println(text);
		
		
		StringBuilder str = new StringBuilder();
		
		// StringBuilder and String Buffer ensureCapacity 
		// helps us to ensures the capacity is at least equal to the specified 
		// inital value is 16  -> lesser than 44  -> double initial capacity + 2.
		//   // returns twice oldcapacity*2+2  
		
		System.out.println(str.capacity());
		
		str.ensureCapacity(18);
		
		System.out.println(str.capacity());
		
	}

}
