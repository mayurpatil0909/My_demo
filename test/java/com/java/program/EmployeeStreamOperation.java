package com.java.program;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	Integer empId;
	String empName;
	String gender;
	String empLastName;

	public Employee(Integer empId, String empName, String empLastName, String gender) {
		this.empId = empId;
		this.empName = empName;
		this.empLastName = empLastName;
		this.gender = gender;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

/*	@Override
	public int compareTo(Employee emp) {

		if (this.empId == emp.empId) {
			return 0;
		} else if (this.empId > emp.empId) {
			return 1;
		} else {
			return -1;
		}
	}*/
}

public class EmployeeStreamOperation {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(45, "Rakshk", "Sone", "Male"));
		empList.add(new Employee(41, "Abhi", "Sone", "Male"));
		empList.add(new Employee(46, "Amar", "Arde", "Male"));
		empList.add(new Employee(2, "Yadi", "Patil", "Female"));
		empList.add(new Employee(48, "Veena", "Savade", "Female"));
		empList.add(new Employee(48, "Ankit", "Savade", "Male"));

		Employee employee = empList.stream().filter(emp -> emp.empLastName.equals("Sone")).findFirst().get();
		System.out.println(" employee :: " + employee.getEmpId() + " " + employee.getEmpName() + " " + employee.getEmpLastName());

		System.out.println(" ++++++ ===========================================++++++");
		// empList.stream().map(Employee:: getEmpName).distinct().collect(Collectors.toList()).forEach(System.out::println);;

		// Object sorted by with its multiple fields simultaneously.
		List<Employee> empSortedList = empList.stream()
				.sorted(Comparator.comparing(Employee::getEmpId).thenComparing(Employee::getEmpName))
				.collect(Collectors.toList());

		empSortedList.forEach(emp -> System.out.println(emp.getEmpId() + " " + emp.getEmpName() + " " + emp.getEmpLastName()));

		System.out.println(" ++++++ =====================Rev Order by ID======================++++++");
		List<Employee> empRevByIdList = empList.stream().sorted(Comparator.comparing(Employee::getEmpId).reversed()).collect(Collectors.toList());
		empRevByIdList.forEach(emp -> System.out.println(" reve Order emp :: " + emp.getEmpId() + " " + emp.getEmpName() + " " + emp.getEmpLastName()));

		Map<String, Long> noOfMaleFemaleEmpMap = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.print(noOfMaleFemaleEmpMap);
	}

}
