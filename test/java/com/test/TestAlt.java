package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.annotation.processing.SupportedSourceVersion;

//Student -- Name, Marks , Roll Number 

class Student {
	
	String name;
	Integer marks;
	Integer rollNumber;
	public Student(String name, Integer marks, Integer rollNumber) {
		super();
		this.name = name;
		this.marks = marks;
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", rollNumber=" + rollNumber + "]";
	}

}

class Rectangle {
	String color;

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Rectangle [color= " + color + "]";
	}
	
}

public class TestAlt {

	public static void main(String[] args) {
		
		List<Student> stdList = new ArrayList<Student>();
		Student std = new Student("Amol", 90, 1);
		Student std1 = new Student("Sanket", 80, 7);
		Student std2 = new Student("Amol", 85, 5);
		Student std3 = new Student("Jhon", 70, 44);
		
		stdList.add(std1);
		stdList.add(std2);
		stdList.add(std2);
		stdList.add(std3);

		Collections.sort(stdList, (a,b )->  a.marks.compareTo(b.marks) )  ;
		System.out.println(	" stdList ::>>  " +	stdList);
		
		List<Student> stdSortedList2 = stdList.stream().sorted(Comparator.comparing(Student :: getName).thenComparing(Student:: getMarks)).collect(Collectors.toList());
		stdSortedList2.forEach( student -> System.out.println(student.rollNumber + " " + student.name + " " + student.marks ) );
		// aList.stream().sorted(Comparator.comparing(Employee :: getSal).collect(Collectors.toList());

		int number = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(number + ", ");
				number++;
			}

			System.out.println();
		}

		Rectangle r1 = new Rectangle();
		r1.setColor("red");
		System.out.println("r1 :: " + r1);
		Rectangle r2 = r1;
		r2.setColor("blue");

		System.out.println("r2 :: " + r2);
		System.out.println("r1 :: " + r1);
		System.out.println(r1.getColor() +  " :: " + r2.getColor());

	}
}
