import DTO.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customerData = new ArrayList<Customer>();
        Scanner scr = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Continue?");
            flag = scr.nextBoolean();
            if(!flag)
                break;
            System.out.println("Enter customer id");
            int id = scr.nextInt();
            scr.nextLine();
            System.out.println("Enter customer name:");
            String name = scr.nextLine();
            System.out.println(name);
            String[] parts = name.split(" ");
            customerData.add(new Customer(id, parts[0], parts[1]));
            for (Customer c : customerData) {
                System.out.println(c.toString());
            }
        } while (flag);
    }
}
