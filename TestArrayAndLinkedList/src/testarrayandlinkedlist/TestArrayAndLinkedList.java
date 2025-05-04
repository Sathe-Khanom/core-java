package testarrayandlinkedlist;

import java.util.ArrayList;
import java.util.List;

public class TestArrayAndLinkedList {

    public static void main(String[] args) {

//        ArrayList<String> collection1 = new ArrayList<>();
//        collection1.add("New York");
//        collection1.add("Atlanta");
//        collection1.add("Dallas");
//        collection1.add("Madison");
//
//        System.out.println("A list of cities in collection1:");
//        System.out.println(collection1);
//
//        System.out.println("\nIs Dallas in collection1? "
//                + collection1.contains("Dallas"));
//
//        collection1.remove(0);
//        System.out.println("\n" + collection1.size()
//                + " cities are in collection1 now");

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); // 1 is autoboxed to new Integer(1)
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0, 10);
        arrayList.add(3, 30);

        System.out.println("A list of integers in the array list:");
        System.out.println(arrayList);

    }

}
