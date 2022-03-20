package com.java.program;

public class TestBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean b = new Boolean("trUe");
		System.out.println(" b : " + b);

		Boolean b1 = new Boolean("true");
		Boolean b2 = new Boolean(true);

		System.out.println("b1.equals(b2)	:: " + b1.equals(b2));
		System.out.println("b1 == b2 	:: " + (b1 == b2));

		Boolean b3 = new Boolean("trUe");			// true - not case sensitive
		Boolean b4 = new Boolean("True");			// true
		System.out.println(b3.equals(b4));

		Boolean b5 = new  Boolean("hello");  // false  other than true is false
		Boolean b6 = new Boolean("Bye");	// false	
		
		
		System.out.println(b5.equals(b6));
		System.out.println("b5.equals(b4)	:: " + b5.equals(b4));
	}

}
