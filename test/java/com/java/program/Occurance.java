package com.java.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Occurance {

	private static HashMap<String, Integer> listOccurance() {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("D");
		list.add("A");
		list.add("B");
		list.add("A");

		HashMap<String, Integer> wordCount = new HashMap<>();
		for (String word : list) {
			System.out.println("Word :" + word);

			int count = 0;
			if (wordCount.containsKey(word)) {
				count = wordCount.get(word);
			}
			if (wordCount.isEmpty()) {
				wordCount.put(word, 1);
			} else {
				wordCount.put(word, count + 1);
			}
		}

		System.out.println("countMap :: " + wordCount);
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting() ));
		System.out.println("map :: " + map);

		list = Collections.synchronizedList(list);
		list.stream().forEach(x -> {
			if(x.equals("a")) {

				
				
				
			}
		});

		return wordCount;
	}

	private static void OccuranceOfCharWithSort() {
		String word = "ababfffffffffffbrabab";
		HashMap<String, Integer> map = new HashMap<>();
		System.out.println("" + word.length());
		for (int i = 0; i < word.length(); i++) {
			Integer count = 1;
			String str = "" + word.charAt(i);
			if (map.containsKey(str)) {
				count = map.get(str);
				count++;
				map.put(str, count);
			} else {
				map.put(str, 1);
			}
		}

		System.out.println("map : " + map);
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
		System.out.println("list :: " + list);

		Collections.sort(list, (a, b) -> a.getValue().compareTo(b.getValue()));
		System.out.println("after sort list :: " + list);
/*		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Entry<String, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		System.out.println("sortedMap :: " + sortedMap);  */
	}

	public static void main(String[] args) {
		// Occurance.OccuranceOfCharWithSort();
		Occurance.listOccurance();
	}

}
