import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Sir Kubub on 2017-04-01.
 */
public class CalcObjectKImpl extends UnicastRemoteObject
        implements CalcObjectK
{
    public CalcObjectKImpl() throws RemoteException {
        super();
    }
    public ResultTypeK calculateTask(InputTypeK inParam)
            throws RemoteException {
        int min, max;
        ResultTypeK wynik = new ResultTypeK();
        min = inParam.getMin();
        max = inParam.getMax();
        int limit = max/2;
        int primeCount = 0;

        for(int curValueToCheck = min; curValueToCheck < limit; curValueToCheck++){
            for(int i = 2; i < curValueToCheck; i++){
                if((curValueToCheck % i) == 0)
                    break;
                else if(i == curValueToCheck - 1)
                    primeCount++;
            }
        }

        wynik.setResult(primeCount, limit);
        return wynik;
    }
}