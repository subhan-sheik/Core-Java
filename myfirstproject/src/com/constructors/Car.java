package com.constructors;
//super() Constructor Chaining

class Vehicle{
	String brand;
	String model;
	Vehicle(){
		this("Toyato","Fortuner");
	}
	Vehicle(String brand, String model){
		this.brand=brand;
		this.model=model;
	}
	
}
public class Car extends Vehicle {
	String fuelType;
	double price;
	Car(){
		super();
	}
	Car(String brand, String model, String fuelType, double price){
		super(brand,model);
		this.fuelType=fuelType;
		this.price=price;
	}
	void displayCarDetails() {
		System.out.println("Brand :"+brand);
		System.out.println("Model :"+model);
		System.out.println("Fuel Type :"+fuelType);
		System.out.println("Price :"+price);
	}

	public static void main(String[] args) {
            Car c=new Car();
            c.displayCarDetails();
            System.out.println("-----------------------------");
            Car c1=new Car("Toyota", "Fortuner", "Diesel", 4000000);
            c1.displayCarDetails();
	}

}
