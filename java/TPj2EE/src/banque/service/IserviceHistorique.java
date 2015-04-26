package banque.service;
import java.rmi.Remote;


public interface IserviceHistorique extends Remote{
	
	public int getNombreOperations(int numCompte);
	
	public float getTotalRetrait(int numCompte);
	
	

}
