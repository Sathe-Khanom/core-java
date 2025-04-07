
package home.work.pkg1;

import java.util.Scanner;


public class HomeWork1 {

    
    public static void main(String[] args) {
        
//     question no-1   

        Scanner s = new Scanner(System.in);
        
//        System.out.println("Enter a number to check even or odd");
//        int number = s.nextInt();
//        
//        if(number % 2 == 0){
//            System.out.println(number + " is the even number");
//        }
//        
//        else{
//            System.out.println(number + " is the odd number");
//        
//        }
        
        
//        question no-2

//System.out.println("Enter a number to check positive,negative or zero(0)");
//        int num = s.nextInt();
//        
// if(num > 0){
//            System.out.println(num + " is the positive number");
//            
//        }
// 
// else if(num < 0){
//                System.out.println(num + " is the negative number");
//            }
// else{
//     System.out.println(num + " is zero");
// }
 
 
// question no-3

System.out.println("Enter a year to check Leap Year");
        int year = s.nextInt();
        
 if(year % 4 == 0){
     if(year % 100 == 0){
      if(year % 400 == 0){
             System.out.println(year + " is Leap Year");}
      else{
        System.out.println(year + " is Leap Year");}
  
      }
 }
        }
 
 
 else{
     System.out.println(year + " is not Leap Year");
 }
 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
