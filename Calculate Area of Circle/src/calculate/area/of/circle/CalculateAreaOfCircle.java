/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculate.area.of.circle;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CalculateAreaOfCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the radius");
    int r= input.nextInt();
    float result = 3.1417f*(r*r);
//double result= Math.PI* Math.pow(r, 2);
    System.out.println(result);

        
    }
    
}
