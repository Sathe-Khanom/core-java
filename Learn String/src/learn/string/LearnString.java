package learn.string;

import java.util.Scanner;

public class LearnString {

    public static void main(String[] args) {
//        String message = "Welcome to Java";
//
//        System.out.println("Length = " + message.length());
//        System.out.println("Char At = " + message.charAt(4));
//        System.out.println("Concate = " + message.concat("by"));
//        System.out.println("Upper = " + message.toUpperCase());
//        System.out.println("Lower = " + message.toLowerCase());

        Scanner s = new Scanner(System.in);
//        System.out.println("enter 'java' ");
//        String message = s.next();                                             
//        System.out.println( message.concat("Programmer"));
//       
        System.out.println("Enter a year ");
        String year = s.next();

        System.out.println("Enter a month ");
        String month = s.next();

        switch (month) {
            case "01":
                System.out.println("January");
                break;
            case "02":
                System.out.println("February");
                break;
            case "03":
                System.out.println("March");
                break;
            case "04":
                System.out.println("April");
                break;
            case "05":
                System.out.println("May");
                break;
            case "06":
                System.out.println("June");
                break;
            case "07":
                System.out.println("July");
                break;
           default:
                System.out.println("not a valid manth");
                
                System.out.println("Enter date ");
                String date = s.next();

                System.out.println(month.concat(" ") + date + "," + year);

//        System.out.println(month.concat date + "," + year);
        }

    }
}