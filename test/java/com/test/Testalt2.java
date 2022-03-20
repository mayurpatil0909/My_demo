package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Testalt2 {

	public static void main(String[] args) {

		//list ::  1,1,1,1,1,,4,4,4,6,,7,8,
		List<Integer> list = new ArrayList<Integer>();

		list.add(9);
		list.add(1);
		list.add(55);
		list.add(1);
		list.add(1);
		list.add(55);

		Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		List<Map.Entry<Integer, Long>> sortedmap = new LinkedList<Map.Entry<Integer,Long>>(map.entrySet());
		
		Collections.sort(sortedmap, (a, b) -> a.getValue().compareTo(b.getValue()));

		
		map.entrySet().stream().sorted((a, b) -> a.getValue().compareTo(b.getValue()) );
		
		System.out.println("map :: " + map);
		
		
		
	}

}
