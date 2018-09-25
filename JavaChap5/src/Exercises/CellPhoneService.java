package Exercises;

import java.util.Scanner;

public class CellPhoneService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minutes;
		int textMessages;
		int dataUsage;
		String result = null;
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many minutes do you need? ");
		minutes = input.nextInt();
		System.out.println("How many texts do you send? ");
		textMessages = input.nextInt();
		System.out.println("How much data do you need? ");
		dataUsage = input.nextInt();
		
		if(minutes < 500 && textMessages == 0 && dataUsage == 0) {
			result = "You need plan a Which is $49 a month";
		}
		else if()
		
		showResult(result);
	}
		public static void showResult(String result) {
			System.out.println(result);
		}
	}


