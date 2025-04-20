package practicalexam;

import java.util.Arrays;
import java.util.Scanner;

public class PracticalExam {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //3.max-min number among 5     
//        System.out.println("Enter your limit");
//        int size = s.nextInt();
//
//        int[] numbers = new int[size];
//
//        for (int i = 0; i < size; i++) {
//
//            System.out.println("Enter number" + (i + 1));
//            int Input = s.nextInt();
//            numbers[i] = Input;
//        }
//
//        System.out.println("Numbers are " + Arrays.toString(numbers));
//
//        int maxNumber = numbers[0];
//        int minNumber = numbers[0];
//
//        for (int number : numbers) {
//            if (number > maxNumber) {
//                maxNumber = number;
//            }
//
//            if (number < minNumber) {
//                minNumber = number;
//            }
//
//        }
//
//        System.out.println("Max Number is " + maxNumber);
//        System.out.println("Min Number is " + minNumber);
        System.out.println("Enter limit");
        int size = s.nextInt();

        int[] numbers = new int[size];
        int index;

        for (index = 0; index < size; index++) {
            System.out.println("Enter number" + (index + 1));
            int userInput = s.nextInt();
            numbers[index] = userInput;

        }
        System.out.println("Numbers are" + Arrays.toString(numbers));

        int maxNumber = numbers[0];
        int minNumber = numbers[0];

        for (int number  : numbers) {
            if (number > maxNumber) {

                maxNumber = number;
            }
            if (number < minNumber) {
                minNumber = number;
            }
            

        }
        System.out.println("Max number is " + maxNumber);
        System.out.println("Min number is " + minNumber);

    }
}
