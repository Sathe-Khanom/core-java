
package vehicletwo.sup;


public class Vehicle {
    
    String brand;
    int speed;

    public Vehicle() {
    }

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public void carDetails(){
    
        System.out.println("Car's Details");
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed);
    
          
    }
    
    public void bikeDetails(){
    
     System.out.println("Car's Details");
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed);
    
    }
}
