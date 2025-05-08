package testcollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection {

    public static void main(String[] args) {

        ArrayList<String> collection1 = new ArrayList<>();

        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");

        System.out.println("A list of cities in collection1");
        System.out.println(collection1);

        System.out.println("\n Is Dallas in collection1?" + collection1.contains("Dallas"));

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");

        System.out.println("\n A list cities in collection2");
        System.out.println(collection2);

        Iterator<String> iterator = collection2.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toUpperCase() + "");
            System.out.println();

        }

    }

}
