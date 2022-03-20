package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestNe {

	private void test() {
		Integer [] arra = {1, 12, 45, 78, 55, 41, 75, 36, 99};
		
		List<Integer> list = Arrays.asList(arra); // 2nd highest

		Integer highestInt = list.stream().sorted().skip(list.size()-2).findFirst().get();
		
		System.out.println("highestInt :: " + highestInt );

/*
		i = temp
		i+1 = i
		temp = i+1;
*/		
	}

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>() ;
		/*lsit.add
		{ "aaa", "bcd", "ade" }
		
		[ 0, 2, 1, 1,7,7,7,5,8,8,8]
		*/

		list.stream().filter(x -> x. startsWith("a")  ).collect(Collectors.toList());
		
		list.stream().collect(Collectors.toSet());
		list.stream(). distinct().collect(Collectors.toList()) ;

		
	}

}
