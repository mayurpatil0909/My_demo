package com.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@FunctionalInterface
interface TestA {
	void display(String s);
}

@FunctionalInterface
interface TestB extends TestA {
	void display(String s );
}

public class TestSyn {
	
	public void display(String s) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		TestA obj = (s) -> System.out.println("" + s);	
		obj.display(" I am Test A");
		
		String str = "ABABABCDH";
		char[] chArr = str.toCharArray();
		List<char[]> list = Arrays.asList(str.toCharArray());

		Map<char[], Long> map1 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting() )); ;

		System.out.println("map1s :: " + map1);
		list.stream().collect(Collectors.toList());

		/* list.stream(). List<String> list = new ArrayList<String>(); Map<String,
		 * Integer> map = new HashMap<String, Integer>();
		 */

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < str.length(); i++) {
			Integer count = 0;
			String s = "" + str.charAt(i);
			// list .add(s);
			if (map.containsKey(s)) {
				count = map.get(s);
			}
			map.put(s, count + 1);
		}

		System.out.println("map :: " + map);

		String word = "1452ABABABCDH";
		IntStream stream = word.chars();

		Stream<String> strStream = Stream.of(word);
		strStream.forEach(p -> {
			
		}
				);
		
	}


	
	

}