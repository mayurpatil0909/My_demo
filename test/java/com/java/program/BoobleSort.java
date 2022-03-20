package com.java.program;

import java.util.Arrays;

public class BoobleSort {

	public static void main(String[] args) {
		int[] array = new int[] { 10, 4, 8, 15, 56, 24, 78, 88, 75 };

		Arrays.sort(array);

		System.out.println("Largest NO. :; " + array[array.length - 1]);
		for (int i = 0; i <= array.length - 1; i++) {
			if (i == array.length - 1) {
				int largeNo = array[i];
				System.out.println(" largeest no : " + largeNo);
			}
		}

		System.out.println("==================Booble Sort===========================");

		int[] boobleArray = { 10, 4, 8, 15, 1, 56, 24, 75, 95, 75 };
		for (int i = 0; i < boobleArray.length; i++) {
			for (int j = 0; j < boobleArray.length - 1 - i; j++) {
				if (boobleArray[j] > boobleArray[j + 1]) {
					int temp = boobleArray[j];
					boobleArray[j] = boobleArray[j + 1];
					boobleArray[j + 1] = temp;
				}
			}
		}

		System.out.println(" boobleArray :: " + Arrays.toString(boobleArray) );
	}

}
