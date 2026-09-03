package com.constructors;

public class Book {
	int bookId;
	String bookName;
	double price;
	Book(int bookId,String bookName,double price){
		this.bookId=bookId;
		this.bookName=bookName;
		this.price=price;
		
	}
	Book(Book b){
		bookId=b.bookId;
		bookName=b.bookName;
		price=b.price;
	}
	void display() {
		System.out.println("book id :"+bookId);
		System.out.println("book name :"+bookName);
		System.out.println("price :"+price);
	}

	public static void main(String[] args) {
		Book b1=new Book(101,"bbok",23222.0);
		Book b2=new Book(b1);
		b1.display();
		System.out.println("-----------------------");
		b2.display();
	}

}
