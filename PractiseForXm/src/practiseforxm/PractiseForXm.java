
package practiseforxm;

import java.util.Arrays;
import java.util.Scanner;


public class PractiseForXm {

    
    public static void main(String[] args) {
        
// max-min number check among 5
Scanner s = new Scanner(System.in);

        System.out.println("Enter limit");
        int size = s.nextInt();
        
        int [] numbers = new int [size];
        
        
        for(int i = 0; i < size; i++){
            System.out.println("Enter Value "+ (i + 1));
            int input = s.nextInt();
            numbers[i] = input;
        
        }
        
        System.out.println("Values are " + Arrays.toString(numbers)
        );
        
        int max = numbers[0];
        int min = numbers[0];
        
        for(int number : numbers){
        if(number > max){
        max = number;
        
        }
        if(number < min){
        min = number;
        }
        }
        
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
        
        
    }
    
}
