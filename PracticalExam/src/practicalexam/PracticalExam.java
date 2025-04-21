package practicalexam;

import java.util.Arrays;
import java.util.Scanner;

public class PracticalExam {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("limit");
        int size = s.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter value" + (i + 1));
            int input = s.nextInt();
            numbers[i] = input;

        }
        System.out.println("numbers are" + Arrays.toString(numbers));

        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }

        }
        System.out.println("max is " + max);
        System.out.println("min is " + min);

    }
}
