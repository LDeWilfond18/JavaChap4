package Exercises;

import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		int low;
		int medium;
		int high;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		num1 = input.nextInt();
		System.out.println("Enter another number");
		num2 = input.nextInt();
		System.out.println("Enter another number");
		num3 = input.nextInt();
		if(num1 <= num2 && num1 <= num3)
		{
			low = num1;
			if(num2 <= num3) {
				medium = num2;
				high = num3;
			}
			else if(num2 >= num3)
			{
				high = num2;
				medium = num3;
			}
		}
		System.out.println(low + " is the least " + medium + " is the second most greatest " + high + " is the greatest. ");
	}

}
