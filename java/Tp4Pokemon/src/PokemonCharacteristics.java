
public abstract class PokemonCharacteristics {
	
	private String nom;
	private double poids;
	private double vitesse;
	
	
	
	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public double getPoids() {
		return poids;
	}



	public void setPoids(double poids) {
		this.poids = poids;
	}



	public abstract double  vitesse();
	
	
	
	@Override
	public abstract String toString();



	public double getVitesse() {
		return vitesse;
	}



	public void setVitesse(double vitesse) {
		this.vitesse = vitesse;
	}

}
