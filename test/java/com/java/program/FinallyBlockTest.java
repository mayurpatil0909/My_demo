package com.java.program;

public class FinallyBlockTest {

	public static void main(String[] args) {
		System.out.println(" Testing funn ::  " + FinallyBlockTest.myFinally());
	}

	@SuppressWarnings("finally")
	public static int myFinally() {
		String a = "a10";
		int x = 0;

		try {
			return Integer.parseInt(a) + 10; // 20
		} catch (NumberFormatException e) {
			throw new NumberFormatException("Its is not a Number ::" + a);
			//return 0;
		} finally { 
			x = Integer.parseInt(a) + 21; 
			System.out.println("x == " + x);
			return x; 
		}
			 
	}

}
