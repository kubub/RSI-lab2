/**
 * Created by Sir Kubub on 2017-04-04.
 */
import java.io.Serializable;
public class InputTypeK implements Serializable {
    private static final long serialVersionUID = 101L;
    private int min;
    private int max;

    public int getMin() {
        return min;
    }
    public int getMax() {
        return max;
    }

    public void setMin(int value){
        if(value > 1)
            min = value;
        else
            System.out.println("Podano nieprawidlowe min!");
    }

    public void setMax(int value){
        if(value > min)
            max = value;
        else
            System.out.println("Podano nieprawidlowe max!");
    }
}
