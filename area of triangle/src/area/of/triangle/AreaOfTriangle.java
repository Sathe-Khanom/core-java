
package area.of.triangle;

import java.util.Scanner;


public class AreaOfTriangle {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the land number");
        float land = s.nextFloat();
        if(land <= 0){
                System.out.println("Enter the positive number");
                 land = s.nextFloat();
}
        
        System.out.println("Enter the height number");
        float height = s.nextFloat();
        if(height <= 0){
                System.out.println("Enter the positive number");
                 height = s.nextFloat();
}
        
        double area = 0.5 * (land * height);
        
        System.out.println("The area is " + area);
    }
    
}




