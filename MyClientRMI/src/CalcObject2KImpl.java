import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Sir Kubub on 2017-04-01.
 */
public class CalcObject2KImpl extends UnicastRemoteObject
        implements CalcObject2K
{
    public CalcObject2KImpl() throws RemoteException {
        super();
    }
    public ResultTypeK calculateTask(InputTypeK inParam, ResultTypeK resultTypeK)
            throws RemoteException {
        int min, max;
        ResultTypeK wynik = new ResultTypeK();

        max = inParam.getMax();
        int primeCount = resultTypeK.getResult()[0];
        int startNumber = resultTypeK.getResult()[1];

        for(int curValueToCheck = startNumber; curValueToCheck < max; curValueToCheck++){
            for(int i = 2; i < curValueToCheck; i++){
                if((curValueToCheck % i) == 0)
                    break;
                else if(i == curValueToCheck - 1)
                    primeCount++;
            }
        }

        wynik.setResult(primeCount, max);
        return wynik;
    }
}