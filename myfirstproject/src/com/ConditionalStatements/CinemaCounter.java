package com.ConditionalStatements;

import java.util.Scanner;

public class CinemaCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String choose = "";
		int moviePrice = 0;
		int seatPrice = 0;

		do {
			System.out.println("1.Select Movie Name");
			System.out.println("2.Select Seat Type");
			System.out.println("3.Exit");
			System.out.println("Enter Your Choice :");
			n = sc.nextInt();
			switch (n) {
			case 1 -> {
				System.out.println("Select Your Movie :");
				System.out.println("1.Avengers Endgame");
				System.out.println("2.Paradise");
				System.out.println("3.OG2");
				int movieName = sc.nextInt();
				switch (movieName) {
				case 1 -> {
					System.out.println("Avengers Endgame Ticket Was Selected");
					moviePrice = 200;
				}
				case 2 -> {
					System.out.println("Paradise Ticket Was Selected");
					moviePrice = 210;
				}
				case 3 -> {
					System.out.println("OG2 Ticket Was Selected");
					moviePrice = 220;
				}
				default -> System.out.println("Invalid Movie Name");

				}
//			}
//			case 2 -> {
				System.out.println("Slect Your Seat Type :");
				System.out.println("1.Regular");
				System.out.println("2.Premium");
				System.out.println("3.Recliner");
				int seatType = sc.nextInt();
				switch (seatType) {
				case 1 -> {
					System.out.println("Regular Ticker price 250");
					seatPrice = 250;
				}
				case 2 -> {
					System.out.println("Premium Ticket Price 300");
					seatPrice = 300;
				}
				case 3 -> {
					System.out.println("Recliner Ticket Price 400");
					seatPrice = 400;
				}
				default -> System.out.println("Invalid Seat Type");
				}
			}
			case 3 -> System.out.println("Thank you for booking!");
			default -> System.out.println("Invalid Choice");
			}
			System.out.println("Do You Want To Continue..? Click Yes for Y or No for N..!");
			choose = sc.next();
		} while (choose.equalsIgnoreCase("y"));
		int totalPrice = moviePrice + seatPrice;
		System.out.println("Ticket Price: " + moviePrice);
		System.out.println("Seat Price: " + seatPrice);
		System.out.println("Total Amount: " + totalPrice);
		sc.close();
	}
}
