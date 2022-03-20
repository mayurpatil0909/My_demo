package com.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestTT {

	public static void main(String[] args) {

		// Given a String, find the first non-repeated character in it using Stream functions?
		String input = "Java Coding Round is Awesome";

		Map<Character, Long> chMap = input.chars().mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap :: new, Collectors.counting()));

		Character result =  input.chars()      //string stream
	             .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))   //convert to lowercase & then to Character object
	             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap :: new, Collectors.counting())) //store in a map with the count
	             .entrySet().stream()
	             .filter(entry -> entry.getValue() == 1L)
	             .map(entry -> entry.getKey())
	             .findFirst().get();

		System.out.println(" result :: " + result); 
		

		// find the first repeated elememt
		// Input:  arr[] = {10, 5, 3, 4, 3, 5, 6} ;
		
		
	}

}
