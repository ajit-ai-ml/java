
package java_networking;
import java.net.*;
import java.io.*;

public class q6url {
    public static void main(String[] args) throws Exception {

        URL url = new URL("https://www.google.com");

        URLConnection con = url.openConnection();

        BufferedReader rd =
            new BufferedReader(
                new InputStreamReader(
                    con.getInputStream()));

        String line;

        while ((line = rd.readLine()) != null) {
            System.out.println(line);
        }

        rd.close();
    }
}