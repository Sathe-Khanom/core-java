package practicalexam;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Array Size");
        int size = s.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {

            System.out.println("Enter Value" + (i + 1));
            int userInput = s.nextInt();
            array[i] = userInput;

        }
        System.out.println("-------");
        System.out.println("Before Sorting" + Arrays.toString(array));

        for (int round = 0; round < array.length - 1; round++) {
            for (int step = 0; step < array.length - round - 1; step++) {
                if (array[step] > array[step + 1]) {
                    int temp = array[step];
                    array[step] = array[step + 1];
                    array[step + 1] = temp;
                }
            }
        }
        System.out.println("After Sorting" + Arrays.toString(array));
    }

}
