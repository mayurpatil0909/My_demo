package com.java.program;

import java.util.Scanner;

public class TestFibbonacciSeries {

	int n3 = 0; /// ====> n3= n1=n2 ===

	public void getFibbonumber(int count, int n1, int n2) {

		if (count != 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			getFibbonumber(count - 1, n1, n2);
		}

	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("How many digit of series is required:  ");
		int count = scanner.nextInt();

		System.out.print("Enter First digit of Fibbo series: ");
		int n1 = scanner.nextInt();
		System.out.print("Enter Second digit of Fibbo series :");
		int n2 = scanner.nextInt();

		TestFibbonacciSeries obj = new TestFibbonacciSeries();
		obj.getFibbonumber(count, n1, n2);

	}

}
