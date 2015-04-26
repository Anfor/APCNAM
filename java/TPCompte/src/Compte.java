
public class Compte {
	
	private static int counter=0;
	private float solde=0;
	private int numero=0;
	
	
	public Compte(){
		
		Compte.counter++;
	
		this.numero++;
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
		
		
	}
}
