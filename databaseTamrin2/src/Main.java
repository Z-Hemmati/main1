

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {public static void main(String[] args) {
    wellcome();
    menu();


    System.exit(0);
}

    public static void wellcome() {
        JOptionPane.showMessageDialog(null,
                "wellcome",
                "karbar",
                JOptionPane.INFORMATION_MESSAGE);
    }


    public static void menu() {
        Integer menuChoose;
        String menuItem = JOptionPane.showInputDialog("choose your activity\n" +
                "1 - see list of student \n" +
                "2 - add new student \n" +
                "3 - exit "
        );
        try {
            menuChoose = Integer.parseInt(menuItem);
            switch (menuChoose) {
                case 1:
                    see();
                    break;
                case 2:
                    add();
                    break;
                default:
                    break;
            }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"adad vared konid");
            main(new String[]{} );
        }
    }

    public static void see() {
        String show="";

        Karbar karbar = new Karbar();
        try {
            show=Karbar.select();
        } catch (Exception e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, show,"listing your student",
                JOptionPane.INFORMATION_MESSAGE);
        menu();
    }
    public static void add() {
        Integer idKarbar;
        String nameKarbar;
        String email;
        Integer year;
        String grade;
        String password;
        idKarbar=Integer.parseInt(JOptionPane.showInputDialog("enter studentID"));
        nameKarbar=JOptionPane.showInputDialog("enter name");
        year=Integer.parseInt(JOptionPane.showInputDialog("enter year"));
        grade=JOptionPane.showInputDialog("enter grade");
        password=JOptionPane.showInputDialog("enter password");
        Karbar student = new Karbar();
        try {
            student.insert( idKarbar, nameKarbar, year, grade,password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        menu();
    }
}