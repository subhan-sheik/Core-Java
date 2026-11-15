package com.ConditionalStatements;

import java.util.Scanner;

public class OnlineHospitalAppointmentBookingSystem {
	static boolean checkAge(int age) {
		if (age < 0) {
			System.out.println("Invalid Age");
			return false;
		}
		return true;
	}

	static boolean patientType(int patientType) {
		if (patientType != 1 && patientType != 2) {
			System.out.println("Patient Type is Invalid");
			return false;
		}
		return true;
	}

	static void bookAppointment(int patientType, int availability) {
		if (patientType == 1) {
			if (availability == 1) {
				System.out.println("Regular Appointment Confirmed");
			} else if (availability == 2) {
				System.out.println("Please Select Another Slot");
			} else {
				System.out.println("Availability Is Invalid");
			}
		} else if (patientType == 2) {
			if (availability == 1) {
				System.out.println("Emergency Appointment Confirmed");
			} else if (availability == 2) {
				System.out.println("Emergency Slot Not Available");
			} else {
				System.out.println("Availability Is Invalid");
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----- Online Hospital Appointment Booking System -----");
		String choose = " ";
		do {
			System.out.println("Enter your age :");
			int age = sc.nextInt();
			if (!checkAge(age)) {
				System.out.println("Please Enter Valid Age");
				return;
			}
			System.out.print("Enter Patient Type (1.Regular, 2.Emergency): ");
			int patientType = sc.nextInt();
			if (!patientType(patientType)) {
				return;
			}

			System.out.print("Enter Appointment Availability (1.Available, 2.Not Available): ");
			int availability = sc.nextInt();
			checkAge(age);
			if (age >= 1) {
				bookAppointment(patientType, availability);

			}
			System.out.println("Do You Want To Continue..? Click  Y for Yes or N for No");
			choose = sc.next();
		} while (choose.equalsIgnoreCase("y"));

	}

}
