package JDBC_Programs;

import java.sql.*;
import java.io.*;

public class JDBCUpdate {
    
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "peasandcarrots";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected To Database."); 

            String qry = "UPDATE table1 SET name=? WHERE id=?";
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter new Name: ");
            String name = br.readLine();

            System.out.println("Enter Student ID: ");
            int id = Integer.parseInt(br.readLine());

            PreparedStatement pstmt = con.prepareStatement(qry);
            pstmt.setString(1, name);
            pstmt.setInt(2, id);

            pstmt.executeUpdate();
            System.out.println("Database Updated...");

            con.close();
            br.close();

        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
