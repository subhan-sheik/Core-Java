package com.intoduction;

public class Practise3 {
	static String companyName="wipro";
	int id;
	String name;
	String job;
	Practise3(){
	}
	void show() {
		System.out.println("Company Nmae :"+companyName);
		System.out.println("ID :"+id);
		System.out.println("Name :"+name);
		System.out.println("Job :"+job);
	}

	public static void main(String[] args) {
		Practise3 t1 = new Practise3();
		t1.id=201;
		t1.name="subhan";
		t1.job="Java Developer";
		Practise3 t2 = new Practise3();
		t2.id=202;
		t2.name="pavan";
		t2.job="Java Developer";
		Practise3 t3 = new Practise3();
		t3.id=203;
		t3.name="sai pavan";
		t3.job="Developer";
		t1.show();
		System.out.println("******************************");
		t2.show();
		System.out.println("******************************");
		t3.show();
		
	}

}
