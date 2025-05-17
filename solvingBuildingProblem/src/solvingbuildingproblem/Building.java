
package solvingbuildingproblem;


public class Building {
    
 public String address;
 public int floors;

    public Building(String address, int floors) {
        this.address = address;
        this.floors = floors;
    }
 
 public void displayInfo(){
 
     System.out.println("Address : " + address);
     System.out.println("Floors : " + floors);
 
 
 }
    
    
}
