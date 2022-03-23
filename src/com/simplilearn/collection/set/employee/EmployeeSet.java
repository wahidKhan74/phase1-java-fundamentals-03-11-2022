package com.simplilearn.collection.set.employee;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeSet {

	public static void main(String[] args) {
		
		// create employee objects
		Employee employee1 = new Employee(1001, "John Smith", "Engineering", 56456.567);
		Employee employee2 = new Employee(1002, "Marry Joe", "HR", 896456.567);
		Employee employee3 = new Employee(1003, "Kim Smith", "HR", 16456.567);
		Employee employee4 = new Employee(1004, "Will Smith", "Engineering", 57856.567);
		Employee employee5 = new Employee(1005, "Aria Stark", "Operations", 99056.567);

		
		// create a set of employees
		Set<Employee> empSet = new LinkedHashSet<Employee>();
		
		// add employees into set
		empSet.add(employee1);
		empSet.add(employee2);
		empSet.add(employee3);
		empSet.add(employee4);
		empSet.add(employee1);
		empSet.add(employee5);
		
		empSet.remove(employee3);
		
		System.out.println(empSet);
		System.out.println("-----------------------");
		Iterator<Employee> itr = empSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----------------------");
		TreeSet<Employee> treeSet =  new TreeSet<Employee>();
		for(Employee emp : empSet) {
			treeSet.add(emp);
		}
		System.out.println(treeSet);
	}
}
