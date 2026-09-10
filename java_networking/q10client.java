import java.net.*;
import java.io.*;


public class q10client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        System.out.println("Connected to server: " + socket.getInetAddress().getHostAddress());

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String messageFromServer = in.readLine();
        System.out.println("Received from server: " + messageFromServer);

        out.println("I am fine, thank you!");

        socket.close();
    }
    
}
