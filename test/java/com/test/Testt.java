package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employyee implements Comparator<Employyee> {

	int id;
	String name;
	String location;

	public Employyee(int id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public int compare(Employyee o1, Employyee o2) {
		return o1.getLocation().compareToIgnoreCase(o2.getLocation());
	}

}

public class Testt {

	public static void main(String[] args) {

		Employyee e1 = new Employyee(1, "Amar", "Pune");
		Employyee e2 = new Employyee(2, "Amit", "Mumbai");
		Employyee e3 = new Employyee(3, "Ajit", "Pune");
		Employyee e4 = new Employyee(4, "Mayur", "Surat");
		Employyee e5 = new Employyee(8, "Sonal", "Surat");

		List<Employyee> list = new ArrayList<Employyee>();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(Employyee::getLocation, Collectors.counting()));

		List<Map.Entry<String, Long>> sortedMap = new LinkedList<Map.Entry<String, Long>>(map.entrySet());
		Collections.sort(sortedMap, (a, b) -> a.getValue().compareTo(b.getValue()));
		map.entrySet();
		System.out.println("map :: " + map);

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		List<Integer> intList1 = new ArrayList<Integer>();
		List<Integer> intList2 = new ArrayList<Integer>();
		
		intList.stream().forEach(x -> {
			if (x % 2 == 0) {
				intList1.add(x + 2);
			} else {
				intList1.add(x);
			}
		});

		System.out.println("intList1 :: " + intList1);

		for (int i = 0; i < intList.size(); i++) {
			if(intList.get(i) % 2 == 0) {
				intList2.add(intList.get(i) + 2);
			} else {
				intList2.add(intList.get(i));
			}
		}

		System.out.println(" intList2  :: " + intList2);
	}

}








/*String s="APPLE BANANA BANANA APPLE CAKE BANANA";*/

/*1.sepatewd the  sreing " "
for loop

count =0;
map.containmls() {
	count +1 
	mamp.put(App , 2)
} else {

mpa.put (Apple, 1);
}

List<Entry.pa<Sring, Int>> list = new LinkList<>(map.entrySet());

list.stram().sort(Comparator.compare(a,b)-> a.getValaules.eqauals( ));

*/
