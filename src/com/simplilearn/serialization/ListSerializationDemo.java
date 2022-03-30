package com.simplilearn.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class ListSerializationDemo {

	public static void main(String[] args) {
		// create a list of employee object
		List<Employee> list = new LinkedList<Employee>();

		// add employees into list
		list.add(new Employee(1001, "John Smith", "Engineering", 866756.567));
		list.add(new Employee(1002, "Marry Smith", "HR", 166756.567));
		list.add(new Employee(1003, "Will Smith", "Dev", 566756.567));
		list.add(new Employee(1004, "Aria Smith", "HR", 446756.567));
		list.add(new Employee(1005, "Noah Smith", "Engineering", 1236756.567));

		// step 2:create a byte stream
		try {
			// create a file out stream
			FileOutputStream file = new FileOutputStream("list-db.txt");

			// create an object stream
			ObjectOutputStream out = new ObjectOutputStream(file);

			// method to serialize object
			out.writeObject(list);

			System.out.println("Serialization is completed !");

			out.close();
			file.close();
		} catch (Exception e) {
			System.out.println("Exception Ocuured : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}

	}

}
