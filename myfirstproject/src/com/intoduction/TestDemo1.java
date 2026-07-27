package com.intoduction;

public class TestDemo1 {
	 void m2() {
		 int a=10,b=20,c=30;
		 int avg=(a+b+c)/3;
		 System.out.println("average of three numbers  :" +(avg));
		 m1();
	 }
	 static void m1() {
		 int a=5;
		 int cube = a*a*a;
		 System.out.println("squares  :" +(cube));
	 }
	public static void main(String[] args) {
		TestDemo1 t1 =new TestDemo1();
		t1.m2();
	}

}
