import java.net.*;
import java.io.*;



public class q11server {
    public static void main(String[] args)throws Exception {
     
     ServerSocket server=new ServerSocket(12345); 
    Socket socket=server.accept();
    System.out.println("Client connected: " + socket.getInetAddress().getHostAddress());
    

    BufferedReader in =new BufferedReader(new InputStreamReader(socket.getInputStream()));
    PrintWriter out =new PrintWriter(socket.getOutputStream(),true);

    out.println("hello client....");
    String messageFromClient = in.readLine();
    System.out.println("Received from client: " + messageFromClient);   

    

    }
    
}
