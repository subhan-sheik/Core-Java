package com.constructors;

public class Mobile {
	int mobileId;
	String brand;
	double price;
	Mobile(){
		this(101,"samsung");
	}
	Mobile(int mobileId,String brand){
		this(101,"Samsung",50000.0);
	}
	Mobile(int mobileId,String brand,double price){
		this.mobileId=mobileId;
		this.brand=brand;
		this.price=price;
	}
	void display() {
		System.out.println("mobile id :"+mobileId);
		System.out.println("brand name :"+brand);
		System.out.println("price :"+price);
	}

	public static void main(String[] args) {
		Mobile m=new Mobile();
		Mobile m2=new Mobile(102,"Apple",70000.0);
		m.display();
		System.out.println("----------------------");
		m2.display();

	}

}
