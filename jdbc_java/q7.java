import java.sql.*;
import java.io.*


;
public class q7 {
    public static void main(String args[]) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");

    Statement st =con.createStatement();
    String query = "select * from student";
    ResultSet rs = st.executeQuery(query);

    while(rs.next()) {
             System.out.println("name  :  "+rs.getString("name"));
    }


}
}