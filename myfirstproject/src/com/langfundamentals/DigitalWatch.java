package com.langfundamentals;

public class DigitalWatch {
	String brandName;
	String watchType;
	int hours;
	int minutes;
	int seconds;
	double price;

	void displayTime() {
		System.out.println("Update Time ");
		System.out.println("Time :" + hours + ":" + minutes + ":" + seconds);
	}

	void displayWatchDetails() {
		System.out.println("Brand Name :" + brandName);
		System.out.println("Watch Type :" + watchType);
		System.out.println("Price :" + price);
		System.out.println("Time :" + hours + ":" + minutes + ":" + seconds);
	}

	void updateHour() {
		hours += 1;
		System.out.println("Updated To 1 Hours ");
		System.out.println("Time :" + hours + ":" + minutes + ":" + seconds);

	}

	void updateMinutes() {
		minutes += 5;
		System.out.println("Updated To 5 Minutes  ");
		System.out.println("Time :" + hours + ":" + minutes + ":" + seconds);
	}

	public static void main(String[] args) {
		DigitalWatch d = new DigitalWatch();
		d.brandName = "Rolex";
		d.watchType = "Smart";
		d.price = 50000;
		d.hours = 2;
		d.minutes = 35;
		d.seconds = 40;
		d.displayWatchDetails();
		d.updateHour();
		d.updateMinutes();

	}

}
