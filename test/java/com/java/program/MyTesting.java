package com.java.program;

public class MyTesting {

	public static void main(String[] args) {
		System.out.println(" Testing funn ::  " + MyTesting.myTestingFuncn());
	}

	@SuppressWarnings("finally")
	public static int myTestingFuncn() {
		String a = "a10";
		int x = 0;

		try {
			return Integer.parseInt(a) + 10; // 20
		} catch (NumberFormatException e) {
			throw new NumberFormatException("Its is not a Number ::" + a);
			// return 0;
		} finally {
			x = Integer.parseInt(a) + 21;
			System.out.println("x == " + x);

			 return x;
		}
	}

}
