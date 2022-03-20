package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestXoriant {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(101);
		list.add(15);
		list.add(9);
		list.add(-44);
		
		Collections.sort(list);
		list.stream().forEach( System.out :: println);

		System.out.println("");
		Collections.sort(list, (a,b) -> b.compareTo(a) );
		list.stream().forEach( System.out :: println);
	}

}
