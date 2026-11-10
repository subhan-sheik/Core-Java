package com.operators;

class Animal1{
	
}
class Rat extends Animal1{
	
}
class Cat extends Rat{
	
}
public class InstanceofOperator2 {
	
	public static void main(String[] args) {
		Animal1 a=new Rat();
		System.out.println(a instanceof Animal1);
		System.out.println(a instanceof Rat);
		System.out.println(a instanceof Cat);

	}
}
