package banque.model;


import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICompte extends Serializable {
	
	public IClient getClient();
	float getSolde();
	void setSolde(float solde);
	void setClient(IClient client);
	
	/*void crediter(float montant) throws RemoteException;

	void retirer(float amount) throws RemoteException;

	float getSolde() throws RemoteException;
*/
}
