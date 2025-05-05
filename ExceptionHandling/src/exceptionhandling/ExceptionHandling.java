package exceptionhandling;

public class ExceptionHandling {

    public static void main(String[] args) {

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[7]);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
