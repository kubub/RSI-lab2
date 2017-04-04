import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Sir Kubub on 2017-04-01.
 */
public interface CalcObjectK extends Remote {
    public ResultTypeK calculateTask(InputTypeK inputParam)
            throws RemoteException;
}