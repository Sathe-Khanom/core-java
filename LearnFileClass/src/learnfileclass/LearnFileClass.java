package learnfileclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class LearnFileClass {

    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("C:\\Users\\Admin\\Desktop\\even.txt");
//        try {
//
////            System.out.println(f.exists());
////            System.out.println(f.length());
////            System.out.println(f.canRead());
////            System.out.println(f.canWrite());
////            System.out.println(f.lastModified());
////            System.out.println(f.isHidden());
//
//        }
//        PrintWriter pw = new PrintWriter(f);
//
//        pw.print("I am student of Java");
//        pw.print("afestgrfgbchtyu");
//
//        pw.close();


//        System.out.println("Even numbers from 1 to 50:");
        PrintWriter p = new PrintWriter(f);
        
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                p.println(i);
                
//                System.out.print(i + " ");
            }
            p.close();

        }
    }
}
