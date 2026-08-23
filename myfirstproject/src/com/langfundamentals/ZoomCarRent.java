package com.langfundamentals;

import java.util.Scanner;

public class ZoomCarRent {
	String getCompanyName() {
		return "Welcome To Benz ShowRoom";
	}

	double perDayRent() {
		return 1500;
	}

	double calculateBaseRental(double numberOfDays) {
		numberOfDays = numberOfDays * perDayRent();
		return numberOfDays;
	}

	double getInsurance() {
		return 500;
	}

	double calculateTotalCost(double result) {
		double totalCost = getInsurance() + result;
		return totalCost;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ZoomCarRent z = new ZoomCarRent();
		String name=z.getCompanyName();
		System.out.println(name);
		System.out.println("---------------------------------");
		System.out.println("Enter Number Of Days :");
		double numberOfDays = sc.nextDouble();
		double result = z.calculateBaseRental(numberOfDays);
		System.out.println("Total Days OF Car Rent :" + result);
		double result1 = z.calculateTotalCost(result);
		System.out.println("Total Cost And Insurance:" + result1);
		sc.close();

	}

}
