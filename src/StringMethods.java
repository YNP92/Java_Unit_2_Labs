import java.nio.file.attribute.UserPrincipal;
import java.util.Scanner;

public class StringMethods {
	public static Scanner scan = new Scanner(System.in);
	private static String usrInpt = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(scan.getClass().getSimpleName());
		// obtain user input string/ phrase
		boolean awdy = false;
		while (!awdy) {
			System.out.println("Please enter a word or Phrase(min 2 char and no numbers or special characters.");
			usrInpt = scan.nextLine();
			usrInpt.trim();
			try {
				if (usrInpt.length() >= 2) {
					System.out.println(usrInpt + "Is a valid input");
					awdy = true;
				} else if (usrInpt.length() == 1) {
					System.out.println("Your input is only 1 cahracter, Invalid Input");
				} else {
					System.out.println("Your input is less than 2 characters, try again");
				}
			} catch (Exception ex) {
				System.out.println(
						"Your Input caused an unforseen error, please try again with a different input if issue persists");
			}

		}
	}

	// capitalize(String word) - takes a word and prints it out with the first
	// letter capitalized and all other letters lowercase.
	// E.g. for “blAZes”, it prints “Blazes”.
	public static String capitalize(String usrInpt) {
		String copyUsrInpt = usrInpt.toLowerCase();
		String output = copyUsrInpt.substring(0, 1).toUpperCase() + copyUsrInpt.substring(1);
		return output;
	}

	// wheresWaldo(String phrase) - takes a string and prints the location (index)
	// in the string where the word “Waldo” first appears.
	// E.g. for “Striped Waldo!”, it prints “8”.
	public static int wheresWaldo(String usrInpt) {
		String copyUsrInpt = usrInpt.toLowerCase();
		System.out.println(copyUsrInpt);
		int output = copyUsrInpt.indexOf("waldo");
		return output;
	}

	// firstThingsFirst(String a, String b) - takes two strings, prints the string
	// that comes first alphabetically, then prints the other.
	// E.g. for “cat” and “dog”, it prints: “cat dog”; for “tree” and “pine”, it
	// prints: “pine tree”.
	public static String firstThingsFirst(String a, String b) {

		String output;
		if (a.compareToIgnoreCase(b) < 0) {
			output = a + " " + b;
		} else if (a.compareToIgnoreCase(b) > 0) {
			output = b + " " + a;
		} else {
			output = "both strings start with same letter";
		}
		return output;
	}

	// reverse(String s) - takes a string and prints it backwards
	// E.g. for “happy”, it prints “yppah”.

	public static String reverse(String testReverese) {

		StringBuilder reverseString = new StringBuilder(testReverese);
		reverseString.reverse();
		String result = reverseString.toString();
		return result;
	}

	// soLong(String a, String b) - prints only the longer of the two strings. If
	// both strings are the same length, print both.
	// E.g. for “bean” and “pea”, it prints “bean”; for “tart” and “trap”, it prints
	// “tart trap”
	public static String soLong(String a, String b) {
		String output = null;
		if (a.length() > b.length())
			output = a + b;
		else if (b.length() > a.length()) {
			output = b + a;
		}
		else {
			output= a + b + "both words are the same length";
		}
		return output;
	}

	// afterMath(String phrase) - takes a phrase. If the phrase contains the word
	// math, it prints the rest of the phrase starting with math. If not, it prints
	// “dud”.
	// E.g. for “She aced the mathematics test!”, it prints “mathematics test!”; for
	// “My floor mat is so keen!”, it prints “dud”.
	public static String afterMath(String phrase) {
		phrase.toLowerCase();
		String finalString = null;
		if (phrase.toLowerCase().contains("math")) {
			finalString = phrase.substring(phrase.indexOf("math"));
		}else {
			finalString = "dud";
		}
		return finalString;
	}
	// letterize(String word) - takes a word. Prints it out one letter per line.
	// Hint: Use a loop.
	// E.g. for “Java”, it prints
	// J
	// a
	// v
	// a
	public static String letterize(String word) {
		String output = "";
		for(int i = 0; i<word.length(); i++) {
			output += word.charAt(i)+"\n";
		}
		return output;
	}

}
