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
			 for(int j=0;j<n;j++ ) {
				 ia[j]= a1+j*r;
			 }
			 ////////////////////////// for console to print properly (array list)
			 System.out.print("<");
			 
		     for(int k= 0 ; k<n; k++) {		
		    if (k<0 || k<=n-2) {
		     System.out.print(ia[k]+",");
		    }
		    if (k==n-1) {
		    	 System.out.print(ia[k]);
		    }
		    
			 
		}
			 System.out.println(">");
			 //////////////////////////
			 
			 int sum=0;
			 for(int s = 0; s<ia.length;s++ ) {
				
				 sum += ia[s];
				 
			 }
			 System.out.println("Sum of the arithmetic sequence: "+ sum); 
			 
			 System.out.println("Would you like to process another sequence?(Y/N)");
			 String yesNo= input.nextLine();
			 
			 if (yesNo.equals("Y")) {
				 i=1;
			 }	
			 if (yesNo.equals("N")) {
				 i=10;
				 ///big number to escape the loop
			 }
				
			}	
			
			//* Task 1 done!			 
			 
		 
		 //Task 2 begins!\\
			
			
			
		}
		
		System.out.println("Bye!");
		input.close();
	}

}
