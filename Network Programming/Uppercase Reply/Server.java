import java.net.*;
import java.io.*;

class Server{
    public static void main (String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(4000);
        System.out.println("Server running on 4000");
        Socket s = ss.accept();
        System.out.println("Client connected"+ s.getPort());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        String msg = dis.readUTF();
        dos.writeUTF(msg.toUpperCase());
        dos.close();
        dis.close();
        s.close();
        ss.close();
    }
}