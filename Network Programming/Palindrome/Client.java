package Palindrome;

import java.net.*;
import java.io.*;
import java.util.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Socket s = new Socket("localhost", 5000);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        while (true) {
            System.out.println("Type your message...");
            String str = scan.nextLine();
            dos.writeUTF(str);
            if(str.equalsIgnoreCase("bye")){
                break;
            }
            String reply = dis.readUTF();
            System.out.println("Server Reply " + reply);
        }
        dos.close();
        dis.close();
        s.close();
    }
}
