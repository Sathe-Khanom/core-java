
package practicalexam;

import java.util.Scanner;


public class PrimeNumber {
    
     public static void main(String[] args) {
     
         Scanner s = new Scanner(System.in);
         
      System.out.println("Enter the number");
        int input = s.nextInt();

        int count = 0;

        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                count++;
            }

        }

        if (count == 2) {
            System.out.println(input + " it is a PRIME NUMBER");
        } else {
            System.out.println(input + " it is NOT a PRIME NUMBER");

        }
     
     }
    
}
