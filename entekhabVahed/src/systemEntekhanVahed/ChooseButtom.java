package systemEntekhanVahed;

import javax.swing.*;
import java.awt.event.*;

public class ChooseButtom extends JFrame implements ActionListener {
    JRadioButton rb1, rb2,rb3,rb4;
    JButton b;

    ChooseButtom() {
        rb1 = new JRadioButton("show");
        rb1.setBounds(100, 50, 100, 30);
        rb4 = new JRadioButton("record");
        rb4.setBounds(100, 100, 100, 30);
        rb2 = new JRadioButton("delete");
        rb2.setBounds(100, 150, 100, 30);
        rb3 = new JRadioButton("edit");
        rb3.setBounds(100, 200, 100, 30);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rb1);
        buttonGroup.add(rb2);
        buttonGroup.add(rb3);
        buttonGroup.add(rb4);
        b = new JButton("click");
        b.setBounds(100, 250, 80, 30);
        b.addActionListener(this);
        add(rb1);
        add(rb2);
        add(rb3);
        add(rb4);
        add(b);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (rb1.isSelected()) {
            JOptionPane.showMessageDialog(this, "show lesson.");
           see();
        }
        if (rb2.isSelected()) {
            JOptionPane.showMessageDialog(this, "delet lesson.");
            delete();
        }
        if (rb3.isSelected()) {
            JOptionPane.showMessageDialog(this, "edit lesson.");
            update();
        }
        if (rb4.isSelected()) {
            JOptionPane.showMessageDialog(this, "record lesson.");
            edit();
        }
    }

    public static void see() {
        String show="";
        SelectUnits selectUnits = new SelectUnits();
        try {
            show=selectUnits.select();
        } catch (Exception e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, show,"your lesson!",
                JOptionPane.INFORMATION_MESSAGE);

    }
    public static void edit() {
        Integer id;
        String lesson;
        Integer vahed;
        id=Integer.parseInt(JOptionPane.showInputDialog("enter id"));
        lesson=JOptionPane.showInputDialog("enter lesson");
        vahed=Integer.parseInt(JOptionPane.showInputDialog("enter vahed"));
        SelectUnits selectUnits = new SelectUnits();
        try {
            selectUnits.insert(id,lesson,vahed);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public static void delete() {


        Integer id;
        id = Integer.parseInt(JOptionPane.showInputDialog("enter lesson id to delete"));
        SelectUnits selectUnits = new SelectUnits();
        try {
            selectUnits.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public static void update(){


            Integer id;
            String lesson;
            Integer vahed;
            id=Integer.parseInt(JOptionPane.showInputDialog("enter id"));
            lesson=JOptionPane.showInputDialog("enter lesson");
            vahed=Integer.parseInt(JOptionPane.showInputDialog("enter vahed"));
            SelectUnits selectUnits = new SelectUnits();
            try {
                selectUnits.updated(id,lesson,vahed);
            } catch (Exception e) {
                e.printStackTrace();
            }

            }
    }
