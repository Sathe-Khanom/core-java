
package solvingbuildingproblem;


public class House extends Building{
   
  public int bedrooms;

    public House(int bedrooms, String address, int floors) {
        super(address, floors);
        this.bedrooms = bedrooms;
    }
  
  
  @Override
 public void displayInfo(){
 
 super.displayInfo();
      System.out.println("Bedrooms : " + bedrooms);
 
 }  
    
    
}
