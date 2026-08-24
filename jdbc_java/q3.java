
import java.sql.*;

    
public class q3 {

    private static final String url="jdbc:mysql://localhost:3306/college";
    private static final String user="root";
    private static final String password="root";


    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc:Driver");

        }catch(Exception e){
            System.out.println(e.getMessage());
        
        }

        try{
            Connection con =DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            String query= "insert into student values(12,\"anshu\",90,\"A\",\"delhi\")";
            int roweffect=st.executeUpdate(query);

            if(roweffect>0){
                System.out.println("inserted succecfully");

            }
            else{
                System.out.println("not inserted");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }



        
    }
    
}
