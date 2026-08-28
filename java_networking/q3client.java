// package java_networking;
import java.io.*;
import java.net.*;

public class q3client {
    public static void main(String[] args) throws Exception{
        String ip="localhost";
        int port=9898;


        Socket socket= new Socket(ip,port);

        PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
        pw.println("hello i am client!");

        BufferedReader rd =new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String servermessage=rd.readLine();
        System.out.println("server said: "+servermessage);

        String mess=rd.readLine();
        System.out.println("srever: "+mess);

        socket.close();
        


    }
    
}
