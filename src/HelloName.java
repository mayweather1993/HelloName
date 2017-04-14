/**
 * Created by Zver on 14.04.2017.
 */
import java.io.*;
public class HelloName {
    public static void main (String[] args)throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println("Hello, " + name);
    }

}
