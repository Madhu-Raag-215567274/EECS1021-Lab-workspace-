import java.util.Scanner;

public class ComputerTax {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		 System.out.println("Enter your name: ");
		 String name= input.nextLine();
		 System.out.println(name+ ", Enter your filling status (1 - Single Filing; 2 - Married Filing): ");
		 int ste = input.nextInt();
		 input.nextLine();
		 
		 if (ste==1) {
			 System.out.println(name+ ", enter your taxable income:");
			 double income1 = input.nextDouble();
			 double leve1= 8350*0.10;
			 double part2 = (33950-8351)*0.15;
			 double level2 = (income1-8351)*0.15+leve1;
			 double level3= (33950-8350)*0.15 + (income1-33950)*0.25+ leve1;
			 double part3 = (income1-33950)*0.25;
			 if(0<income1 && 8350>=income1) {
				 System.out.println(name + ", you should pay $" + income1*0.10);
				 System.out.println("Calculation is based on the scheme of Single Filing");
				 System.out.println("Part I:"+ "$"+income1*0.10 );
			 }
			 else if (8351<income1 && 33950>=income1) {
				 System.out.println(name + ", you should pay $" + (level2));
				 System.out.println("Calculation is based on the scheme of Single Filing");
				 System.out.println("Part I:"+ "$"+leve1 );
				 System.out.println("Part II:"+"$"+((income1-8351)*0.15 ) );
			 }
			 else if (income1>33950) {
				 System.out.println(name + ", you should pay $" + (level3));
				 System.out.println("Calculation is based on the scheme of Single Filing");
				 System.out.println("Part I:"+ "$"+leve1 );
				 System.out.println("Part II:"+ "$"+ part2 );
				 System.out.println("Part III:"+ "$"+ part3 );			 			 
				 
			 }
			 
		 }
		 else if (ste==2) {
			 System.out.println(name+ ", enter your taxable income:");
			 double income2 = input.nextDouble();
			 double leve1= 16700*0.10;
			 double part2 = (67900-16701)*0.15;
			 double level2 = (income2-16701)*0.15+leve1;
			 double level3= (67900-16701)*0.15 + (income2-67900)*0.25+ leve1;
			 double part3 = (income2-67900)*0.25;
			 if(0<income2 && 16700>=income2) {
				 System.out.println(name + ", you should pay $" + income2*0.10);
				 System.out.println("Calculation is based on the scheme of Single Filing");
				 System.out.println("Part I:"+ "$"+income2*0.10 );
			 }
			 else if (16701<income2 && 67900>=income2) {
				 System.out.println(name + ", you should pay $" + (level2));
				 System.out.println("Calculation is based on the scheme of Single Filing");
				 System.out.println("Part I:"+ "$"+leve1 );
				 System.out.println("Part II:"+"$"+((income2-16701)*0.15 ));
			 }
			 else if (income2>67900) {
				 System.out.println(name + ", you should pay $" + (level3));
				 System.out.println("Calculation is based on the scheme of Single Filing");
				 System.out.println("Part I:"+ "$"+leve1 );
				 System.out.println("Part II:"+ "$"+ part2 );
				 System.out.println("Part III:"+ "$"+ part3 );				 
		 }
		 }
		 else {
			 System.out.println("Illegal status:"+ ste);
		 }
input.close();
	}
		

}
