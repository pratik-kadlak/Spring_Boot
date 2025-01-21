package JDBC_Programs;

import java.sql.*;

public class JDBCCreate {
    
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "peasandcarrots";

        try{
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Established");

            String qry = "CREATE TABLE table1(id int(20) PRIMARY KEY AUTO_INCREMENT,name VARCHAR(20) NOT NULL)";
            Statement stm = con.createStatement();
            stm.executeUpdate(qry);

            System.out.println("Table Created");
            con.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
