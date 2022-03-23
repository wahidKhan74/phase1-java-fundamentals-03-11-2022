package com.simplilearn.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		// create a LinkedHashMap
		Map<String, Double> mapOfItems = new LinkedHashMap<String, Double>();

		// add values
		mapOfItems.put("Orange", 45.09);
		mapOfItems.put("Apple", 76.56);
		mapOfItems.put("Kiwi", 99.56);
		mapOfItems.put("Banana", 16.56);
		mapOfItems.put("Mango", 146.56);
		mapOfItems.put("Grapes", 46.56);

		System.out.println(mapOfItems);

		System.out.println("Kiwi price :" + mapOfItems.get("Kiwi"));
		System.out.println("Mango price :" + mapOfItems.get("Mango"));

		// iterate over map
		for (Map.Entry<String, Double> entry : mapOfItems.entrySet()) {
			System.out.println("-----------------");
			System.out.println(" Key : " + entry.getKey());
			System.out.println(" Value : " + entry.getValue());
		}
	}

}
