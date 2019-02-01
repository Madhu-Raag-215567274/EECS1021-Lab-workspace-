import java.util.Scanner;

public class WhileLoopApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int total =0; 
		int i =1;
		while(i<=2) {
			System.out.println("Enter positive integer "+ i +":");
			int x = input.nextInt();
			
			
			while(!(x>0)) {
				System.out.println("Error " +x+ " is not larger than zero!!");
				System.out.print("Try again :");
				 x = input.nextInt();
							  
			
			}
			
			
			
		    total+=x;
			i++;
		}
		
		double average = total/2.0;
		System.out.println("averger is " +average);

		
		
	input.close();

	}

}
