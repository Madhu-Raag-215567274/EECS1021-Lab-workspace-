import java.util.Scanner;

public class PrintBetweenNumbers2 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);	
			String yes= "Y";
			String no= "N";
			int i =1;
			while(i<=1) {
			System.out.println("Enter a lower bound:");
			int x = input.nextInt();
			System.out.println("Enter a upper bound:");
			int y = input.nextInt();
			if (x<=y) {
			while(x<=y) {			
				
				System.out.println(x);
				x++;
				
			  }
			}
			else if(!(x<=y)) {
			
			while (!(x<=y)) {
				System.out.println("Error: lower boundis not less than or equal to the upper bound. ");
				System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
				String yesNo= input.next();				
				input.nextLine();
				
				if (yesNo.equals(yes)) {
					System.out.println("Enter a lower bound:");
					 int x2 = input.nextInt();
					System.out.println("Enter a upper bound:");
					 int y2 = input.nextInt();	
					 if (x2<=y2) {
					while(x2<=y2) {
						System.out.println(x2);
						x2++;
						System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
						 yesNo= input.next();	
					}
						
					}
					if(!(x2<=y2)) {
						while(!(x2<=y2)) {
						System.out.println("Error: lower boundis not less than or equal to the upper bound. ");
						System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
						 yesNo= input.next();				
						input.nextLine();
						
						
						if (yesNo.equals(yes)) {
							while((x2<=y2)) {
								
							}
						
							System.out.println("Enter a lower bound:");
							  x2 = input.nextInt();
							System.out.println("Enter a upper bound:");
							 y2 = input.nextInt();	
							 if (x2<=y2) {
							while(x2<=y2) {
								System.out.println(x2);
								x2++;
					
						}
					
					}
					
				}
			}
					 				
					
					
			}
				else if (yesNo.equals(no)) {
					System.out.println("Bye!");				

					
				}
				int temp = x;
				x=y;
				y=temp;
				
				
				
			}
		}
			
			
			
			
			
			
			i++;
	}
			
			
			
		
			input.close();
	}
}
}			

	

