package com.simplilearn.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		// Set is child interface in Collection
		// Set do not store duplicate values
		// Implementation class : HashSet , LinkendHashSet, TreeSet.

		// Set Declaration
		Set<String>  set1 = new HashSet<String>();  // unique elements + no insertion order.
		Set<String>  set2 = new LinkedHashSet<String>();   // unique elements + insertion order.
		Set<String>  set3 = new TreeSet<String>();   // unique elements + order by values in asc order.
		
		
		Set<String> setOfUniqueCompanies = new HashSet<String>();
		
		setOfUniqueCompanies.add("DELL");
		setOfUniqueCompanies.add("WIPRO");
		setOfUniqueCompanies.add("SIMPLILEARN");
		setOfUniqueCompanies.add("GOOGLE");
		setOfUniqueCompanies.add("DELL");
		setOfUniqueCompanies.add("MICROSOFT");
		
		System.out.println(setOfUniqueCompanies);
		
		System.out.println("-------------------");
		// set iteration with iterator
		Iterator<String> itr = setOfUniqueCompanies.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-------------------");
		// set iteration with for each
		for(String comp: setOfUniqueCompanies) {
			System.out.println("The Comp :: "+comp);
		}
	}

}
