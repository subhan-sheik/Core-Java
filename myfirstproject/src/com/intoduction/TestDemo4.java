package com.intoduction;

public class TestDemo4 {
	static void addition() {
	    int a=10, b=30;
		System.out.println("addition :"+ (a+b));
		TestDemo4 t1 = new TestDemo4();
		t1.subtraction();
	}
	void subtraction() {
		int a=40, b=20;
		System.out.println("subtraction :"+ (a-b));
		multiplication();
	}
	static void multiplication() {
		int a=2, b=5;
		System.out.println("multiplication :" +(a*b));
		TestDemo4 t1 = new TestDemo4();
		t1.division();
	}
	void division() {
		int a=20, b=40;
		System.out.println("division :" +(a/b));
	}

	public static void main(String[] args) {
		addition();
	}

}
