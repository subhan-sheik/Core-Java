package com.intoduction;

public class Resturant1 {
	static String resturantName="Pizza Hut";
	int items;
	double totalAmount;
	String orderPlaced;
	void addItems() {
		items+=2;
		totalAmount+=300;
		System.out.println("Items added successfully");
	}
	void displayCart() {
		System.out.println("Website Name :"+resturantName);
		System.out.println("Order Items :"+items);
		System.out.println("Total Amount :"+totalAmount);
		System.out.println("Order Status :"+orderPlaced);
		System.out.println("----------------------------------------");
	}
	void placeOrder() {
		orderPlaced="placed";
		System.out.println("Order Placed successfully");
	}
	static void changeName() {
		resturantName="swiggy";
		System.out.println("Resturant Name changed successfully");
	}
	static void displayResturant() {
		System.out.println("Resturant Name :"+resturantName);
		System.out.println("---------------------------------------");
	}

	public static void main(String[] args) {
		displayResturant();
		Resturant1 r = new Resturant1();
		Resturant1 r1 = new Resturant1();
		r.items=3;
		r.totalAmount=750;
		r.orderPlaced="Not placed";
		r1.items=2;
		r1.totalAmount=500;
		r1.orderPlaced="Not placed";
		r.displayCart();
		r1.displayCart();
		r.placeOrder();
		r1.addItems();
		changeName();
		System.out.println("updated cart details");
		System.out.println("------------------------------------------");
		r.displayCart();
		r1.displayCart();
	}

}
