import java.util.Scanner;

public class PrintBetweenNumbers4 {

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
			System.out.println("Enter a middle number:");
			int z = input.nextInt();
		
			
			while (!((x<=z && z<=y)||(y<=z && z<=x))) {
				System.out.println("Error: middle number " + z+  " is not in-between the lower bound " +x+ " and upper bound " +y);
				System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
				  String yesNo= input.next();
				 input.nextLine();

				if (!(yesNo.equals(no)||yesNo.equals(yes))) {
				while (!(yesNo.equals(no)||yesNo.equals(yes))) {
					System.out.println("Invalid indication on continuation: "+ yesNo);
					System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
				    yesNo= input.next();
					input.nextLine();					
					

				}
			}
				if (yesNo.equals(no)) {
					System.out.println("Bye!");
					System.exit(0);
				}
				
				while(yesNo.equals(yes)) {
					
					System.out.println("Enter a lower bound:");
					x = input.nextInt();
					System.out.println("Enter a upper bound:");
					y = input.nextInt();
					System.out.println("Enter a middle number:");
					 z = input.nextInt();
					 yesNo = "";
				}
				
				
				
				
			}
			
		
			if (!(x<=y)) {
				System.out.println("Error: lower bound " +x+ " is not less than or equal to the upper bound "+y+".");
				System.out.println("Would you like to continue printing? (Y/N)");
				String yesNo= input.next();
				input.nextLine();
		
				if (!(yesNo.equals(no)||yesNo.equals(yes))) {
				while (!(yesNo.equals(no)||yesNo.equals(yes))) {
					System.out.println("Error: "+ yesNo+ " is not valid ");
					System.out.println("Would you like to continue printing? (Y/N)");
				    yesNo= input.next();
					input.nextLine();					
					

				}
			}
				
				
				if (yesNo.equals(no)) {
					System.out.println("Bye!");
					System.exit(0);
				}
				
				
				while(yesNo.equals(yes)) {
					
				System.out.println("Enter a lower bound:");
				x = input.nextInt();
				System.out.println("Enter a upper bound:");
				y = input.nextInt();
				System.out.println("Enter a middle number:");
				 z = input.nextInt();
				 yesNo="";
				
				while (!(x<=y)) {
					System.out.println("Error: lower bound is not less than or equal to the upper bound. ");
					System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
					 yesNo= input.next();
					 input.nextLine();
					 if (!(yesNo.equals(no)||yesNo.equals(yes))) {
							while (!(yesNo.equals(no)||yesNo.equals(yes))) {
								System.out.println("Invalid indication on continuation: "+ yesNo);
								System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
							    yesNo= input.next();
								input.nextLine();					
								

							}
						}
				
					
					while (yesNo.equals(yes)) {
						
					System.out.println("Enter a lower bound:");
					x = input.nextInt();
					System.out.println("Enter a upper bound:");
					y = input.nextInt();
					System.out.println("Enter a middle number:");
					 z = input.nextInt();
					
					yesNo="";
					
					
					}
					if (yesNo.equals(no)) {
						System.out.println("Bye!");
						System.exit(0);
					}
					
				}
				while (!((x<=z && z<=y)||(y<=z && z<=x))) {
					System.out.println("Error: middle number " + z+  " is not in-between the lower bound " +x+ " and upper bound " +y);
					System.out.println("Would you like to continue printing? (Y/N)");
					 yesNo= input.next();
					 input.nextLine();
						if (!(yesNo.equals(no)||yesNo.equals(yes))) {
							while (!(yesNo.equals(no)||yesNo.equals(yes))) {
								System.out.println("Error : " +yesNo+" is not valid");
								System.out.println("Would you like to continue printing? (Y/N)");
							    yesNo= input.next();
								input.nextLine();					
								

							}
						}
							if (yesNo.equals(no)) {
								System.out.println("Bye!");
								System.exit(0);
							}
							
							while(yesNo.equals(yes)) {
								
								System.out.println("Enter a lower bound:");
								x = input.nextInt();
								System.out.println("Enter a upper bound:");
								y = input.nextInt();
								System.out.println("Enter a middle number:");
								 z = input.nextInt();
								 yesNo = "";
							}
							
							
							
							
						}
						
					 
				
					 
				}
				
					
				
				while ((x<=z && z<=y)) {
					int even =z%2;		
					if(x<=z) {
					System.out.println("Odd numbers between " +x+ " and "+z+ " :");
					while(x<=z ) {
						
						if (!((x%2)==0)) {
							System.out.println(x);
						}
										
					
					
					
					x++;
					}
				  }
					if (z<=y) {
						System.out.println("Even numbers between " +z+ " and "+y+ " :");
					
					while (z<=y) {
					   even = z%2;
						if  (even==0) {
						
						System.out.println(z);
						
						}
						
						z++;
					}
					}
				}
				
				System.out.println("Would you like to continue printing? (Y/N)");
				   yesNo= input.next();
					input.nextLine();
					if (!(yesNo.equals(no)||yesNo.equals(yes))) {
						while (!(yesNo.equals(no)||yesNo.equals(yes))) {
							System.out.println("Error: No is not valid ");
							System.out.println("Would you like to continue printing? (Y/N)");
						    yesNo= input.next();
							input.nextLine();					
							

						}
					}
				
				if(yesNo.equals(no)) {
					System.out.println("Bye!");
					System.exit(0);
				}
				 if (yesNo.equals(yes)){
			   

					 System.out.println("Enter a lower bound:");
						x = input.nextInt();
						System.out.println("Enter a upper bound:");
						y = input.nextInt();
						System.out.println("Enter a middle number:");
						 z = input.nextInt();
						 yesNo = "";
					
				}
			
				
					
					
						
			 }		while (!(x<=y)) {
					System.out.println("Error: lower bound is not less than or equal to the upper bound. ");
					System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
					 String yesNo= input.next();
					 input.nextLine();
					 if (!(yesNo.equals(no)||yesNo.equals(yes))) {
							while (!(yesNo.equals(no)||yesNo.equals(yes))) {
								System.out.println("Invalid indication on continuation: "+ yesNo);
								System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
							    yesNo= input.next();
								input.nextLine();					
								

							}
						}
				
					
					while (yesNo.equals(yes)) {
						
					System.out.println("Enter a lower bound:");
					x = input.nextInt();
					System.out.println("Enter a upper bound:");
					y = input.nextInt();
					System.out.println("Enter a middle number:");
					 z = input.nextInt();
					
					yesNo="";
					
					
					}
					if (yesNo.equals(no)) {
						System.out.println("Bye!");
						System.exit(0);
					}
					
				}
			while (!((x<=z && z<=y)||(y<=z && z<=x))) {
				System.out.println("Error: middle number " + z+  " is not in-between the lower bound " +x+ " and upper bound " +y);
				System.out.println("Would you like to continue printing? (Y/N)");
				String yesNo= input.next();
				 input.nextLine();
					if (!(yesNo.equals(no)||yesNo.equals(yes))) {
						while (!(yesNo.equals(no)||yesNo.equals(yes))) {
							System.out.println("Error : " +yesNo+" is not valid");
							System.out.println("Would you like to continue printing? (Y/N)");
						    yesNo= input.next();
							input.nextLine();					
							

						}
					}
						if (yesNo.equals(no)) {
							System.out.println("Bye!");
							System.exit(0);
						}
						
						while(yesNo.equals(yes)) {
							
							System.out.println("Enter a lower bound:");
							x = input.nextInt();
							System.out.println("Enter a upper bound:");
							y = input.nextInt();
							System.out.println("Enter a middle number:");
							 z = input.nextInt();
							 yesNo = "";
						}
						
						
						
						
					}
					
				 
			
