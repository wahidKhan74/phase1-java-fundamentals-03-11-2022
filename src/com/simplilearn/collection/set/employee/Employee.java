package com.simplilearn.collection.set.employee;

public class Employee  implements Comparable<Employee>{
	
	public int id;
	public String name;
	public String dept;
	public double salary;
	
	// constructor
	public Employee() {}
	
	public Employee(int id, String name, String dept, double salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.id - o.id;
	}

	
	
}
