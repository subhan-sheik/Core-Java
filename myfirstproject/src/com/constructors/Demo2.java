package com.constructors;

public class Demo2 {
//	int empId;
//	String empName;
//	double salary;
//	Demo2(){
//		this(210,"subhan");
//	}
//	Demo2(int empId ,String empName){
//		
//		this(empId,empName,75000.0);
//	}
//	Demo2(int empId ,String empName,double salary){
//		this.empId=empId;
//		this.empName=empName;
//		this.salary=salary;
//	}
//	void display() {
//		System.out.println("Employee Id:"+empId);
//		System.out.println("Employee Name :"+empName);
//		System.out.println("salary :"+salary);
//	}
	Demo2(){
		System.out.println("snn");
	}
	Demo2(int age){
		this();
		System.out.println("skkjidjijsddjdjij");
		System.out.println("age :"+age);
	}
	Demo2(String name){
		this(21);
		System.out.println("sdkkdds");
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Demo2 d=new Demo2("subhan");
//		d.display();	
		
	}

}

