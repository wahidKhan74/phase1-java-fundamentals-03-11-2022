package com.simplilearn.filehandling;

import java.io.File;

public class DeleteFileDemo {

	public static void main(String[] args) {
		
		deleteFile("data.txt");
		deleteFile("test.txt");
	}
	
	private static void deleteFile(String filename) {
		File file = new File(filename);
		try {
			if(file.exists()) {
				boolean response = file.delete();
				if(response) {
					System.out.println("File '" + filename + "' is deleted successfully !");
				} else {
					System.out.println("Failed to delete '" + filename + "' file.");
				}
			} else {
				System.out.println("File '" + filename + "' does not exist !");
			}
		} catch (Exception e) {
			System.out.println("Exception Ocuured : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}
}
