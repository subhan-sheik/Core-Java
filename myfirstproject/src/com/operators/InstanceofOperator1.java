package com.operators;

class Animal {
	
} 
class Dog extends Animal{
	
}
public class InstanceofOperator1 {

	public static void main(String[] args) {
		Dog d=new Dog();
		System.out.println(d instanceof Dog);
		System.out.println(d instanceof Animal);
		
	}

}
