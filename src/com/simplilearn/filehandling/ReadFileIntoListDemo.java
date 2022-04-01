package com.simplilearn.filehandling;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ReadFileIntoListDemo {

	public static void main(String[] args) {
		
		List<String> lines = readFileIntoList("data.txt", "/home/wahidkhan74gmai/Dell-Batch4-Workspace/phase1-java-fundamentals-03-11-2022/");
		
		// print data on console by ready line by line text
		for(String line : lines) {
			System.out.println(line);
		}
	}

	private static List<String> readFileIntoList(String filename, String path){
		List<String> lines = Collections.emptyList();
		try {
			
			lines = Files.readAllLines(Paths.get(path+filename), StandardCharsets.UTF_8);
			
		} catch (Exception e) {
			System.out.println("Exception Ocuured : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
		return lines;
	}
}
