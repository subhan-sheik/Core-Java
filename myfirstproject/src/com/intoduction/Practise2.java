package com.intoduction;

public class Practise2 {
	static String instituteName="VCube";
	static String course="java full stack";
	static int count=0;
	int id;
	String name;
	double fee;
	{
		count++;
	}
	Practise2(){
		id=103;
		name="sai pavan";
		fee=28000;
	}
	Practise2(int id,String name,double fee){
		this.id=id;
		this.name=name;
		this.fee=fee;
	}
	static void instituteInfo() {
		System.out.println("Institute Name :"+instituteName);
	}
	static void courseInfo() {
		System.out.println("Course Name :"+course);
	}
	void show() {
		System.out.println("Student Id :"+id);
		System.out.println("Stufent Nmae :"+name);
		System.out.println("Student Fee :"+fee);
	}
	void display() {
		System.out.println("Total Students="+count);
	}

	public static void main(String[] args) {
		instituteInfo();
		courseInfo();
		System.out.println("************************************");
		Practise2 t1 = new Practise2();
		Practise2 t2 = new Practise2(101,"subhan",30000);
		Practise2 t3 = new Practise2(102,"pavan",35000);
		t1.show();
		System.out.println("************************************");
		t2.show();
		System.out.println("************************************");
		t3.show();
		System.out.println("************************************");
		t3.display();

	}

}
