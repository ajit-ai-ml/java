import java.net.*;
import java.io.*;


public class q10server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("Server is listening on port 12345");
        
         
            Socket socket = serverSocket.accept();
            System.out.println("Client connected: " + socket.getInetAddress().getHostAddress());

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

           out.println("hello clientt... how are you");

           String message = in.readLine();
           System.out.println("Received from client: " + message);
            
             
           
            serverSocket.close();
             
        
    }
    
}
