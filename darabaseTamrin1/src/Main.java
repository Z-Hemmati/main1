import javax.swing.JOptionPane;


public class Main {public static void main(String[] args) {
        wellcome();
        menu();


        System.exit(0);
    }

        public static void wellcome() {
            JOptionPane.showMessageDialog(null,
                    "wellcome ",
                    "client",
                    JOptionPane.INFORMATION_MESSAGE);
        }


        public static void menu() {
            Integer menuChoose;
            String menuItem = JOptionPane.showInputDialog(
                    "1 - see list information of client \n" +
                    "2 - add new information of client \n" +
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
            Client client = new Client();
            try {
                show=client.select();
            } catch (Exception e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, show,"listing your client's information",
                    JOptionPane.INFORMATION_MESSAGE);
            menu();
        }
        public static void add() {
            Integer clientId;
            String name;
            Integer year;
            Integer kodMli;
            Integer salary;
            String rank;
            clientId=Integer.parseInt(JOptionPane.showInputDialog("enter clientId"));
            name=JOptionPane.showInputDialog("enter name");
            salary=Integer.parseInt(JOptionPane.showInputDialog("enter salary"));
            rank=JOptionPane.showInputDialog("enter rank");
            year=Integer.parseInt(JOptionPane.showInputDialog("enter year"));
            kodMli=Integer.parseInt(JOptionPane.showInputDialog("enter kodMli"));
            Client client = new Client();
            try {
                client.insert( clientId, name, year, kodMli,salary,rank);
            } catch (Exception e) {
                e.printStackTrace();
            }

            menu();
        }



    }



