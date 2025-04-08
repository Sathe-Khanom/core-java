package vowelconsonant.using.pkgswitch;

import java.util.Scanner;

public class VowelconsonantUsingSwitch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a letter");
        char letter = s.next().toLowerCase().charAt(0);

//        char output=0;
        switch (letter) {
            case 'a':

            case 'e':

            case 'i':

            case 'o':

            case 'u':
                
                System.out.println("vowel");
                break;

            default:
                System.out.println("consonant");

        }
    }

}
