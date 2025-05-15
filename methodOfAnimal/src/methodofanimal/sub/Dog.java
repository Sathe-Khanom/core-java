
package methodofanimal.sub;

import methodofanimal.sup.Animal;


public class Dog extends Animal{
    
   @Override
   public void makeSound(){
   
       System.out.println("Woof! Woof!");
   } 
}
