
import java.rmi.registry.*;

class RmiServer {
    public static void main(String[] args) throws Exception {
        CheckImplement obj = new CheckImplement();
        Registry reg = LocateRegistry.createRegistry(2000);
        reg.rebind("myObject",obj);
        System.out.println("Server running on 2000");
    }
}