package com.test.FunctionalInterface;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import javax.xml.bind.ValidationException;

public class TestFunctionalInterface {

	public static void main(String[] args) throws ValidationException, ParseException {

		// predicate (boolean-valued function) of one argument
		Predicate<String> chkLength = s -> s.length() > 5;
		System.out.println("chkLength :: " + chkLength.test("TestingCode"));

		Predicate<String> chkLengthEvenOdd = s -> s.length() %2 == 0;
		System.out.println("chkLengthEvenOdd:: " + chkLengthEvenOdd.test("TestingCode"));

		// Predicate joining
		System.out.println("Merging predicate using And :: " + chkLength.and(chkLengthEvenOdd).test("TestingCode"));
		System.out.println("Merging predicate using OR :: " + chkLength.or(chkLengthEvenOdd).test("TestingCode"));
		System.out.println("Merging predicate using Negate :: " + chkLength.negate().test("TestingCode"));
		System.out.println("chkLength :: " + chkLength.toString());

		// Function - that accepts one argument and produces a result.
		Function<Integer, Integer> doubleMe = i -> i*2;
		System.out.println("function :: " + doubleMe.apply(5) );

		Function<Integer, Integer> cubeMe = i -> i*i*i;
		System.out.println("cubeMe :: " + cubeMe.apply(5) );

		///Function  joining 
		System.out.println("function Chaining use AndThen ::"  + doubleMe.andThen(cubeMe).apply(5) );
		System.out.println("function Chaining use compose ::"  + doubleMe.compose(cubeMe).apply(5) );

		// Consumer - Represents an operation that accepts a single input argument and returns no result
		Consumer<Integer> squareMe = i -> System.out.println("Square:: " + i*i);;
		squareMe.accept(5);

		Consumer<Integer> doubleMee = i -> System.out.println("doubleMee:: " + 2*i);;
		squareMe.andThen(doubleMee).accept(5);

		//Supplier
		Supplier<Date> currentTime = () -> new Date();
		System.out.println("Current Time ::"  + currentTime.get());

		try {
			String str = "-142.15";
			// Integer.parseInt(str); // 15,350 /-
			Double.parseDouble(str);
			 Double i =  12.15;
			float j = (float) 44.22;

//			System.out.println("Int parsing string :: " + Integer.parseInt(str) );
			System.out.println("Double parsing string :: " + Double.parseDouble(str));
//			System.out.println(Integer.parseInt(str) < 0);
			
			System.out.println("i = " + i);
			System.out.println("j = " + j);
			
			LocalDate dob = LocalDate.parse("2016-08-29");
			LocalDate killDate = LocalDate.parse("2016-11-30");

			System.out.println( ChronoUnit.MONTHS.between(dob, killDate) );
			List<String> list =  new ArrayList<>(Arrays.asList("Geeks","ForGeeks","GeeksForGeeks"));

			 String s = String.join(",", list);
			 System.out.println(" s as , seperated ::-> " + s );

			 System.out.println(" parse date ::  " + 	    new SimpleDateFormat("yyyy-mm-dd").parse("2018-02-19")  );
			 
			 List<String> phoneList = new ArrayList<>();
			 String phones = String.join(", ", phoneList);
			 System.out.println("phone list join :: " + phones);
			 
		} catch(NumberFormatException e) {
			throw new ValidationException("This is not number");
		}

	}

/*	private checkDouble(Double d) {
		System.out.println("In Double -----------------");
		
		System.out.println("End of Duble -----------------");
	}*/

}
