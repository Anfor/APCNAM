
import java.util.ArrayList;




public class CollectionPokemons {
	
	private ArrayList<PokemonCharacteristics> pokemonCollection= new ArrayList<PokemonCharacteristics>();



	public ArrayList<PokemonCharacteristics> getPokemonColection() {
		return pokemonCollection;
	}

	public void setPokemonColection(ArrayList<PokemonCharacteristics> pokemonColection) {
		this.pokemonCollection = pokemonColection;
	}
	
	public void addPokemon(PokemonCharacteristics pokemon){
		
		pokemonCollection.add(pokemon);
		
	}
	
	public double moyenneVitesse(ArrayList<PokemonCharacteristics> pokemonCollectionMoyenne){
		
		double moyenne = 0;
		
		for (PokemonCharacteristics pokemon : pokemonCollectionMoyenne) {
			
			System.out.println("velocidad "+pokemon.vitesse());
			moyenne=moyenne +pokemon.vitesse();
			
					
		}
			
		return moyenne/pokemonCollectionMoyenne.size();
				
	}
	
	public double vitesseMoyenneSportifs(ArrayList<PokemonCharacteristics> pokemonColectionMoyenne){
		
		
		double moyenne = 0;
		int count=0;
		for (PokemonCharacteristics pokemon : pokemonColectionMoyenne) {
			
			if (pokemon instanceof PokemonSportifs) {
				moyenne=moyenne+ pokemon.vitesse();
				count++;
			System.out.println("contador  "+count);	
			System.out.println("media dentro "+moyenne);
			}
			
			
			
		}
			
		return moyenne/count;
	}

}
