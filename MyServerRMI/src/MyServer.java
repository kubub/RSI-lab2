import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by Sir Kubub on 2017-03-28.
 */
public class MyServer
{
    public static void main(String[] args)
    {
        if (args.length == 0) {
            System.out.println("Musisz podac adres obiektu RMI w postaci: adres_hosta/nazwa_uslugi");
            return;
        }
        if (System.getSecurityManager() == null)
            System.setSecurityManager(new java.rmi.RMISecurityManager()
            );

        try {
            Registry reg = LocateRegistry.createRegistry(12345);
        } catch (RemoteException e1) {
            e1.printStackTrace();
        }

        try {
            //CalcObjectImpl implObiektu = new CalcObjectImpl();
            //CalcObject2 implObiektu2 = new CalcObjImpl2();
            //java.rmi.Naming.rebind(args[0], implObiektu);
            //java.rmi.Naming.rebind(args[1], implObiektu2);

            CalcObjectK implObiektu = new CalcObjectKImpl();
            java.rmi.Naming.rebind(args[0], implObiektu);

            System.out.println("Server is registered now :-)");
            System.out.println("Press Crl+C to stop...");
        } catch (Exception e) {
            System.out.println("SERVER CAN'T BE REGISTERED!");
            e.printStackTrace();
            return;
        }
    }
}
