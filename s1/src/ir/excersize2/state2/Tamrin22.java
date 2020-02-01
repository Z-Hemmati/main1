package ir.excersize2.state2;

import java.util.Scanner;

public class Tamrin22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your marks");
        int r = 0;
        for (int i = 0; i < 5; i++) {
            String s = scanner.nextLine();
            int m = Integer.parseInt(s);
            r = r + m;
        }
        System.out.println("your average:");
        System.out.println(r / 5);
        if (r / 5 < 12) {
            System.out.println("mashrot :(");
        } else {
            System.out.println("ghabol :)");
        }
    }
}