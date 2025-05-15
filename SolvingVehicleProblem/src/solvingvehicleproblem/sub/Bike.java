
package solvingvehicleproblem.sub;

import solvingvehicleproblem.sup.Vehicle;


public class Bike extends Vehicle{
    
 public boolean hasCarrier;

    public Bike(boolean hasCarrier, String brand, int speed) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }
    
    public void displayBikeDetails(){
    
        System.out.println("Bike Brand : " + brand);
        System.out.println("Speed : " + speed);
        System.out.println("Carrier : " + (hasCarrier ? "Yes" : "No"));
    
    
    
    }

  
 
 
    
    
    
}
