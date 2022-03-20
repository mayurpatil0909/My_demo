package com.test;

class MyException extends Exception {

	public MyException(String message) {
		super(message);
	}
}

class MyRuntimeException extends RuntimeException {

	public MyRuntimeException(String message) {
		super(message);
	}
}

public class CustomeException {

	public static void checkCustomeException() throws MyException{
		Integer age = 20;
		System.out.println(" extends exception class,  age.... :: " + age);

		if (age > 18) {
			throw new MyException("exception --> Invalid Age.");
		}
	}

	public static void checkCustomeRuntimeException() {
		Integer age = 20;
		System.out.println("extends Run Time exception class,  age:: " + age);

		if (age > 18) {
			throw new MyRuntimeException("Run Time exception --> Invalid Age.");
		}
	}
	
	public static void main(String[] args){
		try {
			CustomeException.checkCustomeException();
		} catch (MyException e) {
			e.printStackTrace();
		}

		CustomeException.checkCustomeRuntimeException();
	}
}
