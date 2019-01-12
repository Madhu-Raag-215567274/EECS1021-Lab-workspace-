import java.util.Scanner;

public class LogicalOperationApp1b {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter an interger:");
		int i = input.nextInt();
		boolean isLessThanOrEqualToZero= i<=0;
		System.out.println("The number you entered was positive: "+ !isLessThanOrEqualToZero);
		input.close();
				
		
	}

}
