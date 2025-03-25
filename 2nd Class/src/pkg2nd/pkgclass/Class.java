/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2nd.pkgclass;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Convert Minute
Scanner  input= new Scanner(System.in);
System.out.println("Enter Seconds");
int totalSeconds = input.nextInt();

int hours= totalSeconds / 3600;
int remainingSeconds= totalSeconds %3600;

int minutes= totalSeconds/60;
int seconds = totalSeconds% 60;

System.out.println(totalSeconds + "seconds =" + hours + "hours" + minutes + "minutes" + seconds + "seconds");





 
        
     


    }
    
}
