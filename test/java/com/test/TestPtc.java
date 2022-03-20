package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class EmployeeP {

	Integer empId;
	String name;
	String lastName;
	Long salary;

	public EmployeeP(Integer empId, String name, String lastName, Long salary) {
		this.empId = empId;
		this.name = name;
		this.lastName = lastName;
		this.salary = salary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeP [empId=" + empId + ", name=" + name + ", lastName=" + lastName + ", salary=" + salary + "]";
	}

}

public class TestPtc {

	public static void main(String[] args) {
		List<EmployeeP> empList = new ArrayList<EmployeeP>();
		empList.add(new EmployeeP(11, "Akash", "Jadhav", 500L));
		empList.add(new EmployeeP(12, "Amol", "Patil", 1500L));
		empList.add(new EmployeeP(14, "Sunil", "Jadhav", 700L));
		empList.add(new EmployeeP(15, "Akash", "Sone", 600L));
		empList.add(new EmployeeP(18, "Akash", "Jadhav", 1400L));

		/*
		 * Collections.sort(empList, (a, b) -> a.name.compareTo(b.getName()));
		 * empList.stream().forEach(System.out :: println);
		 */

		empList.stream().sorted(Comparator.comparing(EmployeeP::getName).thenComparing(EmployeeP::getLastName))
				.forEach(System.out::println);

		/*
		 * String s =Brotherhood of Locomotive Engineers Co-Operativestar National Bank
		 * of Cleveland
		 * 
		 */

		String s = "Brotherhood of Locomotive Engineers Co-Operativestar National Bank of Cleveland";
		String string = "";
		for (int i = 0; i < s.length() && i < 39; i++) {
			string += s.charAt(i);
		}

		System.out.println("string :: " + string);

	}

}
