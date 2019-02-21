import java.util.Scanner;

public class GenerateFibSeq {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0 ; i<=3; ) {
			
		System.out.println("Enter the size of Fibonacci Sequence: ");
		int size = input.nextInt();
		//input.nextLine();		
		if (!(size>0)) {
			System.out.println("Error: Fibonacci Sequence must have size >=1.");
			System.out.println("Would you like to continue? (Y/N)");
		}
		//// For the user to store the input
		String yesNo= input.nextLine();
		if(yesNo.equals("Y")) {
		  i = 0;
		}
		else if (yesNo.equals("N")) {
		 System.out.println("Bye!");
			
			i= 10;						
		}
		if (size>0) {			
	      	      
	      if (size==1) {
	    	  System.out.println("<1>");
	      }
	      else if (size==2) {
	    	  System.out.println("<1,1>");
	      }
	      else {
	    	  System.out.println("Fibonacci Sequence of size "+size+":");
	    	  System.out.print("<");
	      
	      for(int s =0; s<size;s++) {
	    	  int ia[]=new int[size];
		      ia[0]=1;
		      ia[1]=1;		      
		     
		      for (s=0; s<=1;s++) {
		    	  System.out.print(ia[s]+",");		    	  
		      }
		      if (s>=2) {
		  
		      for (s=2;s<size;s++) {
		    	  System.out.print(ia[s-1]+ia[s-2]);
		    	  
		    	  if (s<size-1) {
		    	System.out.print(",");
		    	  }
		    	  ia[s]=ia[s-1]+ia[s-2];
		      }
		    }          	  
	      }
	      System.out.println(">");
	     }
	      System.out.println("Would you like to continue? (Y/N)");
	      yesNo= input.nextLine();
			if(yesNo.equals("Y")) {
			  i = 0;
			}
			else if (yesNo.equals("N")) {
			 System.out.println("Bye!");
			  i= 10;						
			}	
		}
	}
		input.close();
	}
}
