import java.util.Scanner;

public class MathSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		for(int i= 1; i <=3;) {
		 System.out.println("What kind of processing task would you like to perform?");
		 System.out.println("1: Generate an arithmetic sequence.");
		 System.out.println("2: Generate a geometric sequence.");
		 System.out.println("3: Determine an arithmetic sequence.");
		 int opt = input.nextInt();
		 input.nextLine();
		 
		 if(!(opt==1||opt==2||opt==3)) {
			System.out.println("Error: task number must be 1, 2, or 3.");
		 }
		 if (opt==1) {
			 System.out.println("Enter the first term in the arithmetic sequence: ");
			 int a1 = input.nextInt();
			 input.nextLine();
			 System.out.println("Enter the common difference in the arithmetic sequence: ");
			 int r =input.nextInt();
			 input.nextLine(); 
			 System.out.println("Enter the number of terms in the arithmetic sequence: ");
			 int n =input.nextInt();
			 input.nextLine(); 
			 int[] ia = new int[n];
				
			}
			
			
			
			
			
			
		}
		input.close();
	}

}
