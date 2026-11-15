package com.ConditionalStatements;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr Your Number :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
				
			}
//			else {
//				System.out.println("Is Not a Even Number");
//				return;
//			}
			
		}
	}

}
