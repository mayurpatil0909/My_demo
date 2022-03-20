package com.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class TestImpl implements Comparator<Integer> {

	public int compare(Integer o1, Integer o2) {

		String s = "FN09vnvdvmb";
		int str = s.codePointCount(0, 1);

		return o1.toString().compareTo(o2.toString());
	};

	public void disaply() {
		System.out.println("");
	}
}

public class ABC {

	public static void main(String[] args) {
		// ((()))()()
		// ((()))))

		String s = new String(")((()))()()))))");
		String str = "";
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < s.length(); i++) {
			Integer count = 0;
			str += s.charAt(i);

			if (map.containsKey(str)) {
				count = map.get(str);
			}

			if (i == 0 && !str.equals("(")) {
				System.out.println("Unbalnced ...");
				break;
			}
			map.put(str, count + 1);
		}

		if (map.get("(").equals(map.get(")"))) {
			System.out.println("Balanced....");
		} else {
			System.out.println("UN Balanced....");
		}

	}

}
