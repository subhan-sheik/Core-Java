package com.constructors;

public class Person1 {
	String name;
	int age;
	Person1(String name,int age){
		this.name=name;
		this.age=age;
	}
	Person1(){
	}

}
class Employee2 extends Person1{
	int empId;
	double salary;
	Employee2(int empId,String name,int age,double salary){
		super(name,age);
		this.empId=empId;
		this.salary=salary;
		
	}
	Employee2(Employee2 e){
		empId=e.empId;
		name=e.name;
		age=e.age;
		salary=e.salary;
		
	}
	void displayEmployeeDetails() {
		System.out.println("Employee Id :"+empId);
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
	}
	public static void main(String[] args) {
		Employee2 e1 =new Employee2(101,"subhan",21,800000.0);
		Employee2 e2 =new Employee2(e1);
		e2.salary=40000.0;
		e1.displayEmployeeDetails();
		System.out.println("----------------------------------");
		e2.displayEmployeeDetails();
		
	}
}