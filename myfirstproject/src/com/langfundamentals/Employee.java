package com.langfundamentals;

public class Employee {
	static String companyName = "SunTech";
	String location = "Hi-Tech City";
	String employeeName;
	int employeeId;
	String designation;
	String department;
	double salary;
	String remoteLocation;
	static {
		System.out.println("Welcome to SunTech Solutions!Employee HRMS Portal");
	}

	void displayEmployeeDetails() {
		System.out.println("Company Name :" + companyName);
		System.out.println("Location :" + location);
		System.out.println("Employee Name :" + employeeName);
		System.out.println("Employee ID :" + employeeId);
		System.out.println("Designation :" + designation);
		System.out.println("Department Name :" + department);
		System.out.println("Salary :" + salary);
		System.out.println("Remote Location :" + remoteLocation);
	}

	void promoteEmployee() {
		designation = "HR";
		System.out.println("Promote Employee :" + designation);
	}

	void updateSalary(double salary) {
		this.salary += 5000;
		System.out.println("Update Salary :" + salary);
	}

	void updateEmployeeLocation(String location) {
		this.location = location;
		System.out.println("update Employee Location :" + location);
		System.out.println("---------------------------------");
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.employeeName = "subhan sheik";
		e.employeeId = 101;
		e.designation = "Tester";
		e.department = "xyz";
		e.salary = 45000;
		e.remoteLocation = "yes";
		e.displayEmployeeDetails();
		e.promoteEmployee();
		e.updateSalary(e.salary);
		e.updateEmployeeLocation("Kondapur");
		System.out.println("Updated Employee Details");
		System.out.println();
		e.displayEmployeeDetails();
	}

}
