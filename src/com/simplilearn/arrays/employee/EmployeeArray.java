package com.simplilearn.arrays.employee;

import java.util.Arrays;

public class EmployeeArray {

	public static void main(String[] args) {
		
		// create employee type array
		Employee[] empList  = new Employee[5];
		
		// insert data into employee array
		empList[0] =  new Employee(1001, "John", "Engineering", 56756.657);
		empList[1] =  new Employee(1002, "Mike", "Dev", 986756.657);
		empList[2] =  new Employee(1003, "Will", "Engineering", 56756.657);
		empList[3] =  new Employee(1004, "Nik", "Dev", 986756.657);
		empList[4] =  new Employee(1005, "Marry", "Dev", 986756.657);
		
		System.out.println("Employee at index :: 2 :: "+empList[2]);
		
		System.out.println(Arrays.toString(empList));
		System.out.println("---------------");
		// iterate over emp list
		for (int index = 0; index < empList.length; index++) {
			System.out.println(empList[index]);
		}
	}

}
