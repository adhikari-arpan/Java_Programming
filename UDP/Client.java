package UDP;
import java.net.*;

public class Client{
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        String msg = "Hello, Arpan";
        byte[] sendBuffer = msg.getBytes();
        InetAddress serverIp = InetAddress.getLocalHost();
        DatagramPacket snPacket = new DatagramPacket(sendBuffer, sendBuffer.length, serverIp, 6000);
        socket.send(snPacket);

        //Receive
        byte[] receiveBuffer = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
        socket.receive(receivePacket);
        String data = new String (receivePacket.getData());
        System.out.println("Received Message: " + data);
        socket.close();
    }
}
