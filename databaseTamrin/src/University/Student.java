package University;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {
    public static void main(String[] args)throws  Exception{
        Student st = new Student();

    }

    public void insert(Integer studentID,String name,Integer year,Float average) throws Exception {
        //Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        Statement statement = connection.createStatement();
        statement.executeUpdate("INSERT INTO student (studentID,name,count) VALUES ("+studentID+",'"+name+"',"+year+","+average+")");
        statement.close();
        connection.close();
    }

    public void delete(Integer studentID) throws Exception {
        //Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        Statement statement = connection.createStatement();
        statement.executeUpdate("DELETE FROM student WHERE studentID="+studentID);
        statement.close();
        connection.close();
    }



    public static String select() throws Exception {
        String records ="";
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM student order by studentID");
        while (resultSet.next()) {
            records=records+resultSet.getString("studentID") + " - " + resultSet.getString("NAME") + " - " +resultSet.getString("count")+ " \n ";

        }
        statement.close();
        connection.close();
        return records;
    }

    public void updated(Integer studentID,String name,Integer year,Float average) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        Statement statement = connection.createStatement();
        statement.executeUpdate("update course set name ="+name+",year="+year+" ,average="+average+"where id="+studentID);

        statement.close();
        connection.close();
    }}
