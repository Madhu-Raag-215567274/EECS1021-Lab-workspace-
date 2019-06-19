import java.util.Scanner;

public class SumOfCrossProduct {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter 1st integer in sequence 1: ");
		int sq1a = input.nextInt();
		input.nextLine();
	
		
		
		System.out.println("Enter 2nd integer in sequence 1: ");
		int sq1b = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter 3rd integer in sequence 1: ");
		int sq1c = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter 4th integer in sequence 1: ");
		int sq1d = input.nextInt();
		input.nextLine();
		
//sq 2
		
		System.out.println("Enter 1st integer in sequence 2: ");
		int sq2a = input.nextInt();
		input.nextLine();
		
		
		System.out.println("Enter 2nd integer in sequence 2: ");
		int sq2b = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter 3rd integer in sequence 2: ");
		int sq2c = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter 4th integer in sequence 2: ");
		int sq2d = input.nextInt();
		input.nextLine();
		
		int sum1 = sq1a *sq2a;
		int sum2 = sq1b *sq2b;
		int sum3 = sq1c *sq2c;
		int sum4 = sq1d *sq2d;
		
		
		System.out.print("sum(["+ sq1a+','+sq1b +','+sq1c+','+sq1d+']' +'*'
				+'['+ sq2a+','+sq2b+ ','+sq2c+','+sq2d+"])");
		System.out.println( " = " + (sum1 + sum2 + sum3+sum4));
		
		

		
		
		
		input.close();
		
	

	}

}
