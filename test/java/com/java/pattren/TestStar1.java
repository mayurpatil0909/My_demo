package com.java.pattren;

import java.util.Optional;

public class TestStar1 {

	public Optional<Integer> palimderome(int n) { // 153 == (1*1*1) + (5*5*5) + (3*3*3)

		int temp, count = 0, a = 0, result = 0;
		temp = n;
		while (temp != 0) {
			temp = temp / 10;
			count++;
		}

		temp = n;
		while (temp != 0) {
			a = temp % 10;
			result += Math.pow(a, count);
			temp = temp / 10;
		}

		Optional<Integer> newResult = Optional.ofNullable(result);
		if (newResult.get() == n) {
			return newResult;
		}

		return Optional.empty();

	}

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

		TestStar1 obj = new TestStar1();

		for (int i = 101; i < 1999; i++) {
			Optional<Integer> palimdromeno = obj.palimderome(i);
			if (palimdromeno.isPresent() && !palimdromeno.equals(Optional.empty()))
				System.out.print(palimdromeno.get() + " ");
		}

	}

}
