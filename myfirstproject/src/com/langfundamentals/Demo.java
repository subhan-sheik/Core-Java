package com.langfundamentals;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Arrays;

class Dog{
	
}
public class Demo {
//	Normal object data types
	BigInteger bi;
	BigDecimal bd;
	String s;
	Arrays a;
//	wrapper object data types
	Integer i;
	Short s1;
	Character c;
	Double dob;
//	user defined data types
	Dog d;

	public static void main(String[] args) {
		Demo d = new Demo();
		float f=123;
		float f1=0123;
//		float f2=123.5;    //Type mismatch: cannot convert from double to float
		float f3=123.5f;
		float f4=0123.5f;
		float f5=123f;
		float f6=0123f;
		float f7=0x123f;
//		float f8=0x123.5f;  //Invalid hex literal number
//		float f9=0x123.5;   //Invalid hex literal number
//		float f10=0xabc.5f;  //Invalid hex literal number
		
		System.out.println(f);
		System.out.println(f1);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f6);
		System.out.println(f7);
//		System.out.println(d.bi);
//		System.out.println(d.bd);
//		System.out.println(d.s);
//		System.out.println(d.a);
//		System.out.println(d.i);
//		System.out.println(d.s1);
//		System.out.println(d.c);
//		System.out.println(d.dob);
//		System.out.println(d.d);
	}

}
