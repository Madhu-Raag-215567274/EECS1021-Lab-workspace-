import java.util.Scanner;

public class Combinations {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.println("Enter the 1st string:");
		String A = input.next();
		input.nextLine();
				
		System.out.println("Enter the 2st string:");
		String A2 = input.next();
		input.nextLine();
		
		System.out.println("Enter the 3rd string:");
		String A3 = input.next();
		input.nextLine();
		
		System.out.println("Enter the 4th string:");
		String A4 = input.next();
		input.nextLine();
		
		System.out.println("Enter the 1st integer :");
		int b = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the 2nd integer :");
		int b2 = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the 3rd integer :");
		int b3 = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the 4th integer :");
		int b4 = input.nextInt();
		input.nextLine();
		
		System.out.println("Here are all 16 possible combinations:");		
	    System.out.println("("+b2 + ","+ A +")");
	    System.out.println("("+b4 + ","+ A3+")");
	   
	    System.out.println('('+A + ','+ b3+')');
	    System.out.println('('+A + ','+ b4+')');
	    
	    System.out.println('('+A2 + ','+ b+')');
	    System.out.println('('+A2 + ','+ b2+')');
	    System.out.println('('+A2 + ','+ b3+')');
	    System.out.println('('+A2 + ','+ b4+')');
	    
	    System.out.println('('+A3 + ','+ b+')');
	    System.out.println('('+A3 + ','+ b2+')');
	    System.out.println('('+A3 + ','+ b3+')');
	    System.out.println('('+A3 + ','+ b4+')');
	    
	    
	    System.out.println('('+A4 + ','+ b+')');
	    System.out.println('('+A4 + ','+ b2+')');
	    System.out.println('('+A4 + ','+ b3+')');
	    System.out.println('('+A4 + ','+ b4+')');
	   
	     input.close();
	    
		
		
		
		
		

	}

}
