package com.constructors;

public class Demo1 {
	Demo1(){
		this("subhab",21);
	}
	Demo1(String name,int age){
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		Demo1 d=new Demo1();
		

	}

}
