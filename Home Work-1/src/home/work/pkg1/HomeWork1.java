package home.work.pkg1;

import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {

//     question no-1  (check even or odd number) 
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
//        question no-2 (check positive,negative or zero)
//        System.out.println("Enter a number to check positive,negative or zero(0)");
//        int num = s.nextInt();
//
//        if (num > 0) {
//            System.out.println(num + " is the positive number");
//
//        }
//        else if (num < 0) {
//            System.out.println(num + " is the negative number");
//        } 
//        else {
//            System.out.println(num + " is zero");
//        }
// question no-3 (check leap year)
//        System.out.println("Enter a year to check Leap Year");
//        int year = s.nextInt();
//
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.println(year + " is Leap Year");
//                } else {
//                    System.out.println(year + " not Leap Year");
//                }
//
//            } else {
//                System.out.println(year + " Leap Year");
//            }
//        } else {
//            System.out.println(year + " is not Leap Year");
//        }
//    }
//}
//question no-4 (find largest number)
//        System.out.println("Enter first number");
//        float num1 = s.nextFloat();
//
//        System.out.println("Enter second number");
//        float num2 = s.nextFloat();
//
//        if (num1 > num2) {
//            System.out.println(num1 + " is the largest number");
//        } else {
//            System.out.println(num2 + " is the largest number");
//        }
//    }
//}

//question no-5 (vowel/consonant check)

        System.out.println("Enter a letter to check vowel or consonant");
        char input = s.next().toUpperCase().charAt(0);

if (input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U' ){
    
    System.out.println(input + " is the vowel");
}
else if(input >= 'A' && input <= 'Z'){
    System.out.println(input + " is consonant");
}
else{
    System.out.println("Not a valid letter");
}  
    }
    }

//question no-6 (grading)



