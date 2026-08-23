package com.langfundamentals;

public class Demo4 {
	static int result;
	static void addition(int a, int b) {
		 result=a+b;
		System.out.println("Sum of Two numbers :"+result);
//		return result;
		subtraction(result, 10);
		multiplication(result, 6);
		division(result, 8);
	}

	static void subtraction(int result, int d) {
		 result-=d;
		System.out.println("Sub of two numbers :"+result);
//		return result;
	}

	static void multiplication(int result, int b) {
	   result*=b;
		System.out.println("multiple of two numbers :"+result);
//		return result;
	}

	static void division(int result, int b) {
		 result/=b;
		System.out.println("Division of two numbers :"+result);
//		return result;
	}

	public static void main(String[] args) {
		//Demo4 d = new Demo4();
		addition(10, 20);
//		int result=d.addition(10,20);
//		result=d.subtraction(result, 10);
//		result=d.multiplication(result, 6);
//		result=d.division(result, 8);
	}

}
