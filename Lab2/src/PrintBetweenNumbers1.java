import java.util.Scanner;

public class PrintBetweenNumbers1 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);	
			
			for (int i =1 ; i<=1;i++) {
			System.out.println("Enter a lower bound:");
			int x = input.nextInt();
			System.out.println("Enter a upper bound:");
			int y = input.nextInt();	
		
			if(!(x<=y)) {
				System.out.println("Error: lower bound " + x+ " is not less than or equal to the upper bound "+ y+".");
				
			}
			
			for(;x<=y;x++) {
				System.out.println(x);
				
				
			}
		}
			System.out.println("Bye!");	
				
			
			input.close();
	}

}
