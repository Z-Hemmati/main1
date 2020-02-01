import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Client {

        public static void main(String[] args)throws  Exception{
            Client client = new Client();

        }

        public void insert(Integer id, String name, Integer kodMeli, Integer year, Integer salary, String rank) throws Exception {
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO client (id,name,kodMeli,year,salary,rank) VALUES ("+id+",'"+name+"',"+year+","+salary+","+rank+","+kodMeli+")");
            statement.close();
            connection.close();
        }





        public static String select() throws Exception {
            String records ="";
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM student order by id");
            while (resultSet.next()) {
                records=records+resultSet.getString("id") + " - " + resultSet.getString("NAME") + " - " +resultSet.getString("kodMeli")+ " \n ";

            }
            statement.close();
            connection.close();
            return records;
        }

       }


