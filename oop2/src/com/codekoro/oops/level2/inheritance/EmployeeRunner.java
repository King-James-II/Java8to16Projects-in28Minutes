package com.codekoro.oops.level2.inheritance;

public class EmployeeRunner {

	public static void main(String[] args) {
		Employee employee = new Employee("Testerson", "Programmer Analyst");

		employee.setEmail("Testerson@tm.com");
		employee.setPhoneNumber("9876543210");
		employee.setEmployeeGrade('A');
		System.out.println(employee);
	}

}
