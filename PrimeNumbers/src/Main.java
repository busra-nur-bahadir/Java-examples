import java.util.Scanner;

public class Main {
    public static boolean IsPrimeNum(int num) {
        boolean res = true;
        for (int i = 2; i < num; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number");
            int num = scr.nextInt();
            System.out.println(IsPrimeNum(num));
        }
    }
}
