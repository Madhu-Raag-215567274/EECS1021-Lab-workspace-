import java.util.Scanner;

public class ComputeAndInterpretBMI {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);		
		
		System.out.println("Enter your name: ");
		String name =input.next();
		
		System.out.println(name +", Enter your height in inches: ");
		int height =input.nextInt();
		
		System.out.println( name + ", Enter your weight in pounds ");	
		int  weight = input.nextInt();
		double hi = (height*height);
		double we = weight;
		double IBM = (we/hi)*703 ; 
		/// 703 is kg to pounds factor!
		if(IBM <18.5) {
			System.out.println(name +  ",you BMI is  " + IBM);
			System.out.println("You are underwight!");
		}
		else if (18.5<=IBM  && IBM<25.0) {
			System.out.println(name +  ",you BMI is " + IBM );
			System.out.println("You are normal!");

		}
		else if(25.5<=IBM && IBM< 30.0) {
			System.out.println(name +  ",you BMI is " + IBM );
			System.out.println("You are overwight!");

		}
		else {
			System.out.println(name +  ",you BMI is " + IBM );
			System.out.println("You are obese!");
		

		}
		
		
			
			input.close();
		
		
		
		

	}

}
