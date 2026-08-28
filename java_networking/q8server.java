import java.net.*;
import java.io.*
;

public class q8server {
    public static void main(String[] args) throws Exception {
        ServerSocket server =new ServerSocket(9998);
        System.out.println("hello i am server ");

        System.out.println("waiting for client.......");
        Socket socket =server.accept();
        System.out.println("client is connected successfully..");

        BufferedReader br =new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String mess=br.readLine();
        System.out.println("client said: "+mess);
        // String mess2=br.readLine();
        // System.out.println("client said second message: "+mess2);

        PrintWriter pw =new PrintWriter(socket.getOutputStream(),true);
        pw.println("hello client...");
        server.close();

        
    }
    
}
