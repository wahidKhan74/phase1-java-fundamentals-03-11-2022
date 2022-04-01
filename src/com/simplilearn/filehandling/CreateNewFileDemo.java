package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class CreateNewFileDemo {

	public static void main(String[] args) {

		createFile("data.txt");

		// writeFile("data.txt", "Today is a friday day!");
		
		appendFile("data.txt", "Today is a week day!");
		
		// createFileFOS("test.txt", "Today is a good day!");
	}

	// Create file using File class
	private static void createFile(String filename) {

		File file = new File(filename);
		try {
			boolean response = file.createNewFile();
			if (response) {
				System.out.println("File '" + filename + "' is created successfully !");
			} else {
				System.out.println("File '" + filename + "' already exist !");
			}

		} catch (Exception e) {
			System.out.println("Exception Ocuured : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}

	// Write operation with character stream
	private static void writeFile(String filename, String data) {
		File file = new File(filename);
		try {
			// Write content to file -> FileWriter -> Character stream
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(data);
			fileWriter.close();

			System.out.println("Write Operation is completed.");
		} catch (Exception e) {
			System.out.println("Exception Ocuured : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}

	// Append operation with character stream
	private static void appendFile(String filename, String data) {
		File file = new File(filename);
		try {
			// Append content to file -> FileWriter -> Character stream
			FileWriter fileWriter = new FileWriter(file, true);
			fileWriter.append("\n"+ data);
			fileWriter.close();

			System.out.println("Append Operation is completed.");
		} catch (Exception e) {
			System.out.println("Exception Ocuured : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}
	
	// Create file using FileOutStream class
	private static void createFileFOS (String filename, String data) {
		File file = new File(filename);
		try {
			FileOutputStream fileStream = new FileOutputStream(file, true);
			//System.out.println("File '" + filename + "' is created successfully !");
			fileStream.write(data.getBytes());
			fileStream.close();
		} catch (Exception e) {
			System.out.println("Exception Ocuured : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}
}
