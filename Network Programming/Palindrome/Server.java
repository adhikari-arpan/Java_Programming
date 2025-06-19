package Palindrome;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server running on 5000");
        Socket s = ss.accept();
        System.out.println("Client connected on" + s.getPort());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        while (true) {
            String clientMsg = dis.readUTF();
            System.out.println("Client says: " + clientMsg);
           if(clientMsg.equalsIgnoreCase("bye")){
                break;
            }
            String check = isPalindrome(clientMsg);
            dos.writeUTF(check);
        }
        dos.close();
        dis.close();
        s.close();
        ss.close();
    }

    public static String isPalindrome(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (rev.equalsIgnoreCase(str)) {
            return "Palindrome";
        } else {
            return "Not a Palindrome";
        }
    }
}
