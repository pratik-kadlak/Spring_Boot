package JDBC_Programs;

import java.sql.*;

public class JDBCInsertion {

    public static void main(String[] args) {
        try {
            // Database connection details
            String url = "jdbc:mysql://localhost:3306/testdb"; // URL of the database
            String user = "root"; // Database username
            String password = "peasandcarrots"; // Database password
    
            // Establishing a connection to the database
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Established"); // Confirming successful connection
    
            // SQL query for inserting data into 'table1'
            // '?' are placeholders for parameterized values
            String qry = "INSERT INTO table1(id, name) VALUES (?, ?)";
    
            // Creating a PreparedStatement object to execute parameterized query
            PreparedStatement pstm = con.prepareStatement(qry);
    
            // Setting values for the placeholders in the query
            pstm.setString(1, "1"); // Setting the value for the first placeholder (id column)
            pstm.setString(2, "Pratik"); // Setting the value for the second placeholder (name column)
    
            // Executing the update to insert the data into the table
            pstm.executeUpdate();
            System.out.println("Data Inserted"); // Confirming successful data insertion
    
            // Closing the database connection
            con.close();
            
        } catch (Exception e) {
            // Catching and printing any exceptions that occur
            e.printStackTrace();
        }
    }
    
}