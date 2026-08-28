// package java_networking;
import java.net.*;
import java.io.*;


public class q4client {
    public static void main(String[] args) throws Exception{
        System.out.println("Hy i am server ! ");
        ServerSocket server =new ServerSocket(9797);
        System.out.println("server is waiting for client....");
        Socket socket =server.accept();

        System.out.println("server is connected");
         BufferedReader br= new BufferedReader(new InputStreamReader(socket.getInputStream()));
         String mess=br.readLine();
         System.out.println("server said: "+mess);

         OutputStreamWriter out = new OutputStreamWriter(socket.getOutputStream());
         out.write("hy i am server!\n");
         out.flush();
         server.close();
         socket.close();

        
    }
    
}

