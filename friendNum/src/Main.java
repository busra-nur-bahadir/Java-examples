import java.util.Scanner;

public class Main {
    public static int dividerAdd(int num) {
        int tot = 0;
        for (int i = 1; i < num; ++i) {
            if (num % i == 0) {
                tot += i;
            }
        }

        return tot;
    }

    public static void IsFriends(int num1, int num2) {
        if ((dividerAdd(num1) == num2) && (dividerAdd(num2) == num1)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        while (true) {
            System.out.println("enter first num:");
            int num_1 = scr.nextInt();
            System.out.println("Enter second Num:");
            int num_2 = scr.nextInt();
            IsFriends(num_1, num_2);
        }
    }
}
