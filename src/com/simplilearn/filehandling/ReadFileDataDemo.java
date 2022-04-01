package com.simplilearn.filehandling;

import java.io.FileInputStream;
import java.io.FileReader;

public class ReadFileDataDemo {

	public static void main(String[] args) {
		
//		readFile("data.txt");
		
		readFileFIS("data.txt");
	};
	
	// Read operation with character stream
	private static void readFile(String filename) {
		try {
			 // Creates a reader using the FileReader
			FileReader fileReader = new FileReader(filename);
			
			int c = 0;
			while((c = fileReader.read()) != -1){
				System.out.print((char)c);
			}
			
			fileReader.close();
		} catch (Exception e) {
			System.out.println("Exception Ocuured : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}
	// Read operation with file input stream
	private static void readFileFIS(String filename) {
		try {
			 // Creates a reader using the FileInputStream 
			FileInputStream stream = new FileInputStream(filename);
			
			int c = 0;
			while((c = stream.read()) != -1){
				System.out.print((char)c);
			}
			
			stream.close();
		} catch (Exception e) {
			System.out.println("Exception Ocuured : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}

}
