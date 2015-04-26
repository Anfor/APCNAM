package banque.service;
import java.rmi.Remote;
import java.rmi.RemoteException;

import banque.model.ICompte;


public interface IServiceAuth extends Remote {

	public boolean getAuth(ICompte compte,float somme) throws RemoteException;
}
