package com.langfundamentals;

public class ShoppingCart {
	static String storeName="Smart Bazar";
	String customerName;
	String productName;
	double price; 
	int quantity;
	double discount1;
	double totalPrice;
	double finalAmount;
	void addProduct(String pName,double pr,int qty) {
		productName=pName;
		price=pr;
		quantity=qty;
		System.out.println("Product Added Successfully");
	}
	void calculateTotal(double discount) {
		System.out.println("Apply Discount");
		 totalPrice=price*quantity;
		 discount1=(totalPrice*discount)/100;
		finalAmount=totalPrice-discount1;		
	}
	void displayCart() {
		System.out.println("----------------------------------------");
		System.out.println("Store Name :"+storeName);
		System.out.println("Customer Name :"+customerName);
		System.out.println("Product Name :"+productName);
		System.out.println("Price :"+price);
		System.out.println("Quantity :"+quantity);
		System.out.println("Total Price:"+totalPrice);
		System.out.println("Discount :"+discount1);
		System.out.println("Final Amount :"+finalAmount);
		System.out.println("---------------------------------------");
	}

	public static void main(String[] args) {
		ShoppingCart s =new ShoppingCart();
		s.customerName="subhan";
		s.addProduct("Biscuits", 5000, 2);
		s.calculateTotal(5);
		s.displayCart();
	
	}

}
