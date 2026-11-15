package com.whileloops;
//Input: 246813
//Output: 4
//Because: Odd digits → 1 + 3 = 4

import java.util.Scanner;

public class SumOfOddDigits {
	static int oddDigits(int n) {
		int sum=0;
		while(n>0) {
			int digit=n%10;
			if(digit%2==1) {
				sum=sum+digit;
			}
			n=n/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number :");
		int n=sc.nextInt();
		int result=oddDigits(n);
		System.out.println("Sum Of Odd Digits :"+result);
		sc.close();
	}

}
