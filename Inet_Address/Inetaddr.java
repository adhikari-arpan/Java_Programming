package Inet_Address;

import java.net.InetAddress;

public class Inetaddr {
    public static void main(String[] args) throws Exception {
        InetAddress pou = InetAddress.getByName("pu.edu.np");
        System.out.println("Host Name: " + pou.getHostName());
        System.out.println("Ip: " + pou.getHostAddress());
    }
}
