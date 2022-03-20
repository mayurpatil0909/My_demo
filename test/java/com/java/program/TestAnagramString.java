package com.java.program;

import java.util.Arrays;

public class TestAnagramString {

	static void testAnagramString(String str1, String str2) {

		boolean status = true;
		if (str1.length() != str2.length()) {
			status = false;
		} else {

			char[] arrays1 = str1.toLowerCase().toCharArray();
			char[] arrays2 = str2.toLowerCase().toCharArray();
			Arrays.sort(arrays1);
			Arrays.sort(arrays2);

			status = Arrays.equals(arrays1, arrays2);
		}

		if (status) {
			System.out.println(String.format("%s and %s are Anagram strings", str1, str2));
		} else {
			System.out.println(String.format("%s and %s are NOT Anagram strings", str1, str2));
		}

	}

	public static void main(String[] args) {
		TestAnagramString.testAnagramString("Keep", "Peek");
	}

}
