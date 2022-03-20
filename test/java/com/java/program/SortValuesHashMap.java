package com.java.program;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortValuesHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> unsortedMap = new HashMap<>();

		unsortedMap.put("User G", 55);
		unsortedMap.put("User A", 1);
		unsortedMap.put("User B", 542);
		unsortedMap.put("User P", 46);
		unsortedMap.put("User K", 82);

		System.out.println("unsortedMap:: " + unsortedMap);

		Map<String, Integer> mapSortByKey = unsortedMap.entrySet().stream()
		.sorted(Map.Entry.comparingByKey())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
		(oldValue, newValue) -> oldValue, LinkedHashMap ::new));
		
		System.out.println("mapSortByKey :: " + mapSortByKey);


/*		Map<String, Integer> mapSortByValue = unsortedMap.entrySet().stream()
		.sorted(Map.Entry.comparingByKey()   ) 			
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
		(oldValue, newValue) -> oldValue, LinkedHashMap ::new));
*/

	}

}
