package com.intoduction;

public class Practise1 { 
	Practise1 ref;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("final method called");
	}

	public static void main(String[] args) {
		//nullifying reference
		Practise1 t1=new Practise1();
		t1=null;
		//reassigning reference
		Practise1 t2=new Practise1();
		t2=new Practise1();
		//out of scope
		m1();
		//anonymous object
		new Practise1();
		//island isolation
		Practise1 t3=new Practise1();
		Practise1 t4=new Practise1();
		t3.ref=t4;
		t4.ref=t3;
		t3=null;
		t4=null;
		System.gc();
	}
	static void m1() {
		Practise1 t=new Practise1();
	}

}
