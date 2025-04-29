
package vehicle;

import vehicle.sub.Truck;


public class TestVehicle {

    public static void main(String[] args) {
      
        Truck t = new Truck();
        
        t.setRegularPrice(700);
        t.setWeight(3000);
        System.out.println(t.getSalePrice());
    }
    
}
