package com.whileloops;
//Input: 234
//Output: 24
//Because: 2 × 3 × 4 = 24

import java.util.Scanner;

public class ProductOfDigits {
	static int product(int n) {
		int product=1;
		while(n>0) {
			int digit=n%10;
			n=n/10;
			product=product*digit;
		}
		return product;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr The Number :");
		int n=sc.nextInt();
		int num=product(n);
		System.out.println("Product Of Numbers :"+num);
		sc.close();
	}

}
