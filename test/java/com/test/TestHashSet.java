package com.test;

import java.util.HashSet;

public class TestHashSet {
	String name;
	int age;

	TestHashSet(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	public boolean equals(TestHashSet obj) {
		return super.equals(obj.name);
	}
	
	public static void main(String[] args) {
		TestHashSet c1 = new TestHashSet("John", 20);
		TestHashSet c2 = new TestHashSet("John", 20);
		HashSet<TestHashSet> customerSet = new HashSet<>();

		customerSet.add(c1);
		customerSet.add(c2);

		System.out.println(customerSet.size());
	}
}