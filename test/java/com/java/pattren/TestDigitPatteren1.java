package com.java.pattren;

public class TestDigitPatteren1 {

	public static void main(String[] args) {
// 1 2 3
// 1 2 3
// 1 2 3
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}

// 3 2 1 
// 3 2 
// 3 

		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}

	}
}
