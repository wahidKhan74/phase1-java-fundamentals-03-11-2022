package com.simplilearn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		
		String data = "Pm";
		
		// pattern : evaluate only one char & second char in string should be m
		Pattern pattern = Pattern.compile(".m");
		
		// matcher 
		Matcher matcher = pattern.matcher(data);
		
		boolean result = matcher.matches();
		
		System.out.println("String Data Pattern is Match => "+result);
		
		System.out.println("2nd approach --------------");		
		
		boolean result2 =  Pattern.compile(".n").matcher("Nx").matches();
		System.out.println("Result 2  : " +result2);
		
		System.out.println("3rd Approach --------------");
		
		boolean result3 = Pattern.matches(".m", "Ym");
		System.out.println("Result 3  : " +result3);

	}

}
