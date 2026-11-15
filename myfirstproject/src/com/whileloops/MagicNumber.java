package com.whileloops;

import java.util.Scanner;

//write a java program to find the given number is Magic Or Not ?
//ex:123456
//process is 1+2+3+4+5+6=21 so we add 21 is 2+1=3
//output:3 is not magic number,so magic number is total finish sum the answer is 1.

public class MagicNumber {
	static boolean isMagic(int n) {
		while(n>9) {
			int sum=0;
		while(n>0) {
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		n=sum;
		System.out.println(sum);
		}
		return n==1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number :");
		int n=sc.nextInt();
		if(isMagic(n)) {
			System.out.println("Given Number is a Magic Number");
		}else {
			System.out.println("Given Number is Not a Magic Number");
		}
		sc.close();
	}

}
