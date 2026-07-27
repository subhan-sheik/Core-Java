package com.intoduction;

public class TestDemo7 {
	static int a = 100;
	static int b = 200;
	static String college = "vcube";
	int id;
	String student;
	String location;

	static void m1() {
		System.out.println("value:" + a);
		System.out.println("value:" + b);
	}

	static void m2() {
		System.out.println("college name:" + college);
	}

	void m3() {
		System.out.println("student name:" + student);
		System.out.println("id:" + id);
	}

void m4(){
System.out.println("location:"+location);
}

public static void main(String[] args){
m1();
m2();
TestDemo7 t1=new TestDemo7();
t1.student ="subhan";
t1.id=21;
t1.location="hyderbad";
t1.m3();
t1.m4();
TestDemo7 t2=new TestDemo7();
t2.student ="pavan";
t2.id=22;
t2.location="hyderbad";
t2.m3();
t2.m4();
}
}
