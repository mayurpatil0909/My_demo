package com.java.program;

import java.util.Optional;

public class ReverseString {

	public static void main(String[] args) {

		String str = "NitiN123" ;
		String rev = "";
		for (int i = str.length()-1; i >= 0; i--) {
			rev += str.charAt(i);
		}

		System.out.println("str : "+ str);
		System.out.println("rev : "+ rev);

		if (str.equalsIgnoreCase(rev)) {
			System.out.println("Its a palimdrome string");
		} else {
			System.out.println("It is not a palimdrome string");
		}

		System.out.println("Optional.of(null) :: " + Optional.ofNullable(null) );
		System.out.println(Optional.ofNullable(null).isPresent());
		Optional.of(null);
		
	}

}
