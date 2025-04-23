package largefactorial;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeFactorial {

    public static void main(String[] args) {

//         System.out.println("50! is \n" + factorial(70)); // method call
//factorial value of 50...code start
//        int number = 50;
//        BigInteger factorial = BigInteger.ONE;
//
//        for (int i = 2; i <= number; i++) {
//            factorial = factorial.multiply(BigInteger.valueOf(i));
//        }
//
//        System.out.println("Factorial of " + number + " is:");
//        System.out.println(factorial);
        //code close

        //sir er code
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Value");
        int userInput = s.nextInt();
        

        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= userInput; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));

        }
        System.out.println(factorial);
// code close
    }
// method for factorial value...
//    public static BigInteger factorial(long n) {
//        BigInteger result = BigInteger.ONE;
//        for (int i = 1; i <= n; i++) {
//            result = result.multiply(new BigInteger(i + ""));
//        }
//
//        return result;
//    }
}
