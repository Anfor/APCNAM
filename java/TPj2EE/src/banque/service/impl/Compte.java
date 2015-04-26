package banque.service.impl;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import banque.model.IClient;
import banque.model.ICompte;




public class Compte extends UnicastRemoteObject implements ICompte {
	
	protected Compte() throws RemoteException {
		super();
		
	}
	
	public Compte(float soldeini) throws RemoteException{
		
		this.solde=this.solde+soldeini;
	}

	private float solde;

	public void crediter(float montant) throws RemoteException {
		
		this.solde +=montant;
		
	}

	public void retirer(float amount) throws RemoteException {
		
		this.solde=this.solde-amount;
	}

	
	public float getSolde() {
		
		return this.solde;
	}

	
	public IClient getClient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSolde(float solde) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setClient(IClient client) {
		// TODO Auto-generated method stub
		
	}

}
