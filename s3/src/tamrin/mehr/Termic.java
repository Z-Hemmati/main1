package tamrin.mehr;

import java.util.Scanner;

public class Termic {
    public static void main(String[] args) {
        System.out.println("enter the number of your class : ");
        System.out.println("1 - riazi2 ");
        System.out.println("2 - fizik2 ");
        System.out.println("3 - sakhteman dadeh ");
        System.out.println("4 - riazi mohandesi ");
        System.out.println("5 - madar manteghi ");

        Scanner lesson = new Scanner(System.in);
        int lessonNumber = lesson.nextInt();

        if (lessonNumber==1){
            System.out.println("your class is : riazi2");
            System.out.println("course : 3-unit");
            System.out.println("pishniaz : riazi1 ");
            System.out.println("hamniaz : nothing");
        }
        if (lessonNumber==2){
            System.out.println("your class is : fizik2");
            System.out.println("course : 3-unit");
            System.out.println("pishniaz : riazi1");
            System.out.println("hamniaz : nothing");
        }
        if (lessonNumber==3){
            System.out.println("your class is : sakhteman dadeh");
            System.out.println("course : 3-unit");
            System.out.println("pishniaz : pishrafte , gosasteh ");
            System.out.println("hamniaz : nothing ");
        }
        if (lessonNumber==4){
            System.out.println("your class is : riazi mohandesi");
            System.out.println("course : 3-unit");
            System.out.println("pishniaz : moadelat , riazi2");
            System.out.println("hamniaz : nothing");
        }
        if (lessonNumber==5){
            System.out.println("your class is : madar manteghi");
            System.out.println("course : 3-unit");
            System.out.println("pishniaz : mabani");
            System.out.println("hamniaz : gosasteh");
        }

    }
}
