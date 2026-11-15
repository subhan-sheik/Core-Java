package com.whileloops;
//Input: 246813
//Output: 4

import java.util.Scanner;

public class CountOfEvenDigits {
	static int count(int n) {
		int count =0;
		while(n>0) {
			int digit=n%10;
			if(digit%2==0) {
			count++;
			}
			n=n/10;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number :");
		int n=sc.nextInt();
		int result=count(n);
		System.out.println("Count Of Even Numbers :"+result);
		sc.close();
	}

}
