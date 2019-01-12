import java.util.Scanner;

public class IfStatementApp2 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);	
		
		System.out.println("Enter an integer balance:");
		int initialBalance= input.nextInt();
		 input.nextLine();
		
		System.out.println("Enter an amount to withdraw");
		int amount = input.nextInt();
		
		if (initialBalance<0 || amount <0 || amount>= initialBalance) {
			System.out.println("Error: Launch the program again.");			
		}
		else {
			
			System.out.print("Inital balance " +initialBalance + " after withdrawing ");
			System.out.print( amount + " has the resulting balance of " + (initialBalance- amount)+".");
		}
	
		
		input.close();
		
		
		
		


	}

}
