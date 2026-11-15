package com.whileloops;

import java.util.Scanner;

public class Factorial {
	static int factorial(int n) {
		int product=1;
		int i=1;
		while(i<=n) {
			product=product*i;
			i++;
		}
		return product;
	}

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your number :");
			int n=sc.nextInt();
			int num=factorial(n);
			System.out.println("Factorial Number Is :"+num);
			sc.close();
	}

}
