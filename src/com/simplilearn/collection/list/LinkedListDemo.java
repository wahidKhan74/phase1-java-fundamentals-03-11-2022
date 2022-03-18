package com.simplilearn.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		List<String> listOfCities = new LinkedList<String>();

		// add element in linked list
		listOfCities.add("New York");
		listOfCities.add("LA");
		listOfCities.add("New York");
		listOfCities.add("California");
		listOfCities.add("Hawai");
		listOfCities.add("Mumbai");

		System.out.println(listOfCities);

		System.out.println("Index : 3  :>" + listOfCities.get(3));

		System.out.println("----------------");
		// iteration over list
		Iterator<String> itr = listOfCities.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("----------------");
		// for loop with counter
		for (int index = 0; index < listOfCities.size(); index++) {
			System.out.println("The index : "+index +" and city : "+ listOfCities.get(index));
		}
		
		System.out.println("----------------");
		// enhanced for loop : for each
		for(String city : listOfCities) {
			System.out.println("The city : "+ city);
		}
	}

}
