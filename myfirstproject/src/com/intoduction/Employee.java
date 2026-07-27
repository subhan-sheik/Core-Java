package com.intoduction;

public class Employee {
	static String companyName;
	int employeeID;
	String employeeName;
	int salary;

	public static void main(String[] args) {
		companyName = "deloite";
		Employee subhan = new Employee();
		subhan.employeeName = "subhan";
		subhan.employeeID = 101;
		subhan.salary = 50000;
		System.out.println("company Name  :" + companyName);
		System.out.println("Employee ID   :" + subhan.employeeID);
		System.out.println("Employee Name :" + subhan.employeeName);
		System.out.println("salary        : " + subhan.salary);
		Employee pavan = new Employee();
		pavan.employeeID=102;
		pavan.employeeName="pavan";
		pavan.salary=40000;
		System.out.println("company Name  :" + companyName);
		System.out.println("Employee ID   :" + pavan.employeeID);
		System.out.println("Employee Name :" + pavan.employeeName);
		System.out.println("salary        : " + pavan.salary);
	}

}
