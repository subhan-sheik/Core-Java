package com.whileloops;
//Input: 205040
//Output: 3

import java.util.Scanner;

public class CountZeros {
	static int count(int n) {
		int count =0;
		while(n>0) {
			int digit=n%10;
			if(digit==0) {
				count++;
			}
			n=n/10;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number :");
		int n = sc.nextInt();
		int result=count(n);
		System.out.println("Count Of Zeros Is :"+result);
		sc.close();
	}

}
