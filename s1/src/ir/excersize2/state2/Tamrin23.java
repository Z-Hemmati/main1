package ir.excersize2.state2;

import java.util.Scanner;

public class Tamrin23 {
    public static void main(String[] args) {
        System.out.println("enter toll v arze");
        Scanner scanner =new Scanner(System.in);
        String str =scanner.nextLine();
        int t=Integer.parseInt( str);
        String s =scanner.nextLine();
        int a =Integer.parseInt(s);
        int p= a+t;
        int h=a*t ;
        System.out.println("masahat");
        System.out.println( h );
        System.out.println("mahit");
        System.out.println(2*p ) ;
    }
}
