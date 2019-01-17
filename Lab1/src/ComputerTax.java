import java.util.Scanner;

public class ComputerTax {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		 System.out.println("Enter your name: ");
		 String name= input.nextLine();
		 input.close();
		 System.out.println(name+ ", Enter your filling status (1 - Single Filing; 2 - Married Filing): ");
		 int ste = input.nextInt();
		 input.nextLine();
		 
		 if (ste==1) {
			 System.out.println(name+ ", enter your taxable income:");
			 double income1 = input.nextDouble();
			 
		 }
input.close();
	}
		

}
