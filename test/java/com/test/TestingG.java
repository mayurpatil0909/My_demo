package com.test;

import java.util.ArrayList;
import java.util.List;

class EmplyeeTest{
	
	Integer empId;
	String empName;
	Integer empSalary;
	
	
	public EmplyeeTest(Integer empId, String empName, Integer empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
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
	public Integer getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Integer empSalary) {
		this.empSalary = empSalary;
	}
	
	
}

public class TestingG {

	public static void main(String[] args) {
		
		List<EmplyeeTest> emplist = new ArrayList<EmplyeeTest>();
		emplist.add(new EmplyeeTest(1, "Amol", 50));
		emplist.add(new EmplyeeTest(2, "Amul", 50));
		emplist.add(new EmplyeeTest(45, "Sagar", 1054));
		emplist.add(new EmplyeeTest(21, "Sanjay", 52452));
		emplist.add(new EmplyeeTest(14, "Jhon", 4542));
		
		// sort emp sal   --
		//emplist.stream().map((EmplyeeTest:: getEmpName)
				
			//	sorted().collect(Collector.co ) ;
		

	}

}
