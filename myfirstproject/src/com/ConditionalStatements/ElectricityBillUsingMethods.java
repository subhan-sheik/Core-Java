package com.ConditionalStatements;

import java.util.Scanner;

public class ElectricityBillUsingMethods {
	static String getConnectionType(int type) {
		if (type == 1) {
			return "Domestic";
		} else if (type == 2) {
			return "Commercial";
		} else {
			return "Invalid";
		}
	}

	static double getRate(int type, int units) {
		if (type == 1) {
			if (units >= 0 && units <= 100) {
				return 3;
			} else if (units > 100 && units <= 200) {
				return 3;
			} else if (units > 200 && units <= 300) {
				return 5;
			} else {
				return 7;
			}
		} else {
			if (units >= 0 && units <= 100) {
				return 4;
			} else if (units > 100 && units <= 200) {
				return 6;
			} else {
				return 8;
			}
		}

	}

	static double calculateBill(int units, double rate) {
		double bill = units * rate;
		return bill;
	}

	static void displayElectricityBillDetails(String connectionType, int units, double rate, double bill) {
		System.out.println("\n----- ELECTRICITY BILL -----");
		System.out.println("Connection Type        : " + connectionType);
		System.out.println("Units Consumed         : " + units);
		System.out.println("Rate Per Unit          : ₹" + rate);
		System.out.println("Total Electricity Bill : ₹" + bill);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Connection Type :");
		System.out.println("1. Domestic Connection");
		System.out.println("2. Commercial Connection");
		int type = sc.nextInt();
		String connectionType = getConnectionType(type);
		if (connectionType.equals("Invalid")) {
			System.out.println("Invalid Connection Type");
			return;
		}
		System.out.println("Enter The Number Of Units :");
		int units = sc.nextInt();
		if (units < 0) {
			System.out.println("Invalid Units");
			return;
		}
		double rate = getRate(type, units);
		double bill = calculateBill(units, rate);
		displayElectricityBillDetails(connectionType, units, rate, bill);
		sc.close();
	}

}
