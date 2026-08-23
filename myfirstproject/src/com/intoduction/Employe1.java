package com.intoduction;
//1.Write a Java Program to take 2 instance and 2 static methods with arguments and return type call these methods
//each one in another one call the any one of the method in main but all the methods data should be displayed. 
//Note Display one object in over all program 

public class Employe1 {
	int add(int a, int b) {
		int sum = a + b;
		System.out.println("add two numbers :" + sum);
		int result = sub(sum, 10);
		return result;
	}

	int sub(int a, int b) {
		int diff = a - b;
		System.out.println("sub two numbers :" + diff);
		int result1 = multi(diff, 40);
		return result1;
	}

	static int multi(int a, int b) {
		int pro = a * b;
		System.out.println("product of two numbers :" + pro);
		int result2 = div(pro, 20);
		return result2;
	}

	static int div(int a, int b) {
		int division = a / b;
		System.out.println("division of two numbers :" + division);
		return division;
	}

	public static void main(String[] args) {
		Employe1 e = new Employe1();
		e.add(20, 30);

	}

}
