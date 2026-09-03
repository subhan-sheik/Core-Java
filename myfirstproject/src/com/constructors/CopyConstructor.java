package com.constructors;

public class CopyConstructor {
	int empId;
	String empName;
	double salary;
	CopyConstructor (int empId,String empName,double salary){
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	CopyConstructor(CopyConstructor c){
		this.empId=c.empId;
		this.empName=c.empName;
		this.salary=c.salary;
	}

	public static void main(String[] args) {
		CopyConstructor c=new CopyConstructor(101,"subhan",30000.0);
		CopyConstructor c2=new CopyConstructor(c);
		System.out.println(c2.empId);
		System.out.println(c2.empName);
		System.out.println(c2.salary);
		

	}

}
