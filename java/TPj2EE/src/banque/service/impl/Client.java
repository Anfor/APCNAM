package banque.service.impl;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import banque.model.IClient;
import banque.model.ICompte;


public class Client implements IClient {
	
	public static void main(String[] args) throws MalformedURLException,RemoteException,NotBoundException{
		
	/*	
		ICompte compt = (ICompte) Naming.lookup("rmi://localhost:1099/compte");
		System.out.println(compt.getSolde());
		compt.crediter(30);
		System.out.println(compt.getSolde());*/
		
		
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumClient() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setNom(String nom) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNumClient(int numclient) {
		// TODO Auto-generated method stub
		
	}

}
