
package evennumberwithfileclass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class EvenNumberWithFileClass {

    public static void main(String[] args) throws FileNotFoundException {
       
        File f = new File("C://Users//Admin//Desktop//even.txt");
//        String result = "";
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter limit");
        
        int l = s.nextInt();
        PrintWriter pw = new PrintWriter(f);
        for(int i = 1; i <= l; i++){
        if(i % 2 == 0){
//        result += i + " "  ;
         pw.println(i);
        }
        
        }
        System.out.println("Your file created successfully");
        
       
        pw.close();
        
    }
    
}