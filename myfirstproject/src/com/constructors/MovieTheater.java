package com.constructors;
//Copy COnstructor...



public class MovieTheater {
	String movieName;
	String language;
	double ticketPrice;
	MovieTheater(String movieName,String language,double ticketPrice){
		this.movieName=movieName;
		this.language=language;
		this.ticketPrice=ticketPrice;
		
	}
	MovieTheater(MovieTheater m,double ticketPrice){
		movieName=m.movieName;
		language=m.language;
		this.ticketPrice=ticketPrice;
	}
	void displayMovieDetails() {
		System.out.println("Movie Name :"+movieName);
		System.out.println("Language :"+language);
		System.out.println("Ticket Price :"+ticketPrice);
	}

	public static void main(String[] args) {
		MovieTheater m1=new MovieTheater("RRR","Telugu",350.0);
		MovieTheater m2=new MovieTheater(m1,500.0);
		m1.displayMovieDetails();
		System.out.println("---------------------------");
		m2.displayMovieDetails();

	}

}
