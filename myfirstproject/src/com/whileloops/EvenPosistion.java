package com.whileloops;

import java.util.Scanner;

//write a java program to print the sum of digits in the even position of given number 
//Ex:-given number  31573
//index order       54321 because we use digit=n%10 so calculate right side
//so we add even position numbers are 5,3,1 means 3+5+3=11
//Output:-11

public class EvenPosistion {
	static int evenPosition(int n) {
		int sum=0;
		int position=1;
		while(n>0) {
			int digit=n%10;
			if(position%2==0) {
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
		int result=evenPosition(n);
		System.out.println(result);
				
		
	}

}
