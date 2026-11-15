package com.ConditionalStatements;
// don't use for loop.

import java.util.Scanner;

public class NumbersRecursion {
//	We can send the number through the method parameter.
//	static void print(int n) {
//		if(n>5) {
//			return;
//		}
//		System.out.println(n);
//		print(n+1);
//	}

	static int n = 1;

	static int number(int num) {
		if (n == num) {
			return n;
		}
		System.out.print(n++ + " ");
		return number(num);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num = sc.nextInt();
		int result = number(num);
		System.out.println(result);
//		print(1);
		sc.close();
	}

}
