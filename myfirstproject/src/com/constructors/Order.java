package com.constructors;
//E-Commerce Order

public class Order {
	int orderId;
	String customerName;
	String productName;
	int quantity;
	double price;
	double totalAmount;
	Order(){
		this(101);
	}
	Order(int orderId){
		this(orderId,"subhan");
	}
	Order(int orderId,String customerName){
		this(orderId,customerName,"phone",2,50000.0);
	}
	Order(	int orderId,String customerName,String productName,int quantity,double price){
		this.orderId=orderId;
		this.customerName=customerName;
		this.productName=productName;
		this.quantity=quantity;
		this.price=price;
		totalAmount=quantity*price;
	}
	void displayOrderDetails() {
		System.out.println("Order ID :"+orderId);
		System.out.println("Customer Name :"+customerName);
		System.out.println("Product Name :"+productName);
		System.out.println("Quantity :"+quantity);
		System.out.println("Price :"+price);
		System.out.println("Total Amount :"+totalAmount);
	}

	public static void main(String[] args) {
		Order o=new Order();
		o.displayOrderDetails();
	}

}
