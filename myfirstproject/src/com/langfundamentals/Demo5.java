package com.langfundamentals;

import java.util.Scanner;

public class Demo5 {
	void show(int a, int b, int c) {

		if (a == b && b == c) {
			System.out.println("all are equal");
		}else if (a == b) {
			System.out.println("if a and b are equal ");
		} else if (a == c) {
			System.out.println("if a and c are equal");
		} else if (b == c) {
			System.out.println("if b and c are equal");
		} else if (a > b && a > c) {
			System.out.println("if a is greater");
		} else if (b > a && b > c) {
			System.out.println("if b is greater");
		} else if (c > a && c > b) {
			System.out.println("if c is greater");
		} 
	}

	public static void main(String[] args) {
		Demo5 d = new Demo5();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number:");
		int a = sc.nextInt();
		System.out.println("Enter your second number:");
		int b = sc.nextInt();
		System.out.println("Enter your third number:");
		int c = sc.nextInt();
		d.show(a, b, c);
		sc.close();
	}

}
