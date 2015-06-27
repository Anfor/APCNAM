
public class PokemonCasanier extends PokemonsTerre {
	
	
	private double nbHoursTele;
	
	public double getNbHoursTele() {
		return nbHoursTele;
	}

	public void setNbHoursTele(double nbHoursTele) {
		this.nbHoursTele = nbHoursTele;
	}

	@Override
	public double vitesse() {
		
		return getNbPattes()*getTaille()*3;
	}
	

	@Override
	public String toString() {
		return "Je suis le Pokémon "+getNom()+" mon poids est de "+getPoids()+" Kg, ma vitesse est de "+vitesse()+" km/h j’ai  "+getNbPattes()+
				" pattes, ma taille est de "+getTaille()+"m je regarde la télé  "+getNbHoursTele()+"H  par jour   ";
	
	}

}
