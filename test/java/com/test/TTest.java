package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class TTest {

	public static void main(String[] args) {
		String s = "How are you how are then are then what Mayur Patil";
		// How you are (are) what Patil

		Map<String, Integer> map = new HashMap<String, Integer>();
		
		String[] inputStr = s.split(" ");
		List<String> list = new ArrayList<>();
		for (int i = 0; i < inputStr.length; i++) {
			Integer count = 0;
			//String string = "" + s.charAt(i);

			if(map.containsKey(inputStr[i])) {
				count = map.get(inputStr[i]);
				
				if (i%2 == 1  && count == 1) {
					list.add(inputStr[i]);
				}
			}
			map.put(inputStr[i], count+1);
		}

		list.forEach(System.out :: println);
		
	}

}
