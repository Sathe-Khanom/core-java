package testset;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import testset.map.HashMap;

public class TestSet {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Atik");
        names.add("Rahim");
        names.add("Sadiar");
        names.add("Rahmat");
//        names.add("Atik");
        
//        System.out.println(names);
        
//       Map<Integer, String> students = new HashMap<>();
//       
//       students.put(1, "Nusrat");
//       students.put(2,"Salman");
//       students.put(3,"Abir");
//       students.put(4,"Nusrat");
//       
//        System.out.println(students);

   Map<Integer, String> stuDetails = new HashMap<>();

        stuDetails.put(1, "Atik");
        stuDetails.put(2, "Imran");
        stuDetails.put(3, "Reza");
        stuDetails.put(4, "Rakib");

        System.out.println(stuDetails);
       
       
    }

}
