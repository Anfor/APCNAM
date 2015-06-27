import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		CollectionPokemons vv= new CollectionPokemons();
		PokemonSportifs uno=new PokemonSportifs();
		PokemonSportifs dos = new PokemonSportifs();
		PokemonSportifs tres=new PokemonSportifs();
		PokemonSportifs cuatro = new PokemonSportifs();
		
		PokemonWater agua1 = new PokemonMer();
		PokemonsTerre tierra= new PokemonCasanier();
		vv.addPokemon(tierra);
		uno.setNbPattes(4);
		dos.setNbPattes(5);
		tres.setNbPattes(7);
		cuatro.setNbPattes(2);
		uno.setTaille(2);
		dos.setTaille(2.5);
		tres.setTaille(4.1);
		cuatro.setTaille(6);
		
		
		agua1.setNbNagoires(6);
		tierra.setNbPattes(12);
		agua1.setPoids(89);
		tierra.setTaille(1.6);
		
		CollectionPokemons coleccion = new CollectionPokemons();
		ArrayList<PokemonCharacteristics> lista = new ArrayList<PokemonCharacteristics>();
		lista.add(tierra);
		lista.add(uno);
		lista.add(dos);
		lista.add(tres);
		lista.add(cuatro);
		lista.add(agua1);
		
		coleccion.setPokemonColection(lista);
		
		System.out.println("media normal  "+coleccion.moyenneVitesse(lista));
		System.out.println("media deportistas "+coleccion.vitesseMoyenneSportifs(lista));
		
	}

}
