package com.intoduction;
//Q1)Static Method Modifies Static Variable
//Create 2 static variables.
//Create 3 static methods.
//Each method changes the value of a static variable.
//Print the final values.
public class TestDemo2 {
	static int a=100;
	static int b=200;
	static void m1() {
	  a=300;
		System.out.println("after m1(): a=" +a);
		
	}
	static void m2() {
	 b=400;
		System.out.println("afterm2(): b="+b);
	}
	static void m3() {
		 a=500;
		 b=600;
		System.out.println("after m3(): a="+a+",b"+b);
	}

	public static void main(String[] args) {
		m1();
		m2();
		m3();
		System.out.println("final values:"+a);
		System.out.println("final values:"+b);
	}

}
