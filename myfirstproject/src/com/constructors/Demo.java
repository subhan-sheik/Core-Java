package com.constructors;

class Parent{
	Parent(){
		System.out.println("parent class executed");
	}
}
class Child extends Parent{
	Child(){
		super();
		System.out.println("child class executed");
	}
}
public class Demo {
	
	public static void main(String[] args) {
		System.out.println("hello");
		Child p = new Child();
	}

}

