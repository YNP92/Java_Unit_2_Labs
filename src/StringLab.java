
public class StringLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testCapital="giveMe";
		String testWaldo ="wheres Waldo";
		String a = "kite";
		String b = "Whistledown";
		String testReverese = "backwards";
		String testAfterMath = "She aced the mathematics test!";
		System.out.println(StringMethods.capitalize(testCapital).toString()+"\n");
		System.out.println(StringMethods.wheresWaldo(testWaldo)+"\n");
		System.out.println(StringMethods.firstThingsFirst(a, b)+"\n");
	    System.out.println("Reversed string: "+StringMethods.reverse(testReverese)+"\n"); 
	    System.out.println(StringMethods.soLong(a, b)+"\n");
	    System.out.println(StringMethods.afterMath(testAfterMath)+"\n");
	    System.out.println(StringMethods.letterize(a)+"\n");
	}

}
