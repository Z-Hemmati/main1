import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int id,age,pass,tel;
        String name,address,education;
        System.out.println("id:");
        id=input.nextInt();
        Info.Builder person1=new Info.Builder(id);
        System.out.println("name");
        name=input.next();
        person1.personname(name);
        System.out.println("age:");
        age=input.nextInt();
        person1.age(age);
        System.out.println("address");
        address=input.next();
        person1.address(address);
        System.out.println("education:");
        education=input.next();
        person1.educatiom(education);
        System.out.println("password");
        pass=input.nextInt();
        person1.password(pass);
        System.out.println("telephone:");
        tel=input.nextInt();
        person1.telephone(tel);
        System.out.println("name: "+name);
        System.out.println("id: "+id);
        System.out.println("age:"+age);
        System.out.println("address:"+address);
        System.out.println("education:"+education);
        System.out.println("password: "+pass);
        System.out.println("telephone: "+tel);

    }

}
