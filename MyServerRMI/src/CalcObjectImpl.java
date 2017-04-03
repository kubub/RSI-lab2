/**
 * Created by Sir Kubub on 2017-03-28.
 */
import java.rmi.RemoteException;
        import java.rmi.server.UnicastRemoteObject;
public class CalcObjectImpl extends UnicastRemoteObject
        implements CalcObject
{
    private static final long serialVersionUID = 101L;
    public CalcObjectImpl() throws RemoteException {
        super();
    }
    public double calculateTask(double a, double b)
            throws RemoteException {
        double wynik = a + b;
        return wynik;
    }
}