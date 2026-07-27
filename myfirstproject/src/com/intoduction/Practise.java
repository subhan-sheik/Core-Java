package com.intoduction;

public class Practise {
	Practise ref;
	Practise(){
		System.out.println("object created");
	}
	static void m1() {
		Practise t = new Practise();
	}

	public static void main(String[] args) {
//		1.Nullifying referrrence 
		Practise t1 =new Practise();
		t1 = null;
		System.out.println("1.Referrence assigned is null");
//		2.Reassigning referrence
		Practise t2 =new Practise();
		t2 = new Practise();
		System.out.println("2.Reassigned referrence");
//		3.Out of scope
		m1();
		System.out.println("3.Out of scope");
//		4.Anonymous objects
		new Practise();
		System.out.println("4.Anonymous object created");
//		5.Island isloation
		Practise t3 = new Practise();
		Practise t4= new Practise();
		t3.ref =t4;
		t4.ref =t3;
		t3=null;
		t4=null;
		System.out.println("5.Island isloation");
//		Request Garbage Collection
		System.gc();
	}

}
