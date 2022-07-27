package com.school;

public class Employee {

	private String Name;
	private String Department;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public Employee(String name, String department) {
		
		Name = name;
		Department = department;
	}
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Department=" + Department + "]";
	}
	
	
	
	
	
}
