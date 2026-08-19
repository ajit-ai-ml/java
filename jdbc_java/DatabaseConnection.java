package jdbc_java;
import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) {

        try {
            // 1. Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "root"
            );

            System.out.println("Database connected successfully!");

            // 3. Create PreparedStatement
            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM student"
            );

            // 4. Execute query
            ResultSet rs = ps.executeQuery();

            // 5. Read result
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name")
                );
            }

            // 6. Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}