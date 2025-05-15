
package methodofanimal;

import methodofanimal.sub.Cat;
import methodofanimal.sub.Dog;
import methodofanimal.sup.Animal;


public class MethodOfAnimal {

    
    public static void main(String[] args) {
        
   Animal dog = new Dog();
   
   
        System.out.println("Dogs makes sound");
        dog.makeSound();
        
        
        
        Animal cat = new Cat();
        System.out.println("Cats makes sound");
        cat.makeSound();
        
        
        
        
        
        
    }
    
}
