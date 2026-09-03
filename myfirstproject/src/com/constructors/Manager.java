package com.constructors;
//Constructor Chaining + Inheritance

class Person {
	String name;
	int age;

	Person() {
		this("subhan", 21);
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;

	}
}

class Employee1 extends Person {
	int empId;
	String department;
	double salary;

	Employee1() {
		this(101, "IT", 500000.0);
	}

	Employee1(int empId, String department, double salary) {
//		this(empId, department, salary, "subhan", 21);
		super();
		this.empId = empId;
		this.department = department;
		this.salary = salary;
	}

//	Employee1(int empId, String department, double salary, String name, int age) {
//		super();
//		this.empId = empId;
//		this.department = department;
//		this.salary = salary;
//		this.name = name;
//		this.age = age;
//	}
//
}

public class Manager extends Employee1 {
	String team;
	int experience;

	Manager() {
		this("Development", 5);
	}

	Manager(String team, int experience) {
		super();
		this.team = team;
		this.experience = experience;
	}

	void displayStudentDetails() {
		System.out.println("Employee Id :" + empId);
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
		System.out.println("Salary :" + salary);
		System.out.println("Team :" + team);
		System.out.println("Experience :" + experience + "" + "years");

	}

	public static void main(String[] args) {
		Manager m = new Manager();
		m.displayStudentDetails();

	}

}

