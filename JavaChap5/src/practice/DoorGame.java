package practice;

import java.util.Scanner;

public class DoorGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int doorChoice;
		String result = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the amazing door choice game!");
		System.out.println("Your host Steve Harvey");
		System.out.println("Pick a door any door. \n1- for door One\n2 - for door Two\n3 - for door Three");
		doorChoice = input.nextInt();
		
		if(doorChoice == 1) {
			result = "Pile of gold";
		}
		else if(doorChoice == 2) {
			result = "Donkey ";
		}
		else if(doorChoice == 3) {
			result = "Long fast food line";
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
