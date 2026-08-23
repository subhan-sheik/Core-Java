package com.langfundamentals;

public class Courier {
	String customerName;
	int customerId;
	String source;
	String destination;
	double weight;
	double deliveryAmount;
	int courier;
	static int totalCouriers;
	static double totalWeight;
	static double totalAmountCollected;
	static double pricePerKg = 100;

	void bookCourier() {
		deliveryAmount = pricePerKg * weight;
		totalCouriers++;
		totalWeight += weight;
		totalAmountCollected += deliveryAmount;
		System.out.println("Your order Successfully Booked ");
		System.out.println();
	}

	void displayCourierDetails() {
		System.out.println("---------Courier Details-----------");
		System.out.println("Customer Name :" + customerName);
		System.out.println("Customer ID :" + customerId);
		System.out.println("Source :" + source);
		System.out.println("Destination :" + destination);
		System.out.println("Weight :" + weight + "kgs");
		System.out.println("Deliver Amount :" + deliveryAmount);
		System.out.println();
	}

	static void todaysCollection() {
		System.out.println("---------Todays Collection---------- ");
		System.out.println("Total Courier Booked :" + totalCouriers);
		System.out.println("Total Weight :" + totalWeight);
		System.out.println("Total Amount Collected :" + totalAmountCollected);
	}

	static {
		System.out.println("Welcome to Quickship Courier!");
		System.out.println("------------------------------------");
	}

	public static void main(String[] args) {
		Courier c = new Courier();
		Courier c1 = new Courier();
		c.customerName = "subhan";
		c.customerId = 101;
		c.source = "Ameerpet";
		c.destination = "KPHB";
		c.weight = 5;
		c.bookCourier();
		c.displayCourierDetails();
		c1.customerName = "pavan";
		c1.customerId = 102;
		c1.source = "Ameerpet";
		c1.destination = "KPHB";
		c1.weight = 6;
		c1.bookCourier();
		c1.displayCourierDetails();
		todaysCollection();
	}

}
