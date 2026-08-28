import java.net.*;
import java.io.*;

public class q8client {
    public static void main(String[] args) throws Exception {
        String ip="localhost";
        int port =9998;
        Socket socket=new Socket(ip,port);

        OutputStreamWriter out =new OutputStreamWriter(socket.getOutputStream());
        out.write("hello server...\n");
        out.flush();
        // out.write("how are you\n");


        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String mess=br.readLine();
        System.out.println("server said: "+mess);

        socket.close();
        
    }
    
}
