package com.test.FunctionalInterface;

interface Test {
	 void testA();
	 void testB();
	 default void show() {
		 System.out.println("in Show() ");
	 }
	 
	 default void newShow() {
		 System.out.println("in new Show() ");
	 }
}

abstract class Testing implements Test {
	public void testA() {
		System.out.println("I am testA method");
	}
	static void run() {
		// System.exit(0);
		System.out.println("I am in TestA run !!!");
	}
}


class TestA implements Test {

	static void run() {
		// System.exit(0);
		System.out.println("I am in TestA run !!!");
	}

	@Override
	public void testA() {
		System.out.println("in testA");
	}

	@Override
	public void testB() {
		System.out.println("in testB");
	}
}

class TestB extends TestA {
	
	static void run() {
		// System.exit(0);
		System.out.println("I am in TestB run !!!");
	}
}


public class TestStatic {

	public static void main(String[] args) {
		TestA objA = new TestB();
		objA.run();

		Test test = new TestA();
		test.show();
		test.newShow();

		String s = "Hello";
		String str = "";
		for(int i = s.length()-1 ; i >= 0; i--) {
			str = str + s.charAt(i);
		}

		System.out.println( "Rev String :: " + str);
	}

}
