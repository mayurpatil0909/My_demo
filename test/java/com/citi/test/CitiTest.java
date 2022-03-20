package com.citi.test;

public class CitiTest {
	public int Test(int[] A) {
		// length ==4
		int count = 0;
		for (int i = 0; i < A.length; i++) {

			int leftSum = 0;
			for (int j = 0; j < i; j++) { // i=1 j=0 ----
				leftSum += A[i];
			}
			int rightSum = 0;
			for (int j = i + 1; j < A.length; j++) {
				rightSum += A[i];
			}

			if (leftSum == rightSum ) {
				System.out.println("leftSum : " +  leftSum  );
				System.out.println("rightSum : " + rightSum );
				System.out.println("equilibrium index is " +  i );
				return i ;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int[] A = new int[] { 3, 1, 3, 0 };
		CitiTest citiTest = new CitiTest();
		citiTest.Test(A);

	}

}
