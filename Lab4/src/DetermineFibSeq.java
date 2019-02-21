import java.util.Scanner;

public class DetermineFibSeq {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	for (int c =0;c<=3;) {
		int ia[]= new int[20];		
		for(int i =0 ; i<20;i++) {		 	
		 
		 System.out.println("Enter a positive integer value, or -1 to stop:");		
			ia[i] = input.nextInt();
			input.nextLine();		
			
			if (ia[i]==-1) {
				System.out.print("The sequence you entered ");
				System.out.print("<");				
			for(int l =0; l<i;l++) {
				System.out.print(ia[l]);
				if (l<i-1) {
					System.out.print(",");
				}				
			}		
			    System.out.println(">");
			if (((!(ia[0]==1&&ia[1]==1))||(ia[i-1]!=ia[i-2]+ia[i-3]))) {
				System.out.println("is not the first "+(i)+ " numbers in the Fibonacci sequence.");
			}
			else {
				System.out.println("is the first "+(i)+" numbers in the Fibonacci sequence.");
			}
			System.out.println("Would you like to try another sequence? (Y/N)");
		      String yesNo= input.nextLine();
				if(yesNo.equals("Y")) {
				
				  i=-1;
				}
				else if (yesNo.equals("N")) {
				 System.out.println("Bye!");
				  c= 10;
				  i=50;
				}			
			}    	  			
		}		
	}		
	input.close();
	}
}
