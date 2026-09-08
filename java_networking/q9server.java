import java.net.*;
import java.io.*;


public class q9server {
    public static void main(String[] args){
        try{
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("Server is listening on port 1234");
            Socket s = ss.accept();
            System.out.println("Client connected");
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String)dis.readUTF();
            System.out.println("Message from client: " + str);
            ss.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
