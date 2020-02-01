package University;

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
                "wellcome to golestan",
                "shop",
                JOptionPane.INFORMATION_MESSAGE);
    }


    public static void menu() {
        Integer menuChoose;
        String menuItem = JOptionPane.showInputDialog("choose your activity\n" +
                "1 - see list of student \n" +
                "2 - add new student \n" +
                "3 - delete student\n"+
                "4 - edit information\n"+
                "5 - exit "
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
                case 3:
                    delete();
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
        Student student = new Student();
        try {
            show=student.select();
        } catch (Exception e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, show,"listing your student",
                JOptionPane.INFORMATION_MESSAGE);
        menu();
    }
    public static void add() {
        Integer studentID;
        String name;
        Integer year;
        Float average;
        studentID=Integer.parseInt(JOptionPane.showInputDialog("enter studentID"));
        name=JOptionPane.showInputDialog("enter name");
        year=Integer.parseInt(JOptionPane.showInputDialog("enter year"));
        average=Float.parseFloat(JOptionPane.showInputDialog("enter average"));
        Student student = new Student();
        try {
            student.insert( studentID, name, year, average);
        } catch (Exception e) {
            e.printStackTrace();
        }

        menu();
    }
    public static void delete() {


        Integer studentID;
        studentID=Integer.parseInt(JOptionPane.showInputDialog("enter pstudentID to delete"));
        Student student = new Student();
        try {
            student.delete(studentID);
        } catch (Exception e) {
            e.printStackTrace();
        }

        menu();
    }
    public void updated(Integer studentID,String name,Integer year,Float average) throws Exception {
        //Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        Statement statement = connection.createStatement();
        statement.executeUpdate("update course set name='"+name+"',year="+year+" ,average="+average+"where studentID="+studentID);

        statement.close();
        connection.close();
    }

}