package banque.model;

import java.io.Serializable;

public interface IClient extends Serializable {

	String getNom();
	int getNumClient();
	void setNom(String nom);
	void setNumClient(int numclient);
	
}
