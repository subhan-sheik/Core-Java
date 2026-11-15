package com.whileloops;

import java.util.Scanner;

public class FibonacciSeries {
	static int fibonacci(int n) {
		int a = 0;
		int b = 1;
		int sum = 0;
		int i = 2;
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		while (i <= n) {
			System.out.println(a);
			sum = a + b;
			a = b;
			b = sum;
			i++;

		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number :");
		int n=sc.nextInt();
		System.out.println("Fibonacci Series :");
		int result=fibonacci(n);
//		System.out.println(result);
		sc.close();
	}

}
