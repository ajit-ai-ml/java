// package java_networking;
import java.net.*;
import java.io.*;


public class q3server {
    public static void main(String[] args) throws Exception {
        ServerSocket server =new ServerSocket(9898);
        System.out.println("server is waiting for client...");
        Socket socket=server.accept();
        System.out.println("server is connnected succesfully");

        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String message=br.readLine();

        System.out.println("client says: "+message);

        PrintWriter pw =new PrintWriter(socket.getOutputStream(),true);
        pw.println("hy client i am your server!");

        OutputStreamWriter os = new OutputStreamWriter(socket.getOutputStream());
        String mess="hy this message send using outputstreamwriter\n";
        os.write(mess);
        os.flush();

            


        server.close();
        socket.close();
        
    }
    
}
