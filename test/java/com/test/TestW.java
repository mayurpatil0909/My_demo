package com.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestW {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(42, "PABC");
		map.put(1, "ABC");
		map.put(2,  "PQR");
		map.put(3,  "XYZ");
		map.put(4,  "ANC");
		
		map.entrySet().forEach(System.out::println);
		System.out.println(		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList()));
		System.out.println(		map.entrySet().stream().sorted(Map.Entry.comparingByKey() ).collect(Collectors.toList()));
		System.out.println(		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Integer :: doubleValue)) ).collect(Collectors.toList()));

	}

}
