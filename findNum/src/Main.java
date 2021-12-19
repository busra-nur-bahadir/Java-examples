import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    static void isExists(int nm, int[] int_arr) {
        boolean trigger = false;
        for (int i : int_arr) {
            if (nm == i) {
                trigger = true;
                break;
            }
        }
        if (trigger) {
            System.out.println("IT EXISTS");
        } else {
            System.out.println("SORRY :(");
        }
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        while (true) {
            int[] int_arr = new int[10];
            System.out.println("Enter a num");
            int num = scr.nextInt();
            for (int i = 0; i < 10; ++i) {
                int_arr[i] = (int) (Math.random()*20);
            }
            System.out.println("random int arr => " + Arrays.toString(int_arr));
            isExists(num, int_arr);
        }
    }
}
