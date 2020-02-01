package systemEntekhanVahed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectUnits {
    public static void main(String[] args)throws  Exception{
        SelectUnits selectUnits = new SelectUnits();
        try {

        } catch (Exception e) {

            System.out.println("Not available!!!!!");
        }

    }

    public void insert(Integer id,String lesson,Integer vahed) throws Exception {
        //Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        Statement statement = connection.createStatement();
        statement.executeUpdate("insert INTO course (id,lesson,vahed) VALUES ("+id+",'"+lesson+"',"+vahed+")");
        statement.close();
        connection.close();
    }

    public void delete(Integer id) throws Exception {
        //Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        Statement statement = connection.createStatement();
        statement.executeUpdate("DELETE FROM course WHERE ID="+id);
        statement.close();
        connection.close();
    }



    public static String select() throws Exception {
        String records ="";
        //Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM course");
        while (resultSet.next()) {
            records=records+resultSet.getString("ID") + " - " + resultSet.getString("lesson") + " - " +resultSet.getString("vahed")+ " \n ";


      }
        statement.close();
        connection.close();
        return records;
    }
    public void updated(Integer id,String lesson,Integer vahed) throws Exception {
        //Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        Statement statement = connection.createStatement();
        statement.executeUpdate("update course set lesson='"+lesson+"',vahed="+vahed+" where id="+id);

        statement.close();
        connection.close();
    }

}
