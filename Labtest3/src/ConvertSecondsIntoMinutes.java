import java.util.Scanner;

public class ConvertSecondsIntoMinutes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Whats your name?");
		String name = input.nextLine();
		
		System.out.println("Enter an integer for seconds:");
		int time = input.nextInt();
		input.nextLine();
		int min = time /60; 
		int sec = time %60; 
		System.out.println(name+", your input "+time + " seconds can be divided into "+ min+ " minutes and "+ sec+" seconds.");
	    input.close();
	}

}
