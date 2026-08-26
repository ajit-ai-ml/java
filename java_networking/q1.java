package java_networking;
import java.net.*;
import java.io.*;

public class q1 {
    public static void main(String[] args) throws Exception {

        Socket socket =new Socket("localhost",9999);
        InputStream input = socket.getInputStream();
        BufferedReader reader = new  BufferedReader(new InputStreamReader(input));
        String message=reader.readLine();
        System.out.println("server says : "+ message);
        socket.close();

        
    }

    
}
