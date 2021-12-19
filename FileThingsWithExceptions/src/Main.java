import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("D:\\Java\\FileThingsWithExceptions\\src\\files\\student.txt");

        fileCreate(file);
        fileInfo(file);
        fileRead(file);
        fileWrite(file);
        fileRead(file);
    }

    public static void fileCreate(File file) {
        try {
            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File exists");
            }
        } catch (IOException e) {
            System.out.println("ERROR:" + e);
        }
    }

    public static void fileInfo(File file) {
        System.out.println("path: " + file.getAbsolutePath());
        System.out.println("name: " + file.getName());
        System.out.println("r :" + file.canRead());
        System.out.println("w: " + file.canWrite());
        System.out.println("x: " + file.canExecute());
    }

    public static void fileWrite(File file) {
        Scanner scr = new Scanner(System.in);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file.getName(), true));
            bufferedWriter.newLine();
            for (int i = 0; i < 5; ++i) {
                System.out.println("Enter name:");
                String something = scr.nextLine();
                bufferedWriter.write(something);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileRead(File file) {
        try {
            File myObj = new File(file.getName());
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
