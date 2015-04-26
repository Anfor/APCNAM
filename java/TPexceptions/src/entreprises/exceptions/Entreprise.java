package entreprises.exceptions;

public class Entreprise {

	int nb_employes;
	int capital;
	String nom;
	String mission;
	

	
	
	public Entreprise() {
		
	}
	
	public String toString(){
		
		return " Empleados "+nb_employes+" capital "+capital+" Nombre "+nom+" Mision "+mission+" id ";
	}
	

	Entreprise(int nb_employes,int capital,String nom,String mission){
		
		this.nb_employes=nb_employes;
		this.capital=capital;
		this.nom=nom;
		this.mission=mission;
	}
	
	public String mission()throws SecretMissionException{
		
		
		
		return this.mission;
	}
	
	public int capital() throws NonProfitException {
		
		return this.capital;
	}

	

	

	
	
}
