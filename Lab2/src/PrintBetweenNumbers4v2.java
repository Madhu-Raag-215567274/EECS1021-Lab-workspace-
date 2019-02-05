
import java.util.Scanner;

public class PrintBetweenNumbers4v2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 1;
        int num1 = 1;
        while (num == 1) {
            System.out.println("Enter a lower bound:");
            int x = input.nextInt();
            System.out.println("Enter an upper bound:");
            int y = input.nextInt();
            System.out.println("Enter a middle number:");
            int z = input.nextInt();
            input.nextLine();

            if (x > y) {
                System.out.println("Error: lower bound " + x + " is not less than or equal to the upper bound " + y + ".");
            } else if (z > y || z < x) {
                System.out.println("Error: middle number " + z + " is not in-between the lower bound " + x
                        + " and upper bound " + y);
            } else {
                System.out.println("Odd numbers between " + x + " and " + z + ":");
                while (x <= z && x % 2 == 0) {
                    if (x != z) {
                        System.out.println(x + 1);
                        x++;
                        x++;
                    } else {
                        x++;
                        x++;
                    }

                }
                while (x <= z && x % 2 != 0) {
                    System.out.println(x);
                    x++;
                    x++;
                }

                System.out.println("Even numbers between " + z + " and " + y + ":");
                while (z <= y && z % 2 == 0) {
                    System.out.println(z);
                    z++;
                    z++;
                }
                while (z <= y && z % 2 != 0) {
                    if (z != y) {
                        System.out.println(z + 1);
                        z++;
                        z++;
                    } else {
                        z++;
                        z++;
                    }
                }

            }
            num1 = 1;
            while (num1 == 1) {

                System.out.println("Would you like to continue printing? (Enter Y for yes; N for no): ");
                String yesNo = input.nextLine();

                if (yesNo.equals("Y") || yesNo.equals("N")) {
                    if (yesNo.equals("N")) {
                        num++;
                        num1++;
                    } else if (yesNo.equals("Y")) {
                        num1++;
                    }
                } else {
                    System.out.println("Invalid indication on continuation: " + yesNo);
                }
            }

        }

        System.out.println("Bye!");
        input.close();

    }

}
