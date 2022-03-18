package com.simplilearn.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// List -> Order collection of data with duplicates elements.
		// List (interface) -> imp classes -> ArrayList, LinkedList , Vector , Stack
		
		// list decleraction
		List<String> list1 = new ArrayList<String>();  // arraylist backed by dynamic array, not thread safe, read operations
		List<String> list2 = new LinkedList<String>(); //backed by doubly linkedlist ,not thread safe, -> insert, delete,replace
		List<String> list3 = new Vector<String>();  // backed by dynamic array, thread safe, read operations
		List<String> list4 = new Stack<String>();  //  backed by dynamic array, thread safe, read operations
		
		// user list
		List userList = new ArrayList();
		
		// insert data into users list
		userList.add("Bob");
		userList.add("Mike");
		userList.add("Will");
		userList.add(56.67);
		userList.add(true);
		
		
		System.out.println(userList);
		System.out.println("The element at index 2 : "+userList.get(2));
		System.out.println("The element at index 4 : "+userList.get(4));
		
		System.out.println("----------------");
		userList.add(2, "Mark");
		System.out.println(userList);
		
		System.out.println("----------------");
		//iteration over list
		Iterator itr = userList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
