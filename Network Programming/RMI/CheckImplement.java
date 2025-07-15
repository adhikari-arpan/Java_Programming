import java.rmi.server.*;

public class CheckImplement extends UnicastRemoteObject implements Check{
    public CheckImplement() throws Exception{
        super();
    }
    @Override
    public String check(int num){
        if((num %2) == 0){
            return "Even";
        }else{
            return "Odd";
        }
    }
}
