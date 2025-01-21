package JDBC_Programs;

import java.sql.*;
import java.io.*;

public class JDBCImage {

    public static void main(String[] args) {

        // Database connection details
        String url = "jdbc:mysql://localhost:3306/image_data"; // URL of the MySQL database
        String username = "root"; // Username for database authentication
        String password = "peasandcarrots"; // Password for database authentication

        // for large images set the column datatype to LARGEBLOB
    
        try {
            // Establishing a connection to the database
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("connected to database...");
    
            // SQL query to insert binary data (image) into the 'images' table
            String query = "INSERT INTO images(img) VALUES(?)";
    
            // Creating a PreparedStatement object for the query
            PreparedStatement pstmt = con.prepareStatement(query);
    
            // Reading the image file as a binary stream
            FileInputStream fis = new FileInputStream("/Users/pratikkadlak/Downloads/vgg8_sizevsbit.png");
    
            // Setting the binary stream as the parameter for the SQL query
            pstmt.setBinaryStream(1, fis, fis.available()); 
    
            // Executing the update query to insert the image into the database
            pstmt.executeUpdate();
            System.out.println("image inserted...");
        } catch (Exception e) {
            // Handling exceptions and printing the stack trace for debugging
            e.printStackTrace();
        }
    }

}