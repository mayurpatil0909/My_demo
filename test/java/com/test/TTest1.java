package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

class A {
	private static A obj = new A();

	private A() {

	}

	public static A getInstance() {
		return obj;
	}

	/*
	 Character result =  input.chars()      //string stream
             .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i))) //convert to lowercase & then to Character object
             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //store in a map with the count
             .entrySet().stream()
             .filter(entry -> entry.getValue() == 1L)
             .map(entry -> entry.getKey())
             .findFirst().get();
	 */
}


public class TTest1 {

	public static void main(String[] args) {
/*		input -> "Hello World"
		output -> "Olleh Dlrow"*/

		String str = "Hello World" ;
		System.out.println("Input -> "+ str);
		String [] strArray = str.split(" ");
		String output = "";

		for (int i = 0; i < strArray.length; i++) {
			String s = strArray[i];

			for (int j = s.length() - 1; j >= 0; j--) {
				if (j == s.length() - 1) {
					output += "" + s.toUpperCase().charAt(j);
				} else {
					output += "" + s.toLowerCase().charAt(j);
				}
			}
			output += " "; 
		}
		
		System.out.println("output -> " + output);

		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(11);
		list.add(9);
		list.add(9);
		list.add(14);
		list.add(15);
		
		//Collections.sort(list); // toDo

		// Second lowest value
		Integer i = list.stream().collect(Collectors.toSet()).stream().sorted().skip(1).findFirst().orElse(Integer.MAX_VALUE);
		System.out.println("2nd lowest value :: " + i);

	}

}