			////all-correct
			
			if ((x<=z && z<=y)) {
			while ((x<=z && z<=y)) {
				
				if(x<=z) {
				System.out.println("Odd numbers between " +x+ " and "+z+ " :");
				while(x<=z ) {
					
					if (!((x%2)==0)) {
						System.out.println(x);
					}
									
				
								
				x++;
				}
			  }
				if (z<=y) {
					System.out.println("Even numbers between " +z+ " and "+y+ " :");
				
				while (z<=y) {
				   int even = z%2;
					if  (even==0) {
					
					System.out.println(z);
					
					}
					
					z++;
				}
				}
			}
								
	
			System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
			String yesNo= input.next();
			input.nextLine();
			if (!(yesNo.equals(no)||yesNo.equals(yes))) {
				while (!(yesNo.equals(no)||yesNo.equals(yes))) {
					System.out.println("Invalid indication on continuation: "+ yesNo);
					System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
				    yesNo= input.next();
					input.nextLine();					
					

				}
			}
			
			if (yesNo.equals(no)) {
				System.out.println("Bye!");
				System.exit(0);
			}
			
			while (!(yesNo.equals(yes)&& yesNo.equals(yes))) {
				System.out.println("Invalid indication on continuation: "+ yesNo);
				System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
			    yesNo= input.next();
				input.nextLine();
				
				

			}
			
			
			while(yesNo.equals(yes)) {
				
			System.out.println("Enter a lower bound:");
			x = input.nextInt();
			System.out.println("Enter a upper bound:");
			y = input.nextInt();
			System.out.println("Enter a middle number:");
			 z = input.nextInt();
			yesNo="";
			
			while (!(x<=y)) {
				System.out.println("Error: lower bound is not less than or equal to the upper bound. ");
				System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
				 yesNo= input.next();
				 input.nextLine();					
				 if (!(yesNo.equals(no)||yesNo.equals(yes))) {
						while (!(yesNo.equals(no)||yesNo.equals(yes))) {
							System.out.println("Invalid indication on continuation: "+ yesNo);
							System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
						    yesNo= input.next();
							input.nextLine();					
							

						}
					}
				
				while (yesNo.equals(yes)) {
					
				System.out.println("Enter a lower bound:");
				x = input.nextInt();
				System.out.println("Enter a upper bound:");
				y = input.nextInt();
				System.out.println("Enter a middle bound:");
				z = input.nextInt();
				
				yesNo="";
				
				
				}
				if (yesNo.equals(no)) {
					System.out.println("Bye!");
					System.exit(0);
				}
				
			}
			while (!((x<=z && z<=y)||(y<=z && z<=x))) {
				System.out.println("Error: middle number " + z+  " is not in-between the lower bound " +x+ " and upper bound " +y);
				System.out.println("Would you like to continue printing? (Y/N)");
				 yesNo= input.next();
				 input.nextLine();
					if (!(yesNo.equals(no)||yesNo.equals(yes))) {
						while (!(yesNo.equals(no)||yesNo.equals(yes))) {
							System.out.println("Error : " +yesNo+" is not valid");
							System.out.println("Would you like to continue printing? (Y/N)");
						    yesNo= input.next();
							input.nextLine();					
							

						}
					}
						if (yesNo.equals(no)) {
							System.out.println("Bye!");
							System.exit(0);
						}
						
						while(yesNo.equals(yes)) {
							
							System.out.println("Enter a lower bound:");
							x = input.nextInt();
							System.out.println("Enter a upper bound:");
							y = input.nextInt();
							System.out.println("Enter a middle number:");
							 z = input.nextInt();
							 yesNo = "";
						}
						
						
						
						
					}
			if (!(x<=y)) {
				System.out.println("Error: lower bound " +x+ " is not less than or equal to the upper bound "+y+".");
				System.out.println("Would you like to continue printing? (Y/N)");
				 yesNo= input.next();
				input.nextLine();
		
				if (!(yesNo.equals(no)||yesNo.equals(yes))) {
				while (!(yesNo.equals(no)||yesNo.equals(yes))) {
					System.out.println("Error: "+ yesNo+ " is not valid ");
					System.out.println("Would you like to continue printing? (Y/N)");
				    yesNo= input.next();
					input.nextLine();					
					

				}
			}
			}
				 
			
			
			
				
			
			while ((x<=z && z<=y)) {
				int even =z%2;		
				if(x<=z) {
				System.out.println("Odd numbers between " +x+ " and "+z+ " :");
				while(x<=z ) {
					
					if (!((x%2)==0)) {
						System.out.println(x);
					}
									
				
				
				
				x++;
				}
			  }
				if (z<=y) {
					System.out.println("Even numbers between " +z+ " and "+y+ " :");
				
				while (z<=y) {
				   even = z%2;
					if  (even==0) {
					
					System.out.println(z);
					
					}
					
					z++;
				}
				}
			}
			
			
			System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
			   yesNo= input.next();
				input.nextLine();
				if (!(yesNo.equals(no)||yesNo.equals(yes))) {
					while (!(yesNo.equals(no)||yesNo.equals(yes))) {
						System.out.println("Invalid indication on continuation: "+ yesNo);
						System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
					    yesNo= input.next();
						input.nextLine();					
						

					}
				}
			
			if(yesNo.equals(no)) {
				System.out.println("Bye!");
				System.exit(0);
			}
			 if (yesNo.equals(yes)){
		   

				yesNo="Y";
				
			}
		
			
				
				
					
		 }
			
			
			
		
			
			
		
			
			
			
			
			
			
			
			
			
	 }
		
		
		   i++;
		
				
				
			
			input.close();
			
	}
	}
	
}
	



