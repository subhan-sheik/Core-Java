package com.operators;

class Animal2{
	
}
class Mammal extends Animal2{
	
}
class Dog1 extends Mammal{
	
}
public class InstanceofOperator3 {

	public static void main(String[] args) {
		Dog1 d=new Dog1();
		System.out.println(d instanceof Animal2);
		System.out.println(d instanceof Mammal);
		System.out.println(d instanceof Dog1);
	}

}
