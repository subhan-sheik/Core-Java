package com.intoduction;
//Q)Static and Instance Variables
//Create 3 static variables.
//Create 3 instance variables.
//Create 2 static methods and 2 instance methods.
//Create 2 objects.
//Display all values.
public class TestDemo6 {
	static int a=100;
	static int b=200;
	static String college="vcube";
	int id;
	String name;
	String location;
	static void m1() {
		System.out.println("value a:"+a);
		System.out.println("value b:"+b);
	}
	static void m2() {
		System.out.println("college:"+college);
	}
	void m3() {
		System.out.println("ID:"+id);
		System.out.println("NAME:"+name);
	}
	void m4() {
		System.out.println("LOCATION:"+location);
	}

	public static void main(String[] args) {
		m1();
		m2();
		TestDemo6 t1 =new TestDemo6();
		t1.id=210;
		t1.name="subhan";
		t1.location="hyderbad";
		t1.m3();
		t1.m4();
		TestDemo6 t2 =new TestDemo6();
		t2.id=220;
		t2.name="pavan";
		t2.location="hyderbad";
		t2.m3();
		t2.m4();
		
	}

}
