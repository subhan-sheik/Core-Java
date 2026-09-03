package com.langfundamentals;

import java.util.Scanner;

public class PizzaHurt {

	double getPizzaPrice(char size) {
		if (size == 's' || size == 'S') {
			return 70;
		} else if (size == 'm' || size == 'M') {
			return 100;
		} else if (size == 'l' || size == 'L') {
			return 150;
		} else {
			return -1;
		}
	}

	double calculatePizzaCost(double price, int quantity) {
		if (quantity <= 0) {
			return -1;
		} else {
			price = price * quantity;
		}
		return price;
	}

	double calcualteDeliveryChargeByDistance(double distance) {
		if (distance >20) {
			return 150;
		} else if (distance >= 11) {
			return 100;
		} else if (distance >= 0) {
			return 70;
		} else {
			return -1;
		}

	}

	double calculateFinalBill(double pizzaCost, double deliveryCharge) {
		double finalBill = pizzaCost + deliveryCharge;
		return finalBill;
	}

	public static void main(String[] args) {
		PizzaHurt p = new PizzaHurt();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Pizza Size :");
		char size = sc.next().charAt(0);
		double price = p.getPizzaPrice(size);
		if (price == -1) {
			System.out.println("Invalid Size");
		} else {
			System.out.println("Enter Quantity :");
			int quantity = sc.nextInt();
			double pizzaCost = p.calculatePizzaCost(price, quantity);
			if (pizzaCost <=0) {
				System.out.println("Invalid Quantity");
			} else {
				System.out.println("Enter Distance Of Delivery");
				double distance = sc.nextDouble();
				double deliveryPrice = p.calcualteDeliveryChargeByDistance(distance);
				if (deliveryPrice == -1) {
					System.out.println("Invalid Distance");
				} else {
					System.out.println("Total Amount :" + p.calculateFinalBill(pizzaCost, deliveryPrice));
				}
			}
		}

	}

}
