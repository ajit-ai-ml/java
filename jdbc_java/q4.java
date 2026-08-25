 import java.sql.*;



public class q4 {
    private static final String url="jdbc:mysql://localhost:3306/college";
    private static final String user="root";
    private static final String password="root";
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            Connection con =DriverManager.getConnection(url,user,password);
            String query="Select * from student";
            Statement st =con.createStatement();
            ResultSet rt =st.executeQuery(query);

            while(rt.next()){
                System.out.println("roll no: "+rt.getInt("rollno")+"   |    Name: "+rt.getString("Name"));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    
}
