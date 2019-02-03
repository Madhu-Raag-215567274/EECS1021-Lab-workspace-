import java.util.Scanner;

public class PrintBetweenNumbers1 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);	
			int i =1; 
			while ( i<=1) {
			System.out.println("Enter a lower bound:");
			int x = input.nextInt();
			System.out.println("Enter a upper bound:");
			int y = input.nextInt();	
		
			if(!(x<=y)) {
				System.out.println("Error: lower bound " + x+ " is not less than or equal to the upper bound "+ y+".");
				
			}
			
			while(x<=y) {
				System.out.println(x);
				
				x++;
			}
			i++;
		}
			System.out.println("Bye!");	
				
			
			input.close();
	}

}
