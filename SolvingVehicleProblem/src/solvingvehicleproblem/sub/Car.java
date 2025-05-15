
package solvingvehicleproblem.sub;

import solvingvehicleproblem.sup.Vehicle;


public class Car extends Vehicle{
    
   public int numberOfDoors;

    public Car(int numberOfDoors, String brand, int speed) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }
   
    public void displayCarDetails(){
    
        System.out.println("Bike Brand : " + brand);
        System.out.println("Speed : " + speed);
        System.out.println("Numbers Of Doors : " + numberOfDoors);
    
}
}
