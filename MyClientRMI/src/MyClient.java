/**
 * Created by Sir Kubub on 2017-03-28.
 */
public class MyClient {
    public static void main(String[] args) {
        double wynik;
        CalcObject zObiekt;
        CalcObject2 zObiekt2;
        ResultType wynik2;
        InputType inObj;

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
            inObj = new InputType();
            inObj.x1= 1.0;
            inObj.x2= 2.0;
            inObj.operation="add";

            zObiekt = (CalcObject) java.rmi.Naming.lookup(adres);
            zObiekt2 = (CalcObject2) java.rmi.Naming.lookup(adres2);
        } catch (Exception e) {
            System.out.println("Nie mozna pobrac referencji do "+adres);
            e.printStackTrace();
            return;
        }
        System.out.println("Referencja do "+adres+" pobrana.");
        try {
            wynik = zObiekt.calculateTask(1.1, 2.2);
            wynik2 = zObiekt2.calculateTask(inObj);
        } catch (Exception e) {
            System.out.println("Blad zdalnego wywolania.");
            e.printStackTrace();
            return;
        }
        System.out.println("Wynik = "+wynik);
        System.out.println("Wynik2"+wynik2.result);
        System.out.println("Wynik2"+wynik2.result_description);
        return;
    }
}