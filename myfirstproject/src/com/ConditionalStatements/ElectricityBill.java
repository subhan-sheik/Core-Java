package com.ConditionalStatements;

import java.util.Scanner;

public class ElectricityBill {
	static void displayElectricityBillDetails(String connectionType,int units,int rate,double bill ) {
		System.out.println("\n----- ELECTRICITY BILL -----");
        System.out.println("Connection Type : " + connectionType);
        System.out.println("Units Consumed   : " + units);
        System.out.println("Rate Per Unit    : ₹" + rate);
        System.out.println("Total Electricity Bill : ₹" + bill);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Connection Type(1.Domestic Connection and 2.Commerical Connection) :");
		int type = sc.nextInt();
		if(type!=1 && type!=2) {
			System.out.println("Invalid Connection Type");
			return;
		}
		System.out.println("Enter The Number Of Units :");
		int units = sc.nextInt();
		String connectionType = " ";
		double bill = 0;
		int rate = 0;
		if (units <0) {
			System.out.println("Invalid Units..Please Enter Valid Units");
			return;
		}
		switch (type) {
		case 1 -> {
			connectionType = "Domestic";
			if (units >= 0 && units <= 100) {
				rate = 2;
				bill = units * rate;
			} else if (units > 100 && units <= 200) {
				rate = 3;
				bill = units * rate;
			} else if (units > 200 && units <= 300) {
				rate = 5;
				bill = units * rate;
			} else  {
				rate = 7;
				bill = units * rate;
				return;
			}
		}
		case 2->{
			connectionType="Commerical";
			if(units > 0 && units <= 100) {
				rate = 4;
				bill = units * rate;
			}else if(units > 100 && units <= 200) {
				rate = 6;
				bill = units * rate;
			}else {
				rate = 8;
				bill = units * rate;
			}
		}
		}
		displayElectricityBillDetails(connectionType, units, rate, bill);
        sc.close();
	}
}
