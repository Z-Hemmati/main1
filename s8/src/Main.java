package shop;
import javax.swing.*;

public class main {
    public static void main(String[] args) {
        wellcome();
        menu();


        System.exit(0);
    }

    public static void wellcome() {
        JOptionPane.showMessageDialog(null,
                "wellcome to online shop",
                "shop",
                JOptionPane.INFORMATION_MESSAGE);
    }


    public static void menu() {
        String menuItem;
        Integer menuChoose;
        menuItem=JOptionPane.showInputDialog("choose your activity\n" +
                "1 - see your items\n" +
                "2 - add new item\n" +
                "3 - delete item\n" +
                "4 - buy item\n" +
                "5 - exit");
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
                case 4:
                    buy();
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
        proc JDBC = new proc();
        try {
            show=JDBC.select();
        } catch (Exception e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, show,"listing your items",
                JOptionPane.INFORMATION_MESSAGE);
        menu();
    }
    public static void add() {
        Integer id;
        String product;
        Integer count;
        id=Integer.parseInt(JOptionPane.showInputDialog("enter id"));
        product=JOptionPane.showInputDialog("enter product");
        count=Integer.parseInt(JOptionPane.showInputDialog("enter count"));
        proc JDBC = new proc();
        try {
            JDBC.insert(id,product,count);
        } catch (Exception e) {
            e.printStackTrace();
        }

        menu();
    }
    public static void delete() {


        Integer id;
        id=Integer.parseInt(JOptionPane.showInputDialog("enter product id to delete"));
        proc JDBC = new proc();
        try {
            JDBC.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        menu();
    }
    public static void buy() {

        Integer id;
        id=Integer.parseInt(JOptionPane.showInputDialog("enter product id to buy"));
        proc JDBC = new proc();
        try {
            JDBC.buy(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        menu();
    }

}