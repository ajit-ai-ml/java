package java_networking;

import java.net.*;

public class q5 {

 
    public static void main(String[] args) throws Exception {

        String host = "www.gec.edu.in";

        InetAddress address = InetAddress.getByName(host);

        System.out.println("Host Name: " + address.getHostName());
        System.out.println("IP Address: " + address.getHostAddress());
        // System.out.println("procotocol name: "+address.getProtocol());
    }
}
    

