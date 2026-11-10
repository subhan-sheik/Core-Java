package com.operators;
//Use a lambda to return the greater number.
//Test with:
//45, 78
//Expected output: 78

public class LambdaOperator4 {
	@FunctionalInterface
	interface Number{
		int findMax(int a,int b);
	}

	public static void main(String[] args) {
		Number n=(a,b)->{
			if(a>=b) {
				return a;
			}else {
				return b;
			}
		};
		int result=n.findMax(85, 78);
		System.out.println(result);
	}

}
