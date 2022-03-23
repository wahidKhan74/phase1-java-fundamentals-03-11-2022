package com.simplilearn.collection.queue.employee;

import java.util.ArrayDeque;
import java.util.Queue;

import com.simplilearn.collection.set.employee.Employee;

public class EmployeeQueue {

	public static void main(String[] args) {

		// create employee objects
		Employee employee1 = new Employee(1001, "John Smith", "Engineering", 56456.567);
		Employee employee2 = new Employee(1002, "Marry Joe", "HR", 896456.567);
		Employee employee3 = new Employee(1003, "Kim Smith", "HR", 16456.567);
		Employee employee4 = new Employee(1004, "Will Smith", "Engineering", 57856.567);
		Employee employee5 = new Employee(1005, "Aria Stark", "Operations", 99056.567);
		
		// create a employee queue
		Queue<Employee> employeeQueue = new ArrayDeque<Employee>();
		
		employeeQueue.add(employee1);
		employeeQueue.add(employee2);
		employeeQueue.add(employee3);
		employeeQueue.add(employee4);
		employeeQueue.add(employee5);
		
		for(Employee emp : employeeQueue) {
			System.out.println("-----------");
			System.out.println(emp.id);
			System.out.println(emp.name);
			System.out.println(emp.salary);
			System.out.println(emp.dept);
		}
	}

}
