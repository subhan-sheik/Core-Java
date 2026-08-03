package com.intoduction;

public class Restaurant {
	static String restaurantName = "khadi Restaurant";
	int tableNumber;
	int seats;
	String reserved;
	boolean status = false;

	void tableDetails() {
		System.out.println("Table Number :" + tableNumber);
		System.out.println("Seats Available :" + seats);
	}

	void reserveTable() {
		status = true;
		reserved = "201 Table is Reserved";
		System.out.println("Reserved :" + reserved);
	}

	void cancelReservation() {
		if (status) {
			System.out.println("Cancel Reservation  for the table :"+tableNumber +"Available");

		}
		else {
			System.out.println("without reservation we cant cancel the resevation");
		}
	}

	static void restaurantName() {
		System.out.println("Restaurant Name :" + restaurantName);
	}

	static void changeRestaurantName() {
		System.out.println("New Restaurant Name :" + restaurantName);
	}

	public static void main(String[] args) {
		restaurantName();
		Restaurant r = new Restaurant();
		r.tableNumber = 201;
		r.seats = 8;
		r.tableDetails();
		r.reserveTable();
		r.cancelReservation();
	}

}
