import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Sir Kubub on 2017-03-28.
 */
public interface CalcObject extends Remote {
    public double calculateTask(double a, double b)
            throws RemoteException;
}
