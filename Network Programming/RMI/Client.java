import java.rmi.registry.*;

public class Client {
    public static void main(String[] args) throws Exception{
        Registry reg = LocateRegistry.getRegistry("localhost", 2000);
        Check obj = (Check) reg.lookup("myObject");
        System.out.println("Number is" + obj.check(5));
    }
}
