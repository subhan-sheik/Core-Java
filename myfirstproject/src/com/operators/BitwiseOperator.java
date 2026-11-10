package com.operators;
//the bitwise operators are AND(&),OR(|) and XOR(^).

public class BitwiseOperator {

	public static void main(String[] args) {
		System.out.println(4&5); //output is 4  4=0100
//		                                        5=0101
//		                                      ans=0100 because we use AND(&) operator.
		System.out.println(6&3);
		
		System.out.println(4|5); //output is 5  4=0100
//                                              5=0101
//                                            ans=0101 because we use OR(|) operator.
		System.out.println(4^5); //output is 1  4=0100
//                                              5=0101
//                                            ans=0001 because we use XOR(^) operator.
	}

}
