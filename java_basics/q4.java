// import java.sql.*;
import java.util.Scanner;
 
public class q4 {
    public static void main(String[] args) throws  Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id of the employee");
        int id =scanner.nextInt();
        System.out.println("Enter the name of the employee");
        String name = scanner.next();
        System.out.println("name is " + name);
        System.out.println("id is " + id);
        scanner.close();


        
    }
    
}
