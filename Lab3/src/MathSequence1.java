import java.util.Scanner;

public class MathSequence1 {

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
			 int d =input.nextInt();
			 input.nextLine(); 
			 System.out.println("Enter the number of terms in the arithmetic sequence: ");
			 int n =input.nextInt();
			 input.nextLine(); 
			 
			 int[] ia = new int[n];			 
			 for(int j=0;j<n;j++ ) {
				 ia[j]= a1+j*d;
			 }
			 ////////////////////////// for console to print properly (array list)
			 System.out.print("<");
			 
		     for(int k= 0 ; k<n; k++) {		
		    if (k<=n-2) {
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
			
		 if (opt==2) {
			 System.out.println("Enter the first term in the geometric sequence: ");
			 int a1 = input.nextInt();
			 input.nextLine();
			 System.out.println("Enter the common ratio in the geometric sequence: ");
			 int d =input.nextInt();
			 input.nextLine(); 
			 System.out.println("Enter the number of terms in the geometric sequence: ");
			 int n =input.nextInt();
			 input.nextLine(); 
			 
			 int[] ia = new int[n];			 
			 for(int j=0;j<n;j++ ) {
				 ia[j]= (int) (a1*(Math.pow(d, j)));
			 }
			 ////////////////////////// for console to print properly (array list)
			 System.out.print("<");
			 
		     for(int k= 0 ; k<n; k++) {		
		    if (k<=n-2) {
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
				 i=2;
			 }	
			 if (yesNo.equals("N")) {
				 i=10;
				 ///big number to escape the loop
			 }
				
		  }	//end of if-2
			
		 if(opt==3) {
			 int [] ia = new int [10];
			 for(int c=0;c<=9;c++) {
				
			 System.out.println("Enter a new number: ");
			 ia[c] = input.nextInt();
			 input.nextLine();
			 if(c<=8) {
			 System.out.println("You have entered "+(c+1)+ " numbers.");
			 System.out.println("You may still enter another " +(10-(c+1))+ " numbers.");
		
			 
			 
			 System.out.println("Would you like to enter another new number? (Y/N)");
			 String yesNo= input.nextLine();
			
			 if(yesNo.equals("N")&&(c==0)){
			 for(;yesNo.equals("N")&&(c==0);) {
			 System.out.println("Error: we cannot infer the common difference from a sequence of size one.");
			 System.out.println("Would you like to process another sequence? (Y/N)");
			 yesNo= input.nextLine();
			 
			 if(yesNo.equals("N")&&(c==0)){
				 System.out.println("Bye!");
				 System.exit(0);
				 
			  }
			}
			 if(yesNo.equals("Y")&&(c==0)){
				 i=3;
				 c=100;
			 }
			
			 
			 
			}
			 
			
			 if(yesNo.equals("N")) {
				 System.out.print("<");
				int m=0;
				 for (int z =0 ; z<=c;z++) {
					 if (z<=c-1) {
			    System.out.print(ia[z]+",");
					 }
					 if (z==c) {
					 System.out.print(ia[z]);
					 }
					 m+=ia[z];
				 }
				 System.out.print(">");
				 
				 if (c==1 ||  ia[1]-ia[0]==ia[2]-ia[1]) {
				 System.out.print("is an arithmetic sequence with");
				 System.out.println(" first term "+ia[0]+","+"common difference "+ (ia[1]-ia[0])+" and the sum: "+m);
				 System.out.println("Would you like to process another sequence? (Y/N)");
				 yesNo= input.nextLine();
				 
				 if(yesNo.equals("Y")) {
					 i=3;
					 c=100;
				 }
				 else if (yesNo.equals("N")) {
					 i=10;
					 c=100;
				 }
			 }
				 
				 ////else statement 
				 else {
					 
					 System.out.println(" is not arthmetic series ");
				 
				 
				 System.out.println("Would you like to process another sequence? (Y/N)");
				 yesNo= input.nextLine();
				 
				 if(yesNo.equals("Y")) {
					 i=3;
					 c=100;
				 }
				 else if (yesNo.equals("N")) {
					 i=10;
					 c=100;
				 }
			  }
			 }
			 }
		
			
	
			 if  (c==9) {
				 System.out.println("You have entered the maximum number of numbers!");
				 System.out.println("We will start processing your sequence right away.");
				 System.out.print("<");
					int m=0;
					 for (int z =0 ; z<=c;z++) {
						 if (z<=c-1) {
				    System.out.print(ia[z]+",");
						 }
						 if (z==c) {
						 System.out.print(ia[z]);
						 }
						 m+=ia[z];
					 }
					 System.out.print(">");
					 
					 if (c==1 ||  ia[1]-ia[0]==ia[2]-ia[1]) {
					 System.out.print("is an arithmetic sequence with ");
					 System.out.println("first term "+ia[0]+","+"common difference "+ (ia[1]-ia[0])+" and the sum: "+m);
					 System.out.println("Would you like to process another sequence? (Y/N)");
					String yesNo= input.nextLine();
					 
					 if(yesNo.equals("Y")) {
						 i=3;
						 c=100;
					 }
					 else if (yesNo.equals("N")) {
						 i=10;
						 c=100;
					 }
				 }
					 
					 ////else statement 
					 else {
						 
						 System.out.println(" is not arthmetic series ");
					 
					 
					 System.out.println("Would you like to process another sequence? (Y/N)");
					 String yesNo= input.nextLine();
					 
					 if(yesNo.equals("Y")) {
						 i=3;
						 c=100;
					 }
					 else if (yesNo.equals("N")) {
						 i=10;
						 c=100;
					 }
				  }
				 
				 

			 
				 
			 }
			 
			 
			 			 
		   }
			 
			 
		 }
		 
	 }
		
		System.out.println("Bye!");
		input.close();
	}

}
