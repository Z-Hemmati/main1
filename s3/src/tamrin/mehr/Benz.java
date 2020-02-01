package tamrin.mehr;

import java.util.Scanner;

public class Benz {
    public static void main(String[] args) {

        System.out.println("Enter brand 'benz'");
        Scanner brandCar = new Scanner(System.in);
        String inputBrandCar = brandCar.nextLine();
//        System.out.println("your brand is " + inputBrandCar);

        if (inputBrandCar.equals("benz")) {

            System.out.println("Mercedes-Benz AMG GLC. starting at $54,900.");
            System.out.println("******************************************");
            System.out.println("Mercedes-Benz B-Class. starting at $39,900.");
            System.out.println("******************************************");
            System.out.println("Mercedes-Benz CL. starting at $85,500.");
            System.out.println("******************************************");
            System.out.println("Mercedes-Benz CLK. starting at $40,600.");
            System.out.println("******************************************");
            System.out.println("Mercedes-Benz GL-Class. starting at $52,400.");

        } else {
            System.out.println("your brand is not benz");
        }
    }
}
