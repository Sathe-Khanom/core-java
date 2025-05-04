
package vehicletwo.sub;


public class Car extends vehicletwo.sup.Vehicle{
    
    int numberOfDoors;

    public Car() {
    }

    public Car(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    
    
    @Override
    public void carDetails(){
    super.carDetails();
        System.out.println("Number of Doors : " + numberOfDoors);
        
    
    }
}
