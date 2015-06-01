
public class Compte {
	
	private static int contador=0;
	private float solde=0;
	private  int numero=0;
	
	
	public Compte(){
		System.out.println("contador vale "+this.contador);
		this.numero=Compte.contador;
		Compte.contador++;

	}
	
	
	public int getContador() {
		return Compte.contador;
	}

	void depot(float valeur){
		
		this.solde=this.solde+valeur;
	}
	
	
	void retrait(float valeur){
	
	this.solde=this.solde-valeur;
}

	float getSolde(){
		return solde;
	}
	
	void afficherSolde(){
		
		System.out.println("Votre solde est: "+this.solde);
	}
	
	void virer (float valeur, Compte destinataire){
		
		this.solde=this.solde - valeur;
		
		destinataire.depot(valeur);
	}


	public int  getNumero() {
		return numero;
	}


	

}
