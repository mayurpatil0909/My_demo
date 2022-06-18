package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class TestMapOrder {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap <>();
		map.put("A", 1);
		map.put("E", 2);
		map.put("B", 4);
		map.put("d", 3);
		map.put("z", 0);
		map.put("C", 2);

		Map<String, Integer> treemap = new HashMap <>(map);

		List<Entry<String, Integer>> list = new LinkedList<Map.Entry<String,Integer>>(map.entrySet());
		Collections.sort(list, (a, b) -> b.getKey().compareTo(a.getKey()));
		System.out.println(" list :: " + list);  /// z,E,d,B,C,A

		
		map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByKey().reversed())
		.forEach(System.out::print);
		
		List<Entry<String, Integer>> list1 = map.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByKey().reversed()).collect(Collectors.toList());		
		
		List<Integer> intList = Arrays.asList(1, 2, 4, 5, 1, 7, 5, 1, 9, 10);
		intList. stream().distinct().collect(Collectors.toList());
		intList.stream().collect(Collectors.toSet());
		

/*
Employee
Id		Name			Dob				Salary		status
-------------------------------------------------------------
1		Richard			25-01-1989		3000		Active
2		Robin			25-01-1989		4000		Active
3		Peterson		25-01-1989		5000		Active
4		Jackson			25-01-1989		6000		Active
5		Mashood			25-01-1989		5000		Active
6		Raman			25-01-1989		5000		Active
7		Robin			25-01-1989		4000		Active		 * 

*/
	
		
// SQL:		
// Select distinct name, dob, salary from Employee ;

		
// Java 
// list.stream().distinct().collect(Collections.toList()) ;
		
		
// Select name, dob, salary from Employee group by name, dob, salary having count(*) > 1 ;

		

	}

}
