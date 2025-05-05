
package question.pkg1.sub;

import question.pkg1.sup.Vehicle;


public class Bus extends Vehicle{
    
        int weight;
    

    public Bus() {

    }

    public Bus(int weight) {
        this.weight = weight;
    }

    public Bus(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    
    
    @Override
    public double getSalePrice() {
        if (weight > 2000) {
          
            
            return super.getRegularPrice() - (super.getRegularPrice() * 0.10);
            
        } else {
            return super.getRegularPrice();
        }

    }
    
}
