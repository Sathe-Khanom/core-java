
package practicalexam;

import java.util.Scanner;


public class fibonacci {
    public static void main(String[] args) {

Scanner s = new Scanner(System.in);

        System.out.println("Enter your limit");
        int size = s.nextInt();
        
        System.out.println("-----------");
        
       int num1 = 0;
       int num2 =1;
       int sum = 0;
       
        System.out.println(num1);
        System.out.println(num2);
        
         for(int i=3; i <= size; i++){
        sum = num1 + num2;
            System.out.println(sum);
            
        num1 = num2;
        num2 = sum;
         



}
}}
 