package practice;

import java.util.Scanner;

public class AgeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int usersAge;
		String result = null;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age to be insulted");
		usersAge = input.nextInt();
		
		if(usersAge <= 12)
		{
			result = "You are a child! Go away!";
		}
		else if(usersAge >= 13 && usersAge <= 18)
		{
			result = "Kool Kids";
		}
		else if(usersAge >= 19 && usersAge <= 25)
		{
			result = "Get a job!";
		}
		else if(usersAge >= 26 && usersAge <= 30)
		{
			result = "You are lonely! Find someone";
		}
		else if(usersAge >= 31 && usersAge <= 40)
		{
			result = "Get married already";
		}
		else if(usersAge >= 41 && usersAge <= 50)
		{
			result = "Retirement any time now";
		}
		else if(usersAge >= 51 && usersAge <= 60)
		{
			result = "Finally retirement... hopefully";
		}
		else if(usersAge >= 61 && usersAge <= 70)
		{
			result = "I feel old... ";
		}
		else if(usersAge >= 71)
		{
			result = "Death any time now..";
		}
		showResults(result);
	}
public static void showResults(String result) {
	
	System.out.println(result);
}
}














