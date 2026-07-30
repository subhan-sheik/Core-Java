package com.intoduction;

public class Employe1 {
	static String companyName="Wipro";
	int empId;
	String empName;
	float salary;
	void displayEmployee() {
		System.out.println("Employe ID :"+empId);
		System.out.println("Employe Name :"+empName);
		System.out.println("Salary :"+salary);
	}
	void incrementSalary() {
		salary+=5000;
		System.out.println("Increment :5000");
		System.out.println("Updated Salary :"+salary);
	}
	static void displayCompany() {
		System.out.println("Company Name :"+companyName);
	}
	public static void main(String[] args) {
		displayCompany();
		System.out.println("**********************************");
		Employe1 e = new Employe1();
		e.empId=22401;
		e.empName="Subhan Sheik";
		e.salary=55000f;
		e.displayEmployee();
		e.incrementSalary();
		System.out.println("**********************************");
		Employe1 e1 = new Employe1();
		e1.empId=22402;
		e1.empName="Pavan Koppula";
		e1.salary=50000f;
		e1.displayEmployee();
		e1.incrementSalary();
	}

}
