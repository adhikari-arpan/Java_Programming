
import java.rmi.*;

public interface Check extends Remote{
    public String check(int num) throws RemoteException;
}
