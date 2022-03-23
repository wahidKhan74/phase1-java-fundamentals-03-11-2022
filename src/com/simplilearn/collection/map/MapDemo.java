package com.simplilearn.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		// Map is java collection stores data as key(unique) and value pair
		Map<String, String>  map1 = new HashMap<>(); // store key value pair + no insertion order
		Map<String, String>  map2 = new LinkedHashMap<>(); // store key value pair +  insertion order
		Map<String, String>  map3 = new TreeMap<>(); // store key value pair + order by key -> asc keys
		
		
		Map<String, Long>  phonebook = new HashMap<String, Long>();
		
		// add key value pair inside map
		phonebook.put("John", 4564903435L);
		phonebook.put("Mike", 8964903435L);
		phonebook.put("William", 2364903435L);
		phonebook.put("Marry", 1064903435L);
		phonebook.put("Aria", 9964903435L);
		
		// print map
		System.out.println(phonebook);
		
		System.out.println("William's number :: "+phonebook.get("William"));
		System.out.println("Mike's number :: "+phonebook.get("Mike"));
		
		// iterate over map
		for(Map.Entry<String, Long> entry : phonebook.entrySet()) {
			System.out.println("-----------------");
			System.out.println(" Key : "+entry.getKey());
			System.out.println(" Value : "+entry.getValue());
		}
		
	}
		

}
