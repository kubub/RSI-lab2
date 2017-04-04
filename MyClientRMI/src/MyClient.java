/**
 * Created by Sir Kubub on 2017-03-28.
 */
public class MyClient {
    public static void main(String[] args) {
        //double wynik;
        //CalcObject zObiekt;
        //CalcObject2 zObiekt2;
        //ResultType wynik2;
        //InputType inObj;
        ResultTypeK result1;
        ResultTypeK result2;
        CalcObjectK zObiekt;
        CalcObject2K zObiekt2;
        InputTypeK inObj;

        if (args.length == 0) {
            System.out.println("Musisz podac adres obiektu RMI w postaci: adres_hosta/nazwa_uslugi");
            return;
        }
        String adres = args[0];
        String adres2 = args[1];
// //use this if needed
// if (System.getSecurityManager() == null)
// System.setSecurityManager(new RMISecurityManager());
        try {
            //inObj = new InputType();
            //inObj.x1= 1.0;
            //inObj.x2= 2.0;
            //inObj.operation="add";
            inObj = new InputTypeK();
            inObj.setMin(2);
            inObj.setMax(11);

            //zObiekt = (CalcObject) java.rmi.Naming.lookup(adres);
            //zObiekt2 = (CalcObject2) java.rmi.Naming.lookup(adres2);
            zObiekt = (CalcObjectK) java.rmi.Naming.lookup(adres);
            zObiekt2 = (CalcObject2K) java.rmi.Naming.lookup(adres2);
        } catch (Exception e) {
            System.out.println("Nie mozna pobrac referencji do "+adres);
            e.printStackTrace();
            return;
        }
        System.out.println("Referencja do "+adres+" pobrana.");
        try {
            //wynik = zObiekt.calculateTask(1.1, 2.2);
            //wynik2 = zObiekt2.calculateTask(inObj);
            result1 = zObiekt.calculateTask(inObj);
            result2 = zObiekt2.calculateTask(inObj, result1);

        } catch (Exception e) {
            System.out.println("Blad zdalnego wywolania.");
            e.printStackTrace();
            return;
        }
        System.out.println("Ilosc liczb pierwszych do pierwszej polowy przedzialu: " + result1.getResult()[0]);
        System.out.println("Ostateczna ilosc liczb pierwszych: " + result2.getResult()[0]);
        return;
    }
}