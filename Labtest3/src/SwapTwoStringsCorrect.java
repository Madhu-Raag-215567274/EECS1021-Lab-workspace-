
public class SwapTwoStringsCorrect {

	public static void main(String[] args) {
		String person1 = "Alan";
		String person2 = "Tom";
		
		System.out.println("Before the Swap:");
		System.out.print("person1 is " + person1 + " and ");
		System.out.println("person2 is " + person2 + ".");
		
		//Swap
		//Correct Implementation
		String temp = person1; // temp stores "Alan"
		person1 = person2; // person1 stores "Tom"
		person2 = temp; //person2 stores temp ("Alan")
		
		System.out.println("After the Swap:");
		System.out.print("person1 is " + person1 + " and ");
		System.out.println("person2 is " + person2 + ".");
		
		// Exercise:
		// Declare two integers x and y, and swap them
		
		int x = 5;
		int y = 6;
		
		System.out.println("Before the Swap:");
		System.out.print("x is " + x + " and ");
		System.out.println("y is " + y + ".");
		
		int temp1 = x; // temp stores "5"
		x = y; // x stores "6"
		y = temp1; //y stores temp ("5")
		
		System.out.println("After the Swap:");
		System.out.print("x is " + x + " and ");
		System.out.println("y is " + y + ".");		
		
		

	}

}
