
package max.min.among.pkg5.number;

import java.util.Arrays;
import java.util.Scanner;


public class MaxMinAmong5Number {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Limit");
        int size = s.nextInt();
        
        int [] numbers = new int[size];
        
//        int maxNumber = 0;
//        int minNumber = 999999999;
        
        
        for(int index = 0; index < size; index++){
        
            System.out.println("Enter Number" + (index + 1));
            int userInput = s.nextInt();
            numbers[index] = userInput;
            
        }
        
        System.out.println("My Numbers are" +Arrays.toString(numbers));
        
        int maxNumber = numbers[0];
        int minNumber = numbers[0];
        
        for (int number : numbers){
         
            if(number > maxNumber){
            maxNumber = number;
            }
            
            if(number < minNumber){
            minNumber = number;
            
            }
           }
        
        System.out.println("Max Number is " + maxNumber);
        System.out.println("Min Number is " + minNumber);
    }
    
}
//create method
public static String (int index, int ){

 for(int index = 0; index < size; index++){
        
            System.out.println("Enter Number" + (index + 1));
            int userInput = s.nextInt();
            numbers[index] = userInput;
            
        }
        
        System.out.println("My Numbers are" +Arrays.toString(numbers));
        
        int maxNumber = numbers[0];
        int minNumber = numbers[0];
        
        for (int number : numbers){
         
            if(number > maxNumber){
            maxNumber = number;
            }
            
            if(number < minNumber){
            minNumber = number;
            
            }
           }
        
        System.out.println("Max Number is " + maxNumber);
        System.out.println("Min Number is " + minNumber);




}
