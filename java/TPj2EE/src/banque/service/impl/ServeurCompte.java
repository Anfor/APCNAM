package banque.service.impl;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


public class ServeurCompte {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
	
		try {
			LocateRegistry.createRegistry(1099);
			Naming.rebind("rmi://localhost:1099/compte", new Compte(10));
			System.out.println("Compte en ligne");
		}
					 
		catch (RemoteException rem) {
			rem.printStackTrace();
		}
		catch (MalformedURLException e) {
			e.printStackTrace();
		}
			

	}

}
