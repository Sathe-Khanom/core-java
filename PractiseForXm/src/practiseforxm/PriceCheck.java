package practiseforxm;

import java.util.Scanner;

public class PriceCheck {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Price");
        int price = s.nextInt();

        double discountPrice = price - (price * .05);

        if (price > 200) {

            System.out.println("Discount price is " + discountPrice + " " + " AND" + " " + "Actual Price is " + price);

        } else {
            System.out.println("Actual Price is " + price);
        }

    }
}
