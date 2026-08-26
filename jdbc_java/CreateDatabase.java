 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {

    public static void main(String[] args) {

        // MySQL server details
        String url = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "root";

        // Database name
        String databaseName = "class";

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to MySQL Server
            Connection con = DriverManager.getConnection(
                    url,
                    username,
                    password
            );

            System.out.println("Database connection successful.");

            // Create Statement
            Statement stmt = con.createStatement();

            // Create database
            String createDatabase =
                    "CREATE DATABASE IF NOT EXISTS " + databaseName;

            stmt.executeUpdate(createDatabase);

            System.out.println("Database '" + databaseName + "' created successfully.");

            // Check whether database exists
            String checkDatabase =
                    "SHOW DATABASES LIKE '" + databaseName + "'";

            ResultSet rs = stmt.executeQuery(checkDatabase);

            if (rs.next()) {
                System.out.println("Database '" + databaseName + "' exists.");
                System.out.println("Database creation verified successfully.");
            } else {
                System.out.println("Database was not found.");
            }

            // Close resources
            rs.close();
            stmt.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Database connection or SQL error.");
            e.printStackTrace();
        }
    }
}