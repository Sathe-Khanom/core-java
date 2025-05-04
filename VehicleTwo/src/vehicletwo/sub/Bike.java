
package vehicletwo.sub;


public class Bike extends vehicletwo.sup.Vehicle {
  
  int hasCarrier;

    public Bike() {
    }

    public Bike(int hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    public int getHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(int hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

   
  @Override
    public void bikeDetails(){
    
      System.out.println("Carriers : " + hasCarrier);
    }
    
}
