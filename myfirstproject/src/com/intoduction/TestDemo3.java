package com.intoduction;

public class TestDemo3 {
//	static int a =10;
//	static int b = 30;
//		int x=50;
//		int y=60;
//	static void m1() {
//		System.out.println(" static variable  a :" +a);
//	}
//	 static void m2() {
//		 System.out.println(" static variable b :" +b);
//	 }
//	 void m3() {
//		System.out.println("instance variable :"+x);
//	}
//	 void m4() {
//			System.out.println("instance variable :"+y);
//		}
	
	static String companyName="deloite";
	static int employecount =0;
	int id;
	String name;
	int salary;
	{
	employecount++;
	}
	public static void main(String[] args) {
		TestDemo3 t1 = new TestDemo3();
		t1.id=201;
		t1.name="subhan";
		t1.salary=50000;
		
		TestDemo3 t2 = new TestDemo3();
		t2.id=202;
		t2.name="pavan";
		t2.salary=45000;
		
		TestDemo3 t3 = new TestDemo3();
		t3.id=203;
		t3.name="sai";
		t3.salary=44000;
		
		System.out.println("***********************************");
		System.out.println("Company Name :"+companyName);
		System.out.println("ID :"+t1.id);
		System.out.println("Name :"+t1.name);
		System.out.println("salary :"+t1.salary);
		System.out.println("***********************************");
		System.out.println("Company Name :"+companyName);
		System.out.println("ID :"+t2.id);
		System.out.println("Name :"+t2.name);
		System.out.println("salary :"+t2.salary);
		System.out.println("***********************************");
		System.out.println("Company Name :"+companyName);
		System.out.println("ID :"+t3.id);
		System.out.println("Name :"+t3.name);
		System.out.println("salary :"+t3.salary);
		System.out.println("***********************************");
		System.out.println("employecount" +employecount);
		
		
//		TestDemo3 t1 = new TestDemo3();
//		m1();
//		m2();
//		t1.m3();
//		t1.m4();
	}

}
