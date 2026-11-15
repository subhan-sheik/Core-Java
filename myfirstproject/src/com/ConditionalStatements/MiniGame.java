package com.ConditionalStatements;

//create a java class that complete below requirements ,
//>  using Random class from java.util Generate a Random number between range 1 to 10
//› user able to give the input from console for atleast three times and campare the generated number with user input
//› if both are equal in first chance display the message "YOU WON!"
//› if not continue the process upto three times, if user not able to guess the number in 3rd time display the message "BETTER LCK NEXT TIME" 

import java.util.Random;
import java.util.Scanner;

public class MiniGame {

	public static void main(String[] args) {
		Random r = new Random();
		int range = r.nextInt(0, 10) + 1;
		Scanner sc = new Scanner(System.in);
		boolean won = false;
		for (int i = 1; i <= 3; i++) {
			System.out.println("Attempt" + i);
			System.out.println("Guess The Number Between 1 And 10");
			int num = sc.nextInt();
			if (num == range) {
				System.out.println("Congratulations You Won..!!");
				won = true;
				break;
			} else {
				System.out.println("Wrong Guess Try Again..!! You Have Only " + (3 - i) + " Chances..");
			}
		}
		if (!won) {
			System.out.println("Better Luck Next Time...!!");
		}
		sc.close();
	}

}
