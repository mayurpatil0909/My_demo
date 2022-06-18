package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

interface AA {
	public String m1(String s);
}

public class TestFunInterface {

	public static void main(String[] args) {
		AA obj = (s) -> {
			System.out.println("m1() is pringting :: "+ s);
			return s;
		};
		obj.m1("Mayur");

		String str = "APPLE BANANA BANANA APPLE CAKE BANANA";
		String[] strArray = str.split(" ");
		List<String> arrList = Arrays.asList(strArray);
		

		System.out.println( " strArray :: " + strArray.length);	

		Map<String, Integer> map = new HashMap <>();
		for (int i = 0; i < strArray.length; i++) {
			Integer count = 0 ;
			String s = strArray[i];
			
			if (map.containsKey(s)) {
				count = map.get(s);
			}
			map.put(s, count+1);
		}

		List<Integer> intList = Arrays.asList(1, 2, 5, 2, 9, 8,9);
		
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String,Integer>>(map.entrySet());
		Collections.sort(list, (a, b) -> b.getValue().compareTo(a.getValue())); ;
		System.out.println(" list :: " + list );

//		arrList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().sorted(Comparator.);
		
	}

}
