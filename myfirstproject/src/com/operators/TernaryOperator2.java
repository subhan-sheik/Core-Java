package com.operators;

//Find the Number Positive or Negative:

public class TernaryOperator2 {

	public static void main(String[] args) {
		int a=9;
		int b=-10;
		String num=(a>=0&&b>=0)?"Both Positive":(a>=0)?"A is Positive":(b>=0)?"B is Positive":"Both Negative";
		System.out.println(num);
	}

}
