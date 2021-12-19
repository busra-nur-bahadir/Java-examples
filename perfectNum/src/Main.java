import java.util.Scanner;

public class Main {
    static void IsPerfect(int nm) {
        int total = 0;
        for (int i = 1; i < nm; ++i) {
            if (nm % i == 0) {
                total += i;
            }
        }
        if (total == nm) {
            System.out.println("its perfect");
        } else {
            System.out.println("its not perfect");
        }
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        while (true) {
            int num = scr.nextInt();
            IsPerfect(num);
        }
    }
}
