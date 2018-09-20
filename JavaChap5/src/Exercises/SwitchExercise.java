package Exercises;

import java.util.Scanner;

public class SwitchExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id;
		int again = 0;
		Scanner input = new Scanner(System.in);
		do {
		System.out.println("Please scan your barcode"); 
		id = input.nextInt();
		switch(id)
		{
		case 316338:
			System.out.println("Logan DeWilfond");
			break;
		case 129001:
			System.out.println("Isaac Dibbern");
			break;
		case 155706:
			System.out.println("Joseph Chalupa");
			break;
		case 274891:
			System.out.println("Jason Wells");
			break;
		case 137112:
			System.out.println("Adam Burton");
			break;
		case 137160:
			System.out.println("Zach Canada");
			break;
		case 153184:
			System.out.println("Jayden Graap");
			break;
		case 159343:
			System.out.println("Giovanni Jacobsen");
			break;
		case 247871:
			System.out.println("Tarius Sterling");
			break;
		case 153182:
			System.out.println("Orion Gardner");
			break;
		case 274904:
			System.out.println("Amia Combs");
			break;
		case 304345:
			System.out.println("Cheyenne Jones");
			break;
		case 274894:
			System.out.println("John Brosius");
			break;
		case 118314:
			System.out.println("Benjamen Brooks");
			break;
		case 146891:
			System.out.println("De'Antwan Hanes");
			break;
		case 146468:
			System.out.println("Noah Giles");
			break;
		case 274888:
			System.out.println("Travis Hodges");
			break;
		case 315135:
			System.out.println("Phero Luong");
			break;
		default:
				System.out.println("This id is not in the database");
		System.out.print("Would you like to do this again? \n1 - Yes\n2 - No");
		again = input.nextInt();
		}
	} while(again != 2);
	}

}

















