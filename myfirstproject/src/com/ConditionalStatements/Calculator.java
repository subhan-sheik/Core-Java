package com.ConditionalStatements;

import java.util.Scanner;

//write a program to implement a calculator

public class Calculator {

	public static void main(String[] args) {
		System.out.println("----------Calculator Info-----------");
		String yn;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Enter a First Number :");
		int x=sc.nextInt();
		System.out.println("Enter a Second Number :");
		int y=sc.nextInt();
		System.out.println("Enter a Symbol to Calculate Value :");
		String sym=sc.next();
		double result=0;
		switch(sym) {
		case "+" ->{
			System.out.println("The Values are Calculating With Addition ");
			result= x+y;
		}
		case "-" ->{
			System.out.println("The Values are Calculating With Subtraction ");
			result= x-y;
		}
		case "*" ->{
			System.out.println("The Values are Calculating With Multiplication ");
			result= x*y;
		}
		case "/" ->{
			System.out.println("The Values are Calculating With Division ");
			result= x/y;
		}
		
		case "%" ->{
			System.out.println("The Values are Calculating With Modulas ");
			result= x%y;
		}
		default ->System.out.println("Enetred Symbole is Invalid");
		}
		System.out.println("The Resulted Value is :"+result);
		System.out.println("---------------------------------------------");
		System.out.println("Do You Want To Continue..? Click  Y for Yes or N for No");
		yn=sc.next();
		} while(yn.equalsIgnoreCase("y"));
	}

}
