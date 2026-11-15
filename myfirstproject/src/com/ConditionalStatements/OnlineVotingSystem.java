package com.ConditionalStatements;

import java.util.Scanner;

public class OnlineVotingSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age :");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("your eligible for voting");
			System.out.println("Enter your Gender :");
			char gender=sc.next().charAt(0);
			if(gender=='M' || gender=='F' || gender=='m' || gender=='f') {
				System.out.println("------Voter Candidates------");
				System.out.println("1.Subhan");
				System.out.println("2.Ravi");
				System.out.println("3.Pavan");
				System.out.println("4.Hari");
				System.out.println("Enter your VoterId :");
				int voterId=sc.nextInt();
				switch(voterId) {
				case 1-> System.out.println("Vote is Captured for Subhan");
				case 2-> System.out.println("Vote is Captured for Ravi");
				case 3-> System.out.println("Vote is Captured for Pavan");
				case 4-> System.out.println("Vote is Captured for Hari");
				default ->System.out.println("Thanks for Voting To NOTA");
				}
			}else {
			System.out.println("Your Enter Wrong Gender...!!");
			}
		}
		else {
			System.out.println("Your Not Eligible For Voting");
		}
		sc.close();
		
	}

}
