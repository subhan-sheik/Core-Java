package com.whileloops;

import java.util.Scanner;

public class BikeRentalSystem {
	static Scanner sc = new Scanner(System.in);

	static double calculateBikeCharge(int hours) {
		double charge = hours * 50;
		if (hours > 5) {
			double discount = charge * 10 / 100;
			charge=charge-discount;

		}
		return charge;
	}

	static double calculateCustomerBill(int bikes) {
		int bikeCount = 1;
		double customerBill = 0;
		while (bikeCount <= bikes) {
			System.out.println("Enter Rental Hours For Bike " + bikeCount + " :");
			int hours = sc.nextInt();
			double charge = calculateBikeCharge(hours);
			customerBill = customerBill + charge;
			
			bikeCount++;
		}

		return customerBill;
	}

	public static void main(String[] args) {
		System.out.println("Enter Number Of Customers :");
		int customers = sc.nextInt();
		double totalIncome = 0;
		for (int i = 1; i <= customers; i++) {
			System.out.println("Customer " + i);
			System.out.println("Enter Number Of Bikes :");
			int bikes = sc.nextInt();
			double bill = calculateCustomerBill(bikes);
			System.out.println("Customer Bill : ₹" + bill);
			totalIncome = totalIncome + bill;
		}
		System.out.println("Total Income : ₹" + totalIncome);
		sc.close();
	}
}
