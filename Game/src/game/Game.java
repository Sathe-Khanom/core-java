
package game;

import java.util.Scanner;


public class Game {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        
        int random = (int)(Math.random()*10);
        
        System.out.println(random);
        if(number == random){
            System.out.println("you are win");
        }
        else{
            System.out.println("you are looser");
        }
       
    }
    
}
