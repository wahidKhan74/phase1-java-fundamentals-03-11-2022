package com.simplilearn.regex;

import java.util.regex.Pattern;

public class RegExDemo2 {
	
	public static void main(String[] args) {
		
		System.out.println(Pattern.matches(".m", "Ym"));  //  true-> first char can be any value but 2nd char should be m
		System.out.println(Pattern.matches(".m", "YmYm")); // false -> length more than 2 char not allowed
		System.out.println(Pattern.matches(".m", "Yk")); // false -> first char can be any value but 2nd char should be m
		System.out.println(Pattern.matches("..m", "Ykm")); // true -> first tow char anything third should be m.
		System.out.println(Pattern.matches("m..", "mYk")); // true -> first as m then two char anything 
		System.out.println(Pattern.matches(".m.", "Ymk")); // true -> middle char as m then two char anything 
		
		System.out.println(Pattern.matches("[xyz]", "x"));  // true -> any char from xyz
		System.out.println(Pattern.matches("[xyz]", "y"));  // true -> any char from xyz
		System.out.println(Pattern.matches("[xyz]", "xy"));  // false -> any one char from xyz
		System.out.println(Pattern.matches("[xyz]", "a"));  // false -> any one char from xyz
		System.out.println(Pattern.matches("[xyz]", "abc"));  // false -> any one char from xyz
		
		System.out.println(Pattern.matches("[xyz]?", "x"));  // true -> x y and z are allowed only one time. true (one match value) 
		System.out.println(Pattern.matches("[xyz]?", "xy"));  // false -> any char from xyz
		System.out.println(Pattern.matches("[xyz]?", "xx"));  // false -> any char from xyz
		
		System.out.println(Pattern.matches("[xyz]+", "y"));  //  true (one or more than one match value).
		System.out.println(Pattern.matches("[xyz]+", "yy"));  //  true (one or more than one match value).
		System.out.println(Pattern.matches("[xyz]+", "xy"));  //  true (one or more than one match value).
		System.out.println(Pattern.matches("[xyz]+", "yzx"));  //  true (one or more than one match value).
		System.out.println(Pattern.matches("[xyz]+", "pqr"));  //  false (one or more than one match value).
		
		System.out.println(Pattern.matches("[a-z]+", "pqr")); // true  (any data from a -z small)
		System.out.println(Pattern.matches("[A-Z]+", "LMN")); // true  (any data from A -Z caps)
		System.out.println(Pattern.matches("[a-z]+", "pqrQWnm")); // false  (any data from a -z small)
		
		System.out.println(Pattern.matches("[a-zA-Z]+", "abcxyzABCPQR"));  //true  combine a-zA-Z
		System.out.println(Pattern.matches("[0-9]+", "9"));   // true
		System.out.println(Pattern.matches("[0-9]+", "92"));   // true	
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "johnSmith1213"));  // true
		
		System.out.println("----------------");
		System.out.println(Pattern.matches("\\d", "mkns")); // false => digit only
		System.out.println(Pattern.matches("\\d", "8")); // true => digit only
		System.out.println(Pattern.matches("\\D", "P")); // true => not digit only
	}
}
