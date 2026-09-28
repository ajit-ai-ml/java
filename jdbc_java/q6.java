import java.sql.*;


public class q6{
    private static final String url="jdbc:mysql://localhost:3306/college";
    private static final String user="root";
    private static final String password="root";
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            Connection con=DriverManager.getConnection(url, user, password);

            Statement st=con.createStatement();
            String query="select * from student";
            ResultSet resultSet=st.executeQuery(query);
            while(resultSet.next()){
                int rollno=resultSet.getInt("id");
                String name=resultSet.getString("name");
                int marks=resultSet.getInt("marks");
                String grade=resultSet.getString("grade");
                String city=resultSet.getString("city");

                System.out.println("name: "+name+"id: "+rollno+"grade: "+grade+"city: "+city+"marks: "+marks);
            }
            con.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
       

        
    }

     
}
}
