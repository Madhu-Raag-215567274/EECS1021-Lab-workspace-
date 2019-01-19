import java.util.Scanner;

public class BankApp2 {

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);			
		System.out.println("Enter a balance (e.g., 200.45):");
		double balance = input.nextDouble();
		input.nextLine();			
		if(balance > 0 && balance <= 1000) {
			/* valid initial balance */
			System.out.println("Enter a transaction type: (\"d\" or \"w\"):");
			String type = input.nextLine();			
			// Scope of variable amount is limited to
			// the if-branch of (balance > 0 && balance <= 1000)
			double amount = 0.0;			
			if(type.equals("d")) {
				System.out.println("Enter an amount for " + type + ": ");
				amount = input.nextDouble();
				input.nextLine();
				/* valid transaction type */				
				if(amount <= 0) {
					System.out.println("Error: deposit amount is not positive.");
				}
				else if(balance + amount <= 1000) {
					System.out.println("Error: depositive amount is too large.");
				}
				else {
					balance += amount;
				}
			}
			else if(type.equals("w")) {
				System.out.println("Enter an amount for " + type + ": ");
				amount = input.nextDouble();
				input.nextLine();
				/* valid transaction type */
				if(amount <= 0) {
					System.out.println("Error: withdraw amount is not positive.");
				}
				else if(amount >= balance) {
					System.out.println("Error: withdraw amount is too large.");
				}
				else {
					balance -= amount;
				}
			}
			else {
				System.out.println("Error: transaction type " + type + " is neither d nor w.");
			}
			System.out.println("Resulting balance after performing transaction of " + type + " with $" + amount + ": " + balance);
		}
		else {
			System.out.println("Error: initial balance " + balance + " is not in (0,1000].");
		}
		input.close();
	}
	
}
