import java.sql.*;
// import java.io.*;

public class q5 {
    private static final String url ="jdbc:mysql://localhost:3306/college";
    private static final String user ="root";
    private static final String password="root";
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");



        Connection con =DriverManager.getConnection(url,user,password);
         
        Statement st = con.createStatement();
        String query="select * from student";

        ResultSet rt = st.executeQuery(query);

        while(rt.next()){
            System.out.println("name  :  "+rt.getString("name"));
        }

        

        
        
    }
    
}
