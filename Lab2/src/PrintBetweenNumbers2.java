import java.util.Scanner;

public class PrintBetweenNumbers2 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			String yes= "Y";
			String no= "N";
			int i =1; 
			while ( i<=1) {
			System.out.println("Enter a lower bound:");
			int x = input.nextInt();
			System.out.println("Enter a upper bound:");
			int y = input.nextInt();	
		
			if (!(x<=y)) {
				System.out.println("Error: lower bound is not less than or equal to the upper bound. ");
				System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
				String yesNo= input.next();
				input.nextLine();
				if (yesNo.equals(no)) {
					System.out.println("Bye!");
					System.exit(0);
				}
				
				while(yesNo.equals(yes)) {
					
				System.out.println("Enter a lower bound:");
				x = input.nextInt();
				System.out.println("Enter a upper bound:");
				y = input.nextInt();
				
				while (!(x<=y)) {
					System.out.println("Error: lower bound is not less than or equal to the upper bound. ");
					System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
					 yesNo= input.next();
					 input.nextLine();					
				
					
					while (yesNo.equals(yes)) {
						
					System.out.println("Enter a lower bound:");
					x = input.nextInt();
					System.out.println("Enter a upper bound:");
					y = input.nextInt();
					
					yesNo="";
					
					
					}
					if (yesNo.equals(no)) {
						System.out.println("Bye!");
						System.exit(0);
					}
					
				}
				
					
				
				while ((x<=y)) {
					System.out.println(x);
					
					x++;
					
				}
				System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
				   yesNo= input.next();
					input.nextLine();
				
				if(yesNo.equals(no)) {
					System.out.println("Bye!");
				}
				 if (yesNo.equals(yes)){
			   

					yesNo="Y";
					
				}
			
				
					
					
						
			 }
				
				
		}
			
			while(x<=y) {
				System.out.println(x);
				
				x++;
			}
		   i++;
		}
				
				
			
			input.close();
	}

}
