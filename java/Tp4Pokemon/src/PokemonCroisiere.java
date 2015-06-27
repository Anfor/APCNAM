
public class PokemonCroisiere extends PokemonWater {

	@Override
	public double vitesse() {
		return (getPoids()/25*getNbNagoires())/2;
	}

	@Override
	public String toString() {
		 return "Je suis le Pokémon "+getNom()+" mon poids est de "+getPoids()+" Kg, ma vitesse est de "+vitesse()+
					" km/h j’ai  "+getNbNagoires()+" nageoires";
	}

}
