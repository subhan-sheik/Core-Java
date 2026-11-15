package com.ConditionalStatements;

import java.util.Scanner;

public class PalindromeNumberUsingRecursion {
	static int reverse=0;
	static void palinDrome(int n) {
		if(n==0) {
			return;
		}
		int digit=n%10;
		reverse=reverse*10+digit;
		palinDrome(n/10);
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number :");
		int num=sc.nextInt();
		palinDrome(num);
//		System.out.println(reverse);
		int original=num;
		if(original==reverse) {
			System.out.println("This Number Is Palindrome Number");
		}else {
			System.out.println("This Number Is Not a Palindrome Number");
		}
		sc.close();
	}

}
