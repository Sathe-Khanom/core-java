package readandwrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class ReadAndWrite {

    public static void main(String[] args) throws FileNotFoundException {
 java.io.File file = new java.io.File("scores.txt");
  if (file.exists()) {
         System.out.println("File already exists");
         System.exit(0);
 
  try (
  // Create a file
  java.io.PrintWriter output = new java.io.PrintWriter(file);
       ) {
  // Write formatted output to the file
         output.print("John T Smith ");
         output.println(90);
         output.print("Eric K Jones ");
         output.println(85);}
  }
    }
}
