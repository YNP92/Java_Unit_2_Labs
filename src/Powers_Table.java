import java.util.Scanner;

//LAB NUMBER: 2.3 POWERS TABLE
//Task: Pair program and display a table of powers.
//What will the application do?
//Prompt the user to enter an integer.
//Display a table of squares and cubes from 1 to the value entered.
//Ask if the user wants to continue.
//      
//Build Specifications
//Assume that the user will enter valid data.
//Only continue if the user agrees to.
//
//
//Console Preview: 
//Learn your squares and cubes!
//Enter an integer: {user input here, for example: 5}
//
//Number          Squared          Cubed
//=======         =======          ======
//1                       1                       1
//2                       4                       8
//3                       9                       27
//4                       16                     64
//5                       25                     125
//Continue? (y/n): {user input here, for example: Y}
//Enter an integer: …
//Extended Challenge:
//Add a multiplication table to the end. For example…
//
//    1   2   3   4
//    =   =   =   =
//1 | 1   2   3   4
//2 | 2   4   6   8
//3 | 3   6   9  12
//4 | 4   8  12  16

public class Powers_Table {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean awdy = false;
		String again = "";
		int userInput = 0;
		System.out.println("Learn your squares and cubes! ");
		while (!awdy) {
			System.out.println("Enter an integer: ");
			userInput = scan.nextInt();
			System.out.println("Number     Squared     Cubed");
			System.out.println("======     =======     =====");
			for (int i = 0; i < userInput; i++) {
				System.out.println("     " + i + "           " + (i * i) + "         "
						+ (i * i * i));
			}
			System.out.println("\n\n\n");
			printMultiplicationTable(userInput);
			System.out.println("Would you like to conitnue?(y/n)");
			again = scan.next();
			if (again.equalsIgnoreCase("n")) {
				System.out.println("Thank you, come again.");
				awdy = true;
			} else {
				continue;
			}
		scan.close();
		}
	}

	public static void printMultiplicationTable(int userInput) {
		// first print the top header row
		System.out.format("      ");
		for (int i = 1; i <= userInput; i++) {
			System.out.format("%4d", i);
		}
		System.out.println();
		System.out.println("------------------------------------------");

		for (int i = 1; i <= userInput; i++) {
			// print left most column first
			System.out.format("%4d |", i);
			for (int j = 1; j <= userInput; j++) {
				System.out.format("%4d", i * j);
			}
			System.out.println();
		}

	}

}
