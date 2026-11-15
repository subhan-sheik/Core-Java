package com.ConditionalStatements;

import java.util.Scanner;

public class VegetableFruitShop {

	public static void main(String[] args) {
		System.out.println("---------Welcome to VegetableFruitShop---------");
		Scanner sc = new Scanner(System.in);
		String choose = " ";
		String chooseFruits = " ";
		String chooseVegetables = " ";
		double totalFruitsCost = 0;
		double totalVegetablesCost = 0;
		do {
			System.out.println("Enter your Item Name :");
			String item = sc.next().toLowerCase();
			switch (item) {

			case "fruits" -> {
				do {
					System.out.println("Enter Your Fruits Name :");
					String fruit = sc.next().toLowerCase();
					switch (fruit) {
					case "apple" -> {
						System.out.println("Per Kg Apple is 150rs");
						int quantity;
						do {
							System.out.println("Enter Your Quantity :");
							quantity = sc.nextInt();
						} while (!quantity(quantity));
						double apple = 150;
						totalFruitsCost = totalFruitsCost + apple * quantity;
					}
					case "banana" -> {
						System.out.println("Per Dozen Banana is 100rs");
						int quantity;
						do {
							System.out.println("Enter Your Quantity :");
							quantity = sc.nextInt();
						} while (!quantity(quantity));
						double banana = 100;
						totalFruitsCost = totalFruitsCost + banana * quantity;
					}

					case "papaya" -> {
						System.out.println("Per Kg Papaya is 200rs");
						int quantity;
						do {
							System.out.println("Enter Your Quantity :");
							quantity = sc.nextInt();
						} while (!quantity(quantity));
						double papaya = 200;
						totalFruitsCost = totalFruitsCost + papaya * quantity;
					}

					case "orange" -> {
						System.out.println("Per Kg Orange is 90rs");
						int quantity;
						do {
							System.out.println("Enter Your Quantity :");
							quantity = sc.nextInt();
						} while (!quantity(quantity));
						double orange = 90;
						totalFruitsCost = totalFruitsCost + orange * quantity;
					}

					case "grapes" -> {
						System.out.println("Per Kg Grapes is 120rs");
						int quantity;
						do {
							System.out.println("Enter Your Quantity :");
							quantity = sc.nextInt();
						} while (!quantity(quantity));
						double grapes = 120;
						totalFruitsCost = totalFruitsCost + grapes * quantity;

					}
					default -> System.err.println("Invalid Fruit");
					}
					System.out.println("Do You Want To Continue With Fruits..? Click  Y for Yes or N for No");
					chooseFruits = sc.next();
				} while (chooseFruits.equalsIgnoreCase("y"));
			}
			case "vegetables" -> {
				do {
					System.out.println("Enter Your Vegetables Name :");

					String vegetable = sc.next().toLowerCase();
					switch (vegetable) {
					case "tomato" -> {
						System.out.println("Per Kg Tomato is 70rs");
						int quantity;
						do {
							System.out.println("Enter Your Quantity :");
							quantity = sc.nextInt();
						} while (!quantity(quantity));
						double tomato = 70;
						totalVegetablesCost = totalVegetablesCost + tomato * quantity;
					}
					case "brinjal" -> {
						System.out.println("Per Kg Brinjal is 80rs");
						int quantity;
						do {
							System.out.println("Enter Your Quantity :");
							quantity = sc.nextInt();
						} while (!quantity(quantity));
						double brinjal = 80;
						totalVegetablesCost = totalVegetablesCost + brinjal * quantity;
					}

					case "ladyfinger" -> {
						System.out.println("Per Kg LadyFinger is 60rs");
						int quantity;
						do {
							System.out.println("Enter Your Quantity :");
							quantity = sc.nextInt();
						} while (!quantity(quantity));
						double ladyFinger = 60;
						totalVegetablesCost = totalVegetablesCost + ladyFinger * quantity;
					}

					case "onions" -> {
						System.out.println("Per Kg Onions is 100rs");
						int quantity;
						do {
							System.out.println("Enter Your Quantity :");
							quantity = sc.nextInt();
						} while (!quantity(quantity));
						double onions = 100;
						totalVegetablesCost = totalVegetablesCost + onions * quantity;
					}

					default -> System.err.println("Invalid Vegetables");
					}
					System.out.println("Do You Want To Continue With Vegetables..? Click  Y for Yes or N for No");
					chooseVegetables = sc.next();
				} while (chooseVegetables.equalsIgnoreCase("y"));

			}
			default -> System.err.println("Invalid Items");
			}
			System.out.println("Do You Want To Continue With Another Item..? Click  Y for Yes or N for No");
			choose = sc.next();
		} while (choose.equalsIgnoreCase("y"));
		System.out.println("Total Fruits Cost :" + totalFruitsCost);
		System.out.println("Total Vegetables Cost :" + totalVegetablesCost);
		System.out.println("Grand Total :" + (totalFruitsCost + totalVegetablesCost));
		sc.close();
	}

	static boolean quantity(int quantity) {
		if (quantity <= 0) {
			System.err.println("Invalid Quantity");
			return false;
		}
		return true;
	}

}
