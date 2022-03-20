package com.javatpoint;

interface Sayable {
	void say();
}

class SayHello {

	public static void sayHello() {
		System.out.println("Hello....");
	}
}

public class MethodReference {

	public static void sayHelloRef() {
		System.out.println("Hello Ref....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sayable sayable = MethodReference::sayHelloRef;
		sayable.say();

		Thread thread = new Thread(SayHello::sayHello);
		thread.start();

		// String s = String.join(",", list);
	}
}

// how to create rest end point in spring ?
// solid conpext
// how do o you create spring JDBC templete
