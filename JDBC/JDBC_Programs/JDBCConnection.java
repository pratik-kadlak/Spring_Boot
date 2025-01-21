package JDBC_Programs;

import java.sql.*; // Import classes for working with SQL and databases

public class JDBCConnection {

    public static void main(String[] args){
        // Database connection URL for the 'book_shop' database on localhost
        String url = "jdbc:mysql://localhost:3306/book_shop";
        // Username and password for connecting to the database
        String username = "root";
        String password = "peasandcarrots";

        try {
            // Establishing a connection to the database
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected To Database");

            // SQL query to fetch all records from the 'books' table
            String query = "SELECT * FROM books";

            // Creating a Statement object to execute the query
            Statement stm = con.createStatement();
            // Executing the query and storing the results in a ResultSet
            ResultSet set = stm.executeQuery(query);

            // Iterating through the results
            while(set.next()){
                // Retrieving values from the current row in the ResultSet
                String title = set.getString("title"); // Book title
                String fname = set.getString("author_fname"); // Author's first name
                String lname = set.getString("author_lname"); // Author's last name
                // Printing the book title and author's full name
                System.out.println(title + " " + fname + " " + lname);
            }

            con.close(); // close the connection to database

        } catch (Exception e){
            // Catching and printing any exceptions that occur
            e.printStackTrace();
        }
    }
}
