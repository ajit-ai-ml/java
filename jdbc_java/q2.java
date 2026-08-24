import java.sql.*;
public class q2 {
    private static final String url="jdbc:mysql://localhost:3306/college";
    private static final String user="root";
    private static final String Password="root";
    public static void main(String[] args) {
        try{

        Class.forName("com.mysql.cj.jdbc.Driver");
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    try{
    Connection con =DriverManager.getConnection(url, user, Password);

    Statement sm=con.createStatement();
    String query="select * from student";
    ResultSet resultSet=sm.executeQuery(query);
    while (resultSet.next()) {

                int rollno = resultSet.getInt("rollno");
                String name = resultSet.getString("name");
                int marks = resultSet.getInt("marks");
                String grade = resultSet.getString("grade");
                String city = resultSet.getString("city");

                System.out.println("name: " + name + "rollno: "+rollno +"grade: "+grade +"city: "+city +"marks: "+marks);
//                System.out.println("rollno: " + rollno);
//                System.out.println("grade: " + grade);
//                System.out.println("city: " + city);
//                System.out.println("marks: " + marks);
            }
                con.close();



    }catch(Exception e){
        System.out.println(e.getMessage());
    }



    }
    
}
