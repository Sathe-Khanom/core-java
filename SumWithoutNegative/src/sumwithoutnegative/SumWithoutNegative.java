
package sumwithoutnegative;

import java.util.Scanner;


public class SumWithoutNegative {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers (a negative number to stop):");

        while (true) {
            System.out.print("Enter number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                break;
            }

            sum += number;
        }

        System.out.println("Sum of positive numbers: " + sum);
        scanner.close();
    }
    
}
