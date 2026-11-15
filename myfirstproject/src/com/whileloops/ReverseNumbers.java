package com.whileloops;
//Input: 31573
//Output: 37513

import java.util.Scanner;

public class ReverseNumbers {
	static int reverse(int n) {
		int reverse=0;
		while(n>0) {
			int digit=n%10;
			n=n/10;
			reverse=reverse*10+digit;
		}
		return reverse;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr The Number :");
		int n=sc.nextInt();
		int result=reverse(n);
		System.out.println("Reverse Number Is :"+result);
		sc.close();
	}

}
