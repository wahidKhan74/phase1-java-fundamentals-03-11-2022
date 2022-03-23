package com.simplilearn.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// create a TreeMap
		TreeMap<String, Integer>  mapOfCities = new TreeMap<String, Integer>();
		
		// add values in treemap
		mapOfCities.put("Alaska", 393833);
		mapOfCities.put("New Maxico", 567656);
		mapOfCities.put("Virginia", 393833);
		mapOfCities.put("Kansas", 7876546);
		mapOfCities.put("Mumbai", 5465677);
		
		System.out.println(mapOfCities);
		
		System.out.println("Kansas city code :" + mapOfCities.get("Kansas"));
		System.out.println("Alaska city code :" + mapOfCities.get("Alaska"));

		// iterate over map
		for (Map.Entry<String, Integer> entry : mapOfCities.entrySet()) {
			System.out.println("-----------------");
			System.out.println(" Key : " + entry.getKey());
			System.out.println(" Value : " + entry.getValue());
		}

	}

}
