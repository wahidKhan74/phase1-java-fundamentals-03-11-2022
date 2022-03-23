package com.simplilearn.collection.map.employee;

import java.util.LinkedHashMap;
import java.util.Map;

public class EmployeeMap {

	public static void main(String[] args) {

		// create employee objects
		Employee employee1 = new Employee(1001, "John Smith", "Engineering", 56456.567);
		Employee employee2 = new Employee(1002, "Marry Joe", "HR", 896456.567);
		Employee employee3 = new Employee(1003, "Kim Smith", "HR", 16456.567);
		Employee employee4 = new Employee(1004, "Will Smith", "Engineering", 57856.567);
		Employee employee5 = new Employee(1005, "Aria Stark", "Operations", 99056.567);

		// create an employee map
		Map<Integer, Employee> employeeMap = new LinkedHashMap<Integer, Employee>();

		// add employee object
		employeeMap.put(1001, employee1);
		employeeMap.put(1002, employee2);
		employeeMap.put(1003, employee3);
		employeeMap.put(1004, employee4);
		employeeMap.put(1005, employee5);

		System.out.println(employeeMap);

		System.out.println("--------------");
		System.out.println("Employee 1001 :> " + employeeMap.get(1001));
		System.out.println("Employee 1005 :> " + employeeMap.get(1005));

		// iterate over map
		for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
			System.out.println("-----------------");
			System.out.println(" Key : " + entry.getKey());
			System.out.println(" Value : " + entry.getValue());
		}

	}

}
