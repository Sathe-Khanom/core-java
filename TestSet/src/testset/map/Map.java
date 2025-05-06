package testset.map;


public class Map {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Nusrat");
        students.put(2, "Salman");
        students.put(3, "Abir");
        students.put(4, "Nusrat");

        System.out.println(students);
    }

}
