package com.langfundamentals;
//write a Java program to Find the count of objects created in class without using instance block.

public class CountObject {
	static int count=0;
	CountObject(){
		count++;
	}

	public static void main(String[] args) {
		CountObject c=new CountObject();
		CountObject c1=new CountObject();
		CountObject c2=new CountObject();
		CountObject c3=new CountObject();
		System.out.println(count);
	}

}
