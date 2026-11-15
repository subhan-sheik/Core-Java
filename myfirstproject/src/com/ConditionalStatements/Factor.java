package com.ConditionalStatements;
//factor means a number that divides another number completely (remainder 0).
//ex:Numbers that divide 12 exactly are:
//1 → 12 ÷ 1 = 12
//2 → 12 ÷ 2 = 6
//3 → 12 ÷ 3 = 4
//4 → 12 ÷ 4 = 3
//6 → 12 ÷ 6 = 2
//12 → 12 ÷ 12 = 1
//So, factors of 12 = 1, 2, 3, 4, 6, 12.

import java.util.Scanner;

public class Factor {
	static void factors(int num) {
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number :");
		int num=sc.nextInt();
		factors(num);
		if(num>0) {
			
		}else {
			System.out.println("Invalid Number");
		}
		sc.close();

	}

}
