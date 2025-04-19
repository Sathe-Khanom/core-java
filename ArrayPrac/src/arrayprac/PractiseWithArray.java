package arrayprac;

import java.util.Arrays;
import java.util.Scanner;

public class PractiseWithArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter row size ");
        int row = s.nextInt();
        System.out.println(" enter col size ");
        int col = s.nextInt();
        int[][] myNumbers = new int[row][col];

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                System.out.print("[" + i + "][" + j + "] = ");
                myNumbers[i][j] = s.nextInt();
            }
        }
        System.out.println("my arrays " + Arrays.deepToString(myNumbers));

        for (int[] myNumber : myNumbers) {
            for (int cols = 0; cols < myNumber.length; cols++) {
                System.out.print(myNumber[cols] + " ");
            }
            System.out.print("\n");
            
           arrayMethod() 
        }


    public static int arrayMethod(int myNumbers [][] ) {
        
       int sum = 0;

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
               
                sum += myNumbers [row][col]
            }
        }
        System.out.println("my arrays " + Arrays.deepToString(myNumbers));

        for (int[] myNumber : myNumbers) {
            for (int cols = 0; cols < myNumber.length; cols++) {
                System.out.print(myNumber[cols] + " ");
            }
            System.out.print("\n");

        }
        System.out.println("");
    }
