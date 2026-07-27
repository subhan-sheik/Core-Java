package com.intoduction;

public class Cricketer {
	static String countryName;
	static String boardName;
	String crickterName; 
	int jersyNo;
	int age;

	public static void main(String[] args) {
		countryName="india";
		boardName="bcci";
		Cricketer msdhoni = new Cricketer();
		msdhoni.crickterName="msdhoni";
		msdhoni.jersyNo=7;
		msdhoni.age=47;
		System.out.println("     player no 1");
		System.out.println("Country Name  :" +countryName);
		System.out.println("Board Name    :" +boardName);
		System.out.println("Cricketer Name:" +msdhoni.crickterName);
		System.out.println("Jersy No      :" +msdhoni.jersyNo);
		System.out.println("Age           :" +msdhoni.age);
		System.out.println("     player no 2");
		Cricketer viratkholi = new Cricketer();
		viratkholi.crickterName="viratkholi";
		viratkholi.jersyNo=18;
		viratkholi.age=45;
		System.out.println("Country Name  :" +countryName);
		System.out.println("Board Name    :" +boardName);
		System.out.println("Cricketer Name:" +viratkholi.crickterName);
		System.out.println("Jersy No      :" +viratkholi.jersyNo);
		System.out.println("Age           :" +viratkholi.age);
	}

}
