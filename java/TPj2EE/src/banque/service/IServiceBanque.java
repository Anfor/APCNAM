package banque.service;
import java.rmi.RemoteException;

import banque.model.ICompte;


public interface IServiceBanque {

	public  ICompte rechercher(int numCompte) throws RemoteException;
	
	public void crediterCompte (int numCompte,float somme) throws RemoteException;
	
	public void debitercompte(int numCompte,float somme) throws RemoteException;
	
	public void transfert(int numCompte,float somme) throws RemoteException;
	
	
}
