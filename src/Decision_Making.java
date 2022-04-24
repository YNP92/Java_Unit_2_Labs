import java.util.Scanner;
import java.lang.annotation.AnnotationTypeMismatchException;

//LAB NUMBER: 2.2 DECISION MAKING 
//Task: Use conditional statements to automate the decision-making process.
//------------------------------------------------------------------------------------------------------------------
//What will the application do?
//The application prompts the user to enter an integer between 1 and 100.
//Display the associated result based on the integer range entered.  
//------------------------------------------------------------------------------------------------------------------
//Build Specifications
//Use if/else statements to take different actions depending on user input.  
//Given an integer entered by a user, perform the following conditional actions:
//If the integer entered is odd, print the number entered and “Odd.” (i.e. “3 and Odd”) done
//If the integer entered is even and in the inclusive range of 2 to 25, print “Even and less than 25.” done
//If the integer entered is even and in the inclusive range of 26 to 60, print “Even.” done
//If the integer entered is even and greater than 60, print the number entered and “Even.” (i.e. “62 and Even”)
//If the integer entered is odd and greater than 60, print the number entered and “Odd and over 60.”
//------------------------------------------------------------------------------------------------------------------
//Extra Challenges:
//Ask for user information (ex. name) at the beginning of the application, and use it to refer to the user throughout the application.
//Add validation to guarantee that a user enters a positive integer between 1 and 100.
//------------------------------------------------------------------------------------------------------------------
//Console Preview: 
//Enter a number between 1 and 100: {user input here, for example: 3}
//Output: {output here, 3 and Odd }
//Continue? (y/n): {user input here, for example: Y}
//Enter a number between 1 and 100: {user input here, for example: 24}
//Output: {output here, Even and less than 25 }
//Continue? (y/n): {user input here, for example: Y}
//Enter a number between 1 and 100: {user input here, for example: 75}
//Output: {output here, Odd and over 60}
//Continue? (y/n): {user input here, for example: N}
//Bye! 

public class Decision_Making {
//	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int validInput = 0;
		String userName = "";
		boolean awdy = false;
		while (!awdy) {
			boolean awdy2 = false;
			while (!awdy2) {
				try {
					System.out.println("Enter your name please: ");
					userName = scan.next();
					validInput = validUserinput();
					awdy2 = true;
				} catch (AnnotationTypeMismatchException ex) {
					System.out.println("You need to enter an integer. Try again");
				} catch (Exception ex) {
					System.out.println("Your number is not between 1 adn 100. Try again");
				}
			}
			String evenOrOdd = isOddeven(validInput);
			if (evenOrOdd.equalsIgnoreCase("even") && validInput >= 2 && validInput <= 25) {
				System.out.println(userName + ", " + validInput + " is Even and less or equal than 25.");
			} else if (evenOrOdd.equalsIgnoreCase("odd")) {
				System.out.println(userName + ", " + validInput + " is an Odd number");
			} else if (evenOrOdd.equalsIgnoreCase("even") && validInput >= 26 && validInput <= 60) {
				System.out.println(userName + ", is Even");
			} else if (evenOrOdd.equalsIgnoreCase("even") && validInput >= 60) {
				System.out.println(userName + ", " + validInput + " is Even and over 60");
			} else if (evenOrOdd.equalsIgnoreCase("odd") && validInput >= 60) {
				System.out.println(userName + ", " + validInput + " is Odd and over 60");
			}
			System.out.println("Would you like to continue(y/n)");
			String proceed = scan.next();
			if (proceed.equalsIgnoreCase("n")) {
				awdy = true;
				scan.close();
			} else {
				continue;
			}

		}

	}

	private static String isOddeven(int validInput) {
		String evenOrodd = "";
		if (validInput % 2 == 0) {
			evenOrodd = "Even";
		} else {
			evenOrodd = "Odd";
		}
		return evenOrodd;
	}

	private static int validUserinput() {
		Scanner scan = new Scanner(System.in);
		int userInput = 0;
		boolean awdy = false;
		while (!awdy) {
			System.out.println("Enter a number between 1 and 100, inclusive: ");
			userInput = scan.nextInt();
			if (userInput >= 1 && userInput <= 100 && ((userInput * 2) >= 1)) {
				System.out.println(userInput + ", a valid entry");
				awdy = true;
			} else {
				System.out.println(userInput + " is not a valid entry try again");
			}
		}
		scan.close();
		return userInput;
	}

}
