
package vehicle.sup;


public class VehicleSuper {
  int speed;
double regularPrice;
String color;

    public VehicleSuper() {
    }

    public VehicleSuper(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    
   public double getSalePrice(){
     
    
      return regularPrice;
     
    
    }
    
    
}
