import java.util.Scanner;

public class IfStatementApp1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int abs = input.nextInt();
		if (abs <0) {
			System.out.println("The absolute value for " + abs + " is: " +(-1*abs));
		}
		else {
			System.out.println("The absolute value for " + abs + " is: "  + abs);
		}
		input.close();

	}

}
