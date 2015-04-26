
public class Client {
	
	private String nom="";
	
	private Compte cuentas[]= new Compte[100];
	private static int nbc=0;
	private float somme=0;
	private int nbComptes=0;
	
	public Client(String nom){
		
		this.nom=nom;
	}
	
	String getNom(){
		
		return nom;		
	}
	
	Compte ajouterCompte(){
		
		cuentas[nbc]=new Compte();
		nbc++;
		nbComptes=nbc;
		return cuentas[nbc];
	}
	
	float getSolde(){
		
		for(Compte c:cuentas)
			somme=somme+c.getSolde();
		
		return somme;
	}
	
	void afficherSolde(){
		
		System.out.println("solde: "+getSolde());
	}
}
