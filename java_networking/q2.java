// package java_networking;
import java.net.*;
import java.io.*;

public class q2 {
    public static void main(String[] args)throws Exception{
        ServerSocket server = new ServerSocket(9999);
        System.out.println("server is waiting......");
        Socket socket=server.accept();
        System.out.println("client connected!");

        OutputStream output =socket.getOutputStream();
        PrintWriter wr=new PrintWriter(output,true);
        wr.println("hello client...");
        socket.close();
        server.close();

    }
}
