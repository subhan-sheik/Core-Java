package com.whileloops;

import java.util.Scanner;

public class OddPosition {
	static int oddPosition(int n) {
		int sum=0;
		int position=1;
		while(n>0) {
			int digit=n%10;
			if(position%2==1) {
				sum=sum+digit;
			}
			position++;
			n=n/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number :");
		int n=sc.nextInt();
		int result=oddPosition(n);
		System.out.println(result);
		
	}

}
