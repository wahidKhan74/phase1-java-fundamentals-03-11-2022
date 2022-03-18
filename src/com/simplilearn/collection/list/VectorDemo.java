package com.simplilearn.collection.list;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		List<String> listOfFruits = new Vector<String>();
		List<Integer> listOfFruitsQuantity = new Vector<Integer>();
		List<Double> listOfFruitsPrices = new Vector<Double>();
		
		// add element into vector
		listOfFruits.add("Apple");
		listOfFruits.add("Orange");
		listOfFruits.add("Banana");
		listOfFruits.add("Mango");
		listOfFruits.add("Kiwi");

		System.out.println(listOfFruits);

		// access data from vector by index.
		System.out.println("Index : 3  :> " + listOfFruits.get(3));
		System.out.println("Index : 2  :> " + listOfFruits.get(2));

		// iteration over list
		Iterator<String> itr = listOfFruits.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("----------------");
		// for loop with counter
		for (int index = 0; index < listOfFruits.size(); index++) {
			System.out.println("The index : " + index + " and fruit : " + listOfFruits.get(index));
		}

		System.out.println("----------------");
		// enhanced for loop : for each
		for (String fruit : listOfFruits) {
			System.out.println("The fruit : " + fruit);
		}
	}

}
