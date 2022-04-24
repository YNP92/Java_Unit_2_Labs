
//LAB NUMBER: 2.1 ROOM CALCULATOR 
// -------------------------------------------------------------
//Task: Calculate the perimeter and area of various classrooms at Grand Circus based on user input.
//-------------------------------------------------------------
//What will the application do?
//Prompt the user to enter values of length and width of the classroom. 
//Display the area and perimeter of that classroom.
//Ask if the user wants to continue (keep measuring rooms!).
// -------------------------------------------------------------
//Build Specifications
//Assume that the rooms are perfect rectangles.
//Assume that the user will enter valid numeric data for length and width.
//Accept decimal entries (12.5, for instance)
// -------------------------------------------------------------
//Hints:
//Don’t mess up the formulas for area or perimeter.
//The Snug is 24’ 6” x 20’ 0”. The Penthouse is 42’ 6” x 16’ 6”. 
//ZyBook Chapters 1 and 2.
//Extra Challenges:
//The application should continue only if the user agrees to.
//Calculate the volume of the rooms.
//
//Console Preview: 
// -------------------------------------------------------------
//Welcome to Grand Circus’ Room Detail Generator!
//
//Enter Length: {user input here, for example: 24.5}
//Enter Width: {user input here, for example: 20}
//Area: {output here, for example: 490}
//Perimeter: {output here, for example: 89}
//
//Continue? (y/n): {user input here, for example: Y}
//
//Enter Length: {3}
//Enter Width: {4}
//Area: {12}
//Perimeter: {14}
// -------------------------------------------------------------
import java.util.*;

public class Room_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float length = 0;
		float width = 0;
		System.out.println("Room Calculator");
		boolean awdy = false;
		while (!awdy) {
			
			System.out.println("Enter Length: ");
			length = scan.nextFloat();
			System.out.println("Enter Width: ");
			width = scan.nextFloat();
			System.out.println("Area: " + calcArea(length, width));
			System.out.println("Width: " + calcPerimeter(length, width));
			System.out.println("Continue(y/n)");
			String proceed = scan.next();
			if (proceed.equalsIgnoreCase("n")) {
				awdy = true;
				scan.close();
			} else {
				continue;
			}
		}
	}

	private static float calcArea(float length, float width) {
		float area = length * width;
		return area;
	}

	private static float calcPerimeter(float length, float width) {
		float perimeter = 2 * (length + width);
		return perimeter;
	}
	
}
