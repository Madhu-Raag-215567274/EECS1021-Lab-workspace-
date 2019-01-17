import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	
	int n1 = 0;
	int n2 = 0;
	String R ="r" ;
	String P ="p";
	String S ="s";
	
	System.out.println("Enter the name of player 1:");
	String name1= input.nextLine();	
	
	
	
	System.out.println("Enter the name of player 2:");
	String name2= input.nextLine();

	
	
	System.out.println("========");
	
	System.out.println("Round 1:");
	
	System.out.println("========");
	
	System.out.println("What does "+ name1 + " play? (R,P or S): " );
	String m1 = input.nextLine();

	
	System.out.println("What does "+ name2 + " play? (R,P or S): " );
	String m2 = input.nextLine();
	
	
	
	
     System.out.println("========");
	
	System.out.println("Round 2");
	
	System.out.println("========");
	
	
	System.out.println("What does "+ name1 + " play? (R,P or S):" );
	String m3 = input.nextLine();
	
	
	
	System.out.println("What does "+ name2 + " play? (R,P or S):" );
	String m4 = input.nextLine();

	
	
	

	
	 if (m1.equals(m2)) {
		 n1=0;
		 n2=0;
		 
	 }
	else if  (m1.equals(R) && m2.equals(P)){
		n2++;
	}
	else if  (m1.equals(R) && m2.equals(S)) {
		n1++;
		
	} 
	 
	else if  (m1.equals(S) && m2.equals(R)) {
		n2++;
	}
	else if  (m1.equals(P) && m2.equals(R)) {
		n1++;
	}
	else if  (m1.equals(P) && m2.equals(S)) {
		n2++;
	}
	else if  (m1.equals(S) && m2.equals(P)) {
		n1++;
	}
	 
	else if (m3.equals(m4)) {
		n1=0;
		n2=0;
	}
	 
	 
 if (m3.equals(R) && m4.equals(P)) {
		n2=1;
	}
	else if (m3.equals(R) && m4.equals(S)) {
		n1=1;
	}
	else if  (m3.equals(S) && m4.equals(R)) {
		n2=1;
	}
	else if  (m3.equals(P) && m4.equals(R)) {
		n1=1;
	}
	else if  (m3.equals(P) && m4.equals(S)) {
		n2++;
	}
	else if  (m3.equals(S) && m4.equals(P)) {
		n1++;
	}
  
						 
	 if (n1>n2){
		 System.out.println("Game over " + name1 + " wins!");
	 }
	 else if(n1<n2) {
		 System.out.println("Game over " +name2 + " wins!");
		 
	 }
	 else if (n1==n2) {
		 
		 System.out.println("========");
		 System.out.println("Round 3");
		 System.out.println("========");
		 
		 System.out.println("What does "+ name1 + " play? (R,P or S):" );
			 String m5 = input.nextLine();
			
			
			System.out.println("What does "+ name2 + " play? (R,P or S" );
			 String m6 = input.nextLine();
			
			 if (m5.equals(m6)) {
				 System.out.println("Game over: a tie between " + name1 + " and " + name2);
				 
			 }
			else if  (m5.equals(R) && m6.equals(P)){
				System.out.println("Game Over: "+ name2 +" wins!");
			}
			else if  (m5.equals(R) && m6.equals(S)) {
				System.out.println("Game Over: "+ name1 +" wins!");	
			} 
			else if  (m5.equals(S) && m6.equals(R)){
				System.out.println("Game Over: "+ name2 +" wins!");
			}
			else if  (m5.equals(P) && m6.equals(R)) {
				System.out.println("Game Over: "+ name1 +" wins!");
				
			}

		    else if  (m5.equals(P) && m6.equals(S)) {
			System.out.println("Game Over: "+ name2 +" wins!");
		    }
		    else if  (m5.equals(S) && m6.equals(P)) {
		    	System.out.println("Game Over: "+ name1 +" wins!");
			}
			
		  
					
	
			
		 	 }
	 
	 
	 
	 input.close();
	
	}
}
