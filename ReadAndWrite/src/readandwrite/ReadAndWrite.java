package readandwrite;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ReadAndWrite {

    public static void main(String[] args) throws FileNotFoundException  {
       
        try ( PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\java.txt")) {
            pw.print("Rahmat is brilliant");
            pw.close();
            
         
        }
         
    }
}
