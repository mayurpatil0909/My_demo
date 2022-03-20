package com.javatpoint;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("AC");
		list.add("AA");
		list.add("AA");
		list.add("AB");
		list.add("AC");
		
		System.out.println("list :: " + list);
		Set<String> set = new HashSet<>(list);
		System.out.println("set  :: " + set );
		list.clear();
		list.addAll(set);
		System.out.println("list :: " + list);
		
		Set<String> linkedHashSet = new LinkedHashSet<>(list); // preserve the insertion order
		list.clear();
		list.addAll(linkedHashSet);
		System.out.println(" list via linkedhaset : " + list);

		Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
