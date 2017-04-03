/**
 * Created by Sir Kubub on 2017-04-01.
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Sir Kubub on 2017-04-01.
 */
public interface CalcObject2 extends Remote {
    public ResultType calculateTask(InputType inputParam)
            throws RemoteException;
}