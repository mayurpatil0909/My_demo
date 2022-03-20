package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

class NegativeNumberException extends Exception {

	public NegativeNumberException(String message) {
		super(message);
	}

}

public class TestClass {

	public static void validateNo(Integer number) throws NegativeNumberException {
		if (number < 0) {
			throw new NegativeNumberException("Number is negative");
		} else {
			System.out.println(number);
		}
	}

	public static void main(String[] args) {

		try {
			validateNo(-90);
		} catch (NegativeNumberException e) {
			e.getStackTrace();
			e.getMessage();
		}

		int[] aar = { 10, 20, 30 };

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		Integer sumOfNumber = 0;
		sumOfNumber = list.stream().mapToInt(i -> i.intValue()).sum() ;
		System.out.println(" sumOfNumber = " + sumOfNumber );

		System.out.println(sumOfNumber);

		//Collections
		Integer sum = list.stream().collect(Collectors.summingInt(Integer::intValue));
//		System.out.println("sum :: " + sum);

	}

}
