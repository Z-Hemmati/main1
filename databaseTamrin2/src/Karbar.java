import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Karbar {

        public static void main(String[] args)throws  Exception{
            Karbar karbar = new Karbar();

        }

        public void insert(Integer id, String nameKarbar, Integer year, String password,String grade) throws Exception {
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO karbar (id,nameKarbar,password,year,grade) VALUES ("+id+",'"+nameKarbar+"',"+year+","+password+","+grade+")");
            statement.close();
            connection.close();
        }




        public static String select() throws Exception {
            String records ="";
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM karbar order by idKarbar");
            while (resultSet.next()) {
                records=records+resultSet.getString("id") + " - " + resultSet.getString("nameKarbar") + " - " +resultSet.getString("password")+ " \n ";

            }
            statement.close();
            connection.close();
            return records;
        }

      }


