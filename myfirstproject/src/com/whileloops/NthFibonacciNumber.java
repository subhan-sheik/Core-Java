package com.whileloops;

import java.util.Scanner;

//Write a Java Program to print the N’th Fibonacci Number
//Fibonacci series lo each number = previous two numbers sum.
//Starting numbers:0,1
//Then:
//0 + 1 = 1
//1 + 1 = 2
//1 + 2 = 3
//2 + 3 = 5
//3 + 5 = 8
//Fibonacci series is 0,1,1,2,3,5,8,13,21,34......

public class NthFibonacciNumber {
	static int fibonacci(int n) {
		int a = 0;
		int b = 1;
		int sum = 0;
		int i = 1;
		while (i <= n) {
			System.out.println(a);
			sum = a + b;
			a = b;
			b = sum;
			i++;

		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Posistion");
		int n = sc.nextInt();
		int result = fibonacci(n);
		System.out.println("Nth Fibonacci Number Is :"+result);
		sc.close();
	}

}
