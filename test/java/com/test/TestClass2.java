package com.test;

public class TestClass2 {

	@SuppressWarnings("finally")
	public static int add() {
		int a = 10;

		try {
			a = a + 10;
			return a;
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			a = a + 10;
			System.out.println("a = " + a);
			return a;
		}

	}

	public static void exceptionChecking() throws Exception {
		int a = 10;

		try {
			a = a + 10;
			throw new Exception("in try bock...");
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			a = a + 10;
			System.out.println("a = " + a);
			throw new Exception("in try finllay...");
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println( "add method :: " + add());
		
		try {
			TestClass2.exceptionChecking();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
