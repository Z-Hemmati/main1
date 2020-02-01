package ir.excersize2.state2;

import java.util.Scanner;

public class Tamrin21 {

    public static void main(String[] args) {
        System.out.println("enter your hoghogh" );
        Scanner scanner =new Scanner(System.in);
        String str =scanner.nextLine();
        int myh=Integer.parseInt( str);
        System.out.println("enter your aghsat" );
        String agh =scanner.nextLine();
        int mya=Integer.parseInt( agh);
        System.out.println("baghimande");
        System.out.println( myh-mya);
    }
}
