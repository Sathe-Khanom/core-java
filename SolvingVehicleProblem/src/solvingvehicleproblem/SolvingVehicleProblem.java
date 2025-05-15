
package solvingvehicleproblem;

import solvingvehicleproblem.sub.Bike;
import solvingvehicleproblem.sub.Car;


public class SolvingVehicleProblem {

    
    public static void main(String[] args) {
       
      Car car = new Car(8, "aaa", 180);
      car.displayCarDetails();
      
      Bike bike;
        bike = new Bike(true, "afrdsg", 120);
      bike.displayBikeDetails();
        
        
        
    }
    
}
