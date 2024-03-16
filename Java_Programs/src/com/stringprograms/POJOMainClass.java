package com.stringprograms;

public class POJOMainClass {

	public static void main(String[] args) {

		POJOClass obj=new POJOClass();
		obj.setName("Sanjeev");
		obj.setEmployeeid("E10789");
		obj.setSalary(200000);
		
		System.out.println("Employee Name: "+obj.getName());
		System.out.println("Employee ID: "+obj.getEmployeeid());
		System.out.println("Employee Salary: "+obj.getSalary());

	}

}
