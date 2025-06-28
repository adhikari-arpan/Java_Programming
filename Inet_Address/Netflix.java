package Inet_Address;
import java.net.*;

public class Netflix {
    public static void main(String[] args) throws Exception{
        InetAddress[] netflix = InetAddress.getAllByName("www.netflix.com");
        for (InetAddress n:netflix){
        System.out.println(n.getHostAddress());
        }   
    }
}
