
package studentobject.sub;

import studentobject.sup.Person;

public class Student extends Person{
    
String studentId;

    public Student(String studentId, String name, int age) {
        super(name, age);
        this.studentId = studentId;
    }

   public void displayDetails(){
   
       System.out.println("Name : " + name);
       System.out.println("Age : " + age);
       System.out.println("Student ID : " + studentId);
   
   
   
   
   }

   


    
}
