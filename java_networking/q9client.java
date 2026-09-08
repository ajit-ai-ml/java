import java.net.*;
import java.io.*;

public class q9client {
    public static void main(String[] args){
        try{
            Socket s = new Socket("localhost", 1234);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hello from client");
            dos.flush();
            s.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
