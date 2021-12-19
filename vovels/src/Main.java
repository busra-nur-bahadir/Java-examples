import java.sql.Array;
import java.util.Scanner;

public class Main {

    static void someVowels(char myChar) {
        switch (myChar) {
            case 'e', 'i', 'ü', 'ö':
                System.out.println("SOFT");
                break;
            case 'a', 'o', 'u':
                System.out.println("NOT_SOFT");
                break;
            default:
                System.out.println("NOT VOWEL");
        }
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        do {
            System.out.println("Enter a vowel:");
            char myChar = scr.next().charAt(0);
            someVowels(myChar);
        } while (true);

    }
}
