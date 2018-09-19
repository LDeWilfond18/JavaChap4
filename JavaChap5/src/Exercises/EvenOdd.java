package Exercises;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int answer;
		String result;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number");
		number = input.nextInt();
		answer = number % 2;
		if(answer == 0) {
			result ="Your answer is even";
		}
		else {
			result = "Your answer is odd";
		}
		showResult(result);
	}
public static void showResult(String result) {
	System.out.print(result);
}
}
