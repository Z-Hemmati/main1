package tamrin.mehr;

import java.util.Scanner;

public class Myinfo {
    public static void main(String[] args) {

        System.out.println("Enter my name");
        Scanner name1 = new Scanner(System.in);
        String myname = name1.nextLine();

        if (myname.equals("hemmati")) {

            System.out.println(" reshte : computer ");
            System.out.println("******************************************");
            System.out.println(" tedad vahed gozarande : 78 ");
            System.out.println("******************************************");
            System.out.println(" moadel : 17.99 ");
            System.out.println("******************************************");
            System.out.println("voroodi : 97");
            System.out.println("******************************************");
            System.out.println("shomare daneshjoee : 9710293743");
            System.out.println("******************************************");
            System.out.println("doroose gozarande : riazi , fizik , mabani , ....");

        } else {
            System.out.println("ooooops");
        }
    }
}
