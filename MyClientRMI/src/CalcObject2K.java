/**
 * Created by Sir Kubub on 2017-04-04.
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Sir Kubub on 2017-04-01.
 */
public interface CalcObject2K extends Remote {
    public ResultTypeK calculateTask(InputTypeK inputParam, ResultTypeK resultTypeK)
            throws RemoteException;
}