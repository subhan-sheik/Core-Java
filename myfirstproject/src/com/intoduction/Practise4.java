package com.intoduction;

// one type of solution:

//public class Practise4 {
//
//	public static void main(String[] args) {
//		int totalMoney=100;
//		int pencilCost=7;
//		int pencilsBuy = totalMoney/pencilCost;
//		int moneyLeft=totalMoney%pencilCost;
//				
//		System.out.println("Total Money :"+totalMoney+"Rs");
//		System.out.println("Pencil Cost :"+pencilCost+"rupees");
//		System.out.println("Pencils Buy :"+totalMoney/pencilCost+"Pencils");
//		System.out.println("Money_left :"+totalMoney%pencilCost+"rupees");
//
//	}
//
//}

// anther type of solution:

public class Practise4 {
	int total_Amount;
	int choclate_Cost;
	void show() {
		int choclate_Buy=total_Amount/choclate_Cost;
		int money_Left=total_Amount%choclate_Cost;
		System.out.println("Choclate Buy :"+choclate_Buy);
		System.out.println("Money Left :"+money_Left);
	}

	public static void main(String[] args) {
		Practise4 t1=new Practise4();
		t1.total_Amount=250;
		t1.choclate_Cost=18;
		System.out.println("Total Amount :"+t1.total_Amount);
		System.out.println("Choclate Cost :"+t1.choclate_Cost);
		t1.show();
	}

}

//another type of solution:

//public class Practise4 {
//	static int oneBox=12;
//	static int totalApples=150;
//	static void show() {
//		int fullBoxes= totalApples/oneBox;
//		int remainingApples=totalApples%oneBox;
//		System.out.println("full boxes :"+fullBoxes);
//		System.out.println("remaining apples :"+remainingApples);
//	}
//
//	public static void main(String[] args) {
//		System.out.println("total apples :"+totalApples);
//		System.out.println("one box :"+oneBox);
//		show();
//	}
//
//}