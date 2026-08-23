package com.langfundamentals;

public class VandeExpress {
	String passengerName;
	int age;
	String source;
	String destination;
	int numberOfTickets;
	static int totalTicketsBought;
	int ticketAmount;
	static int totalAmount;
	static int price = 500;
	static {
		System.out.println("Welcome to Vande Express thank you for choosing us");
	}

	void bookTicket() {
		ticketAmount = price * numberOfTickets;
		totalTicketsBought += numberOfTickets;
		totalAmount += ticketAmount;
		System.out.println("Your Ticket Is Successfully Booked");
		System.out.println();
	}

	void displayBookingDetails() {
		System.out.println("Passenger Name :" + passengerName);
		System.out.println("Age :" + age);
		System.out.println("Source :" + source);
		System.out.println("Destination :" + destination);
		System.out.println("Number Of Tickets :" + numberOfTickets);
		System.out.println("-----------------------------------------");
	}

	static void ticketCounter() {
		System.out.println("Total Tickets Bought :" + totalTicketsBought);
		System.out.println("Total Amount :" + totalAmount);
	}

	public static void main(String[] args) {
		VandeExpress v = new VandeExpress();
		VandeExpress v1 = new VandeExpress();
		VandeExpress v2 = new VandeExpress();
		v.passengerName = "subhan";
		v.age = 21;
		v.source = "hyderbad";
		v.destination = "Kakinada";
		v.numberOfTickets = 2;
		v.bookTicket();
		v.displayBookingDetails();
		v1.passengerName = "pavan";
		v1.age = 23;
		v1.source = "hyderbad";
		v1.destination = "Kakinada";
		v1.numberOfTickets = 3;
		v1.bookTicket();
		v1.displayBookingDetails();
		v2.passengerName = "pavan";
		v2.age = 23;
		v2.source = "hyderbad";
		v2.destination = "Kakinada";
		v2.numberOfTickets = 4;
		v2.bookTicket();
		v2.displayBookingDetails();
		ticketCounter();
	}

}
