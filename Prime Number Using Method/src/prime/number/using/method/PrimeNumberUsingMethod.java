package prime.number.using.method;

import java.util.Scanner;

public class PrimeNumberUsingMethod {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter a number");
        int number = s.nextInt();

//        System.out.println(primeNumber(input)); 
        String output = oddEven(number);
        System.out.println(output);

    }

    public static String primeNumber(int input) {
        int count = 0;
        String result = "";

        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            result = (input + " it is Prime Number");
        } else {
            result = (input + " it is Not Prime Number");
        }

        return result;
    }

    public static String oddEven(int number) {
        String output = "";
        if (number % 2 == 0) {
            output = (number + " is the even number");
        } else {
            output = (number + " is the odd number");

        }

        return output;

    }

}
