package com.simplilearn.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		// user list array list with type safety
		List<String> userList = new ArrayList<String>();

		// insert data into users list
		userList.add("Bob");
		userList.add("Mike");
		userList.add("Will");
		userList.add("Kim");
		userList.add("Sam");
		
		System.out.println(userList);
		//access data by index
		System.out.println("The element at index 2 : " + userList.get(2));
		System.out.println("The element at index 4 : " + userList.get(4));

		System.out.println("----------------");
		// add data at specific index 
		userList.add(2, "Mark");
		System.out.println(userList);

		System.out.println("----------------");
		
		// iteration over list
		Iterator<String> itr = userList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("----------------");
		// for loop with counter
		for (int index = 0; index < userList.size(); index++) {
			System.out.println("The index : "+index +" and username : "+ userList.get(index));
		}
		
		System.out.println("----------------");
		// enhanced for loop : for each
		for(String name : userList) {
			System.out.println("The name : "+ name);
		}
	}

}
