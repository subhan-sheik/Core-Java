package com.intoduction;

public class TestDemo5 {
	static{
		TestDemo5 t1 = new TestDemo5();
	}
	{
		m1();
		m2();
		m3();
		m4();
	}
	void m1() {
		System.out.println("method1 calling");
	}
	void m2() {
		System.out.println("method2 calling");
	}
	void m3() {
		System.out.println("method3 calling");
	}
	void m4() {
		System.out.println("method4 calling");
	}

	public static void main(String[] args) {

	}

}
