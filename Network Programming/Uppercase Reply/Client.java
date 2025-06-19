import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 4000);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        String str = "Hello, Server!";
        dos.writeUTF(str);
        String reply = dis.readUTF();
        System.out.println("Server Reply " + reply);
        dos.close();
        dis.close();
        s.close();
    }
}
