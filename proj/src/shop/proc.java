package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class proc {
    public static void main(String[] args)throws  Exception{
        proc JDBC = new proc();
        try {
            //JDBC.buy(1);
            //JDBC.select();
            //JDBC.insert(1,"mobile",10);
            //JDBC.delete(1);
        } catch (Exception e) {

            System.out.println("Data Base Terekide!!!!!!");
        }

    }

    public void insert(Integer idproduct,String name,Integer count) throws Exception {
        //Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        Statement statement = connection.createStatement();
        statement.executeUpdate("INSERT INTO product (id,name,count) VALUES ("+idproduct+",'"+name+"',"+count+")");
        statement.close();
        connection.close();
    }

    public void delete(Integer idproduct) throws Exception {
        //Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        Statement statement = connection.createStatement();
        statement.executeUpdate("DELETE FROM product WHERE ID="+idproduct);
        statement.close();
        connection.close();
    }



    public static String select() throws Exception {
        String records ="";
        //Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM product order by id");
        while (resultSet.next()) {
            records=records+resultSet.getString("ID") + " - " + resultSet.getString("NAME") + " - " +resultSet.getString("count")+ " \n ";

//            System.out.print(resultSet.getString("ID") + " ");
//            System.out.print(resultSet.getString("NAME") + " ");
//            System.out.println(resultSet.getString("count"));
        }
        statement.close();
        connection.close();
        return records;
    }


    public void buy(Integer idproduct) throws Exception {
        Integer count=null;
        //Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM product where ID="+idproduct);
        while (resultSet.next()) {

            count=resultSet.getInt("count");
        }
        count=count-1;
        statement.executeUpdate("UPDATE product SET count="+count+" WHERE ID ="+idproduct);

        statement.close();
        connection.close();
    }

}
