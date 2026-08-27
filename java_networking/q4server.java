package java_networking;
import java.net.*;
import java.io.*;

public class q4server {
    public static void main(String[] args) throws Exception{
        String ip="localhost";
        int port=9797;
         Socket socket=new Socket(ip,port);

         OutputStreamWriter out =new OutputStreamWriter(socket.getOutputStream()) ;

         out.write("hy i am client!\n ");
         out.flush();

         BufferedReader br =new BufferedReader(new InputStreamReader(socket.getInputStream()));
         String mess=br.readLine();
         System.out.println("server said : "+mess);

         socket.close();
        



            
         
        
    }
    
}
