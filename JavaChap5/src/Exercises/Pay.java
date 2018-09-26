package Exercises;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		double payRate;
		double hoursWorked;
		int insuranceOption;
		int skillLevel;
		
		System.out.println("What is your skill level? ");
		skillLevel = input.nextInt();
		System.out.println("How many hours did you work" );
		hoursWorked = input.nextInt();
		
		if(skillLevel == 1) {
			insuranceOption = 0;
			payRate = 17;
			displayTotalPay(hoursWorked, insuranceOption, payRate);
		}
	}
	public static void displayTotalPay(double hoursWorked, int insuranceOption, double payRate) {
		
}
	public static void displayInformation() {
		
	}
}












