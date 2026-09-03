package com.operators;

public class AssignmentOperator {

	public static void main(String[] args) {
//		int num;
//		int a=10;
//		int b=40;
//		num=a; //10
//		a=b; //40
//		b=num; //10 so a=40 and b=10
//		a=a^b; // 10^40=50
//		b=a^b; // 50^40=10
//		a=a^b; // 50^10=40 so a=40 and b=10
		int a, b, c;
		a = b = c = 10; // Multiple Assignments to be chained
		int d;
		int e = (d = 20); // Assignment Inside an Expression
		String name = "subhan";
		name += " sheik";
		int x = 10;
		double y = x; // int can convert double but double cannot convert int with out type casting,
						// so we convert double to int use casting means double x=10;int y=(int)x; it will works
		System.out.println(y);
		System.out.println(name);
		System.out.println(a);
		System.out.println(b);
		System.out.println(e);
		
	}

}
