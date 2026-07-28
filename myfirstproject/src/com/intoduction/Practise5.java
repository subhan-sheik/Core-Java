package com.intoduction;

public class Practise5 {
	int totalAmount;
	int oneShirt;
	int onePant;
	void show() {
		int  shirtPant=oneShirt+onePant;
		int totalAmountSpent=shirtPant;
		int reaminingAmount=totalAmount-shirtPant;
		System.out.println("Total Amount Spent :"+totalAmountSpent);
		System.out.println("Remaining Amount :"+reaminingAmount);
	}

	public static void main(String[] args) {
		Practise5 t1 = new Practise5();
		t1.totalAmount=1000;
		t1.oneShirt=350;
		t1.onePant=450;
		System.out.println("Total Amount :"+t1.totalAmount);
		System.out.println("One Shirt :"+t1.oneShirt);
		System.out.println("One Pant :"+t1.onePant);
		t1.show();
		
	}

}

//another type of solution:

//public class Practise5 {
//	
//}
//public static void main(String[] args) {
//	int totalAmount=1000;
//	int oneShirt=350;
//	int onePant=450;
//	int pantShirt=oneShirt+onePant;
//	int totalAmountSpent=pantShirt;
//	int remainingAmount=totalAmount-pantShirt;
//	System.out.println("total amount :"+totalAmount);
//	System.out.println("one shirt :"+oneShirt);
//	System.out.println("one Pant :"+onePant);
//	System.out.println("total amount spent :"+totalAmountSpent);
//	System.out.println("reamaining amount :"+remainingAmount);
//}
//}
