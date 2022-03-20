package com.test;

final class Immutableclass {
	
	final private String obj;
	
	public Immutableclass(String obj) {
		this.obj = obj;
	}

	public String getObj() {
		return obj;
	}
	
	public Immutableclass getInstance() {
		return new Immutableclass(obj);
	}

}




public class TesCitius {

	public static void main(String[] args) {

	}

}
