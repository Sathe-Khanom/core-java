package recursion;

import java.util.Scanner;

public class GreatestCommonDivisor {

    static int gcd(int a, int b) {
        if (b == 0) {
            return a; // base case
        } else {
            return gcd(b, a % b); // recursive call
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1 = s.nextInt();

        System.out.println("Enter your second number");
        int num2 = s.nextInt();

        int result = gcd(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
    }

}
