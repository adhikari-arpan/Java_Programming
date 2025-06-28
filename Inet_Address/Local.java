package Inet_Address;
import java.net.*;

public class Local {
    public static void main(String[] args) throws Exception{
        InetAddress local = InetAddress.getLocalHost();
        System.out.println("Local Host Name"+ local.getHostName());
        System.out.println("Local Host Address"+ local.getHostAddress());
    }   
}
