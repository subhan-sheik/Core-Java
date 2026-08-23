package com.langfundamentals;

import java.util.Scanner;

public class Demo7 {
	static Scanner sc = new Scanner(System.in);

	double calculateEMI() {
		System.out.println("Enetr your loan amount");
		double loanAmount = sc.nextDouble();
		System.out.println("Enter your annual interest rate");
		double interestRate = sc.nextDouble();
		System.out.println("Enter loantenure in years");
		int loanTenure = sc.nextInt();
		double monthlyRate = interestRate / 12 / 100;
		int numberOfMonths = loanTenure * 12;
		double emi = loanAmount * monthlyRate * Math.pow(1 + monthlyRate, numberOfMonths)
				/ (Math.pow(1 + monthlyRate, numberOfMonths) - 1);
		System.out.println("Simple Interest :" + monthlyRate);
		System.out.println("Total Amount :" + numberOfMonths);
		return emi;
	}

	public static void main(String[] args) {
		Demo7 d = new Demo7();
		double result = d.calculateEMI();
		System.out.println("Monthly EMI :" + result);
		sc.close();

	}

}
