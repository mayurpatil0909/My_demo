package com.java.program;

public class FindIndexOfDuplicateEleOfArray {

	public void duplicateValueOfIndex(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		int[] array = new int[] { 2, 8, 3, 2, 10, 3};
		FindIndexOfDuplicateEleOfArray obj = new FindIndexOfDuplicateEleOfArray();
		obj.duplicateValueOfIndex(array);
	}
}
