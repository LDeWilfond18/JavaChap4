package practice;

import java.util.Scanner;

public class DoorGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int doorChoice;
		int chestChoice;
		int bookChoice;
		String result = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the amazing door choice game!");
		System.out.println("Your host Steve Harvey");
		System.out.println("Pick a door any door. \n1- for door One\n2 - for door Two\n3 - for door Three");
		doorChoice = input.nextInt();
		
		if(doorChoice == 1) {
			System.out.println("Door 1 good choice choose amoung the following Chests.");
			System.out.println("1 - For Chest One\n2- for Chest Two");
			chestChoice = input.nextInt();
			if(chestChoice == 1) {
				result = "a pile of gold";
			}
			else if(chestChoice == 2) {
				result = "EMPTY you suck at this";
			}
			else {
				result = " just kidding, I said 1 or 2!, now die!";
			}
		}
		else if(doorChoice == 2) {
			result = "Donkey ";
		}
		else if(doorChoice == 3) {
			result = "Long fast food line";
		}
		else if(doorChoice == 999) {
			System.out.println("You enter a special room with 3 books on the table, there are no words on the cover."
					+ " Do you choose Book 1, Book 2, or Book 3");
			bookChoice = input.nextInt();
			if(bookChoice == 1) {
				result = "Death.";
			}
			else if(bookChoice == 2) {
				result = "Also Death.";
			}
			else if(bookChoice == 3) {
				result = "Sadly more death.";
			}
			else if(bookChoice == 5) {
				System.out.println("You feel another book on the table... The book is invisible, it says, OPEN AT YOUR OWN RISK. Well of course You open it and guess what.. you die");
			}
		}
		else {
			System.out.println("This is not a choice");
		}
		displayMessage(result);
	}
public static void displayMessage(String result) {
	System.out.print("You won a " + result);
}
}
