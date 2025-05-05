
package question.pkg1;

import question.pkg1.sub.Bus;


public class Question1 {

   
    public static void main(String[] args) {
        
        Bus t = new Bus();
        
        t.setRegularPrice(100000);
        t.setWeight(3000);
        System.out.println(t.getSalePrice());  
        
        
    }
    
}
