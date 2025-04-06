
package calculate.area;

import java.util.Scanner;


public class CalculateArea {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a radius number");
        
        double radius = s.nextDouble();
        double pi = 3.14;
        double area ;
            

        
        if(radius <= 0){
            System.out.println("Enter the positive number");
             
//          double rad = s.nextDouble();   
//          double result = Math.PI * (rad * rad);
                radius = s.nextDouble();
//                area = pi * (radius * radius);
            area = pi * (radius * radius);
    }
        else {
              area = pi * (radius * radius);            
}
        System.out.println(area);  
}
}
