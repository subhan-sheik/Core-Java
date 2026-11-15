package com.whileloops;

import java.util.Scanner;

public class CountOfNUmbers {
	static int count(int n) {
		int count=0;
		if(n==0) {
			return 1;
		}
		while(n>0) {
			int digit=n%10;
			n=n/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number :");
		int n=sc.nextInt();
		int result=count(n);
		System.out.println(result);
		sc.close();
	}

}
