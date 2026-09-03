package com.constructors;
//Constructor Chaining Using this()

public class Employee {
	int empId;
	String empName;
	String department;
	double salary;

	Employee(){
		this(101);
	}
	Employee(int empId){
		this.empId=empId;
		this(empId,"subhan");
	}
	Employee(int empId,String empName){
		this.empId=empId;
		this.empName=empName;
		this(empId,empName,"cse",500000.0);
	}
	Employee(int empId,String empName,String department,double salary){
		this.empId=empId;
		this.empName=empName;
		this.department=department;
		this.salary=salary;
		
	}
	
	void displayEmployeeDetails() {
		System.out.println("Employee ID:"+empId);
		System.out.println("Employee Name :"+empName);
		System.out.println("Department :"+department);
		System.out.println("Salary :"+salary);
	}

	public static void main(String[] args) {
		Employee e=new Employee();
		e.displayEmployeeDetails();
	}

}