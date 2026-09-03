package com.operators;
//unary operator are +(unary plus), -(unary minus), ++(increment), --(decrement), !(logical not ), ~(bitwise complement operator)

public class UnaryOperator {

	public static void main(String[] args) {
		int a=5;
		int b=6;
		System.out.println(+a); //unary +a=5
		System.out.println(-a); //unary -a=-5
		System.out.println(++a);
		System.out.println(--a);
		System.out.println(a++);
		System.out.println(a--);
		System.out.println(++b);
		System.out.println(--b);
		System.out.println(b++);
		System.out.println(b--);
		System.out.println("A Value is "+a);
		System.out.println("B Value is :"+b);
		System.out.println(a++ + ++a + ++b + b++);
		System.out.println(++a - a++ + ++b - b++);
		System.out.println(--a + a-- + --b + b--);
		System.out.println("A value is :"+a);
		System.out.println("B value is :"+b);
		boolean x=!true;
		System.out.println(x);
		boolean y=false;
		System.out.println(!y);
		int age = 20;
		System.out.println(!(age >= 18)); //this statement is true but we assign logical not ! so answer is false
		int c = 5;
		System.out.println(~c); // bitwise complement ~ formula is -(n+1) so -(5+1) is -(6) answer is -6
	}

}
