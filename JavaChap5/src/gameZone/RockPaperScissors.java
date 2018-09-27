package gameZone;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userResponse;
		int cInt;
		String result = null;
		
		Scanner input = new Scanner(System.in);
		cInt = (int )(Math.random() * 3 + 1);
		
		System.out.println("Rock - 1, Paper - 2 or Scissors - 3?");
		userResponse = input.nextInt();
		
		if (cInt == 1) {
			if(userResponse == 1)
				result = "Tie";
			else if(userResponse == 2)
				result = "I win";
			else 
				result = "You Lose";
		}
		if (cInt == 2) {
			if(userResponse == 2)
				result = "Tie";
			else if(userResponse == 3)
				result = "I win";
			else 
				result = "You Lose";
		}
		if (cInt == 3) {
			if(userResponse == 3)
				result = "Tie";
			else if(userResponse == 1)
				result = "I win";
			else 
				result = "You Lose";
		}
		displayMessage(result);
	}
	public static void displayMessage(String result) {
		System.out.println(result);
	}
}













