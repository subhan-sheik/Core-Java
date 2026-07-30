package com.intoduction;

public class LibraryBook {
	static String libraryName="Central Library";
	static String librarianName="subhan";
	int bookId;
	String bookTitle;
	String authorName;
	int availableCopies =0;
	static void libraryDetails() {
		System.out.println("Library Name :"+libraryName);
		System.out.println("Librarian Name :"+librarianName);
	}
	static void changeLibrarain() {
		System.out.println("Librarian Name :"+librarianName);
	}
	void displayBookdetails() {
		System.out.println("Book Id :"+bookId);
		System.out.println("Book Title :"+bookTitle);
		System.out.println("Author Name :"+authorName);
		System.out.println("Available Copies :"+availableCopies);
	}
	void issueBook() {
		availableCopies--;
		System.out.println("Book Issued");
		System.out.println("Available books :"+availableCopies);
	}

	public static void main(String[] args) {
		libraryDetails();
		LibraryBook b = new LibraryBook();
		b.bookId=2201;
		b.bookTitle="Mystery Of Land";
		b.authorName="Mr.pavan";
		b.availableCopies=12;
		b.displayBookdetails();
		b.issueBook();
		System.out.println("****************************");
		LibraryBook b1 = new LibraryBook();
		librarianName="sai pavan";
		changeLibrarain();
		b1.bookId=2203;
		b1.bookTitle="Magic Land";
		b1.authorName="Mr.sai";
		b1.availableCopies=10;
		b1.displayBookdetails();
		b1.issueBook();
		System.out.println("****************************");
	}

}
