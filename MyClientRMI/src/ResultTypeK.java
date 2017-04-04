import java.io.Serializable;

/**
 * Created by Sir Kubub on 2017-04-01.
 */
public class ResultTypeK implements Serializable {
    private static final long serialVersionUID = 102L;
    private int[] result;

    public int[] getResult(){return result;}

    public void setResult(int primeCount, int value){
        result = new int[2];
        result[0] = primeCount;
        result[1] = value;
    }
}