package com.javatpoint;

class TestOverride {

	private void display() {
		System.out.println(" I am in disaply." );
	}
}

public class TestPrivateOverride extends TestOverride {

//	@Override
	private void display() {
		System.out.println("I am disaply  in subclass");
	}
	
	public static void main(String[] args) {
		TestOverride obj = new TestPrivateOverride();
		// obj.display() ;
	}

}
