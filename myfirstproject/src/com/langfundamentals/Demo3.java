package com.langfundamentals;

public class Demo3 {
	static String electricityBoard="TGSPDCL";
	int customerId;
	String customerName;
	int units;
	void calculateBill() {
		double bill;
		if(units<=100) {
			bill=units*2;
		}else if(units<=200) {
			bill=units*3;
		}else {
			bill =units*5;
		}
		System.out.println("Bill Amount :"+bill);
		
	}
	void displayCustomers() {
		System.out.println("Electricity Board :"+electricityBoard);
		System.out.println("Customer ID :"+customerId);
		System.out.println("Customer Name :"+customerName);
		System.out.println("Units :"+units);
	}

	public static void main(String[] args) {
		Demo3 d = new Demo3();
		Demo3 d1 = new Demo3();
		Demo3 d2 = new Demo3();
		d.customerId=101;
		d.customerName="subhan";
		d.units=120;
		d.displayCustomers();
		d.calculateBill();
		System.out.println("-------------------------------------");
		d1.customerId=102;
		d1.customerName="pavan";
		d1.units=170;
		d1.displayCustomers();
		d1.calculateBill();
		System.out.println("-------------------------------------");
		d2.customerId=103;
		d2.customerName="hari";
		d2.units=200;
		d2.displayCustomers();
		d2.calculateBill();
	}

}
