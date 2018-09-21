package Exercises;

import java.util.Scanner;

public class CondoSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int viewChoice;
		int parkViewCost = 150000;
		int golfCourseViewCost = 170000;
		int lakeViewCost = 210000;
		int quit = 0;
		String result = null;
		
		Scanner input = new Scanner(System.in);
		do {
		System.out.println("What view would you like for your condo? \n1 - park view\n2 - golf course\n3 - lake view");
		viewChoice = input.nextInt();
		
		if(viewChoice == 1) {
			result = "Park view for $" + parkViewCost;
		}
		else if(viewChoice == 2) {
			result = "Golf Course View for $" + golfCourseViewCost;
		}
		else if (viewChoice == 3) {
			result = "Lake view for $" + lakeViewCost;
		}
		displayMessage(result);
		System.out.println("Are you sure you want " + viewChoice + "\n1 - Yes\n2 - No");
		input.nextInt();
		}while(1 != quit);
	}
	
public static void displayMessage(String result) {
	System.out.println(result);
}
}
