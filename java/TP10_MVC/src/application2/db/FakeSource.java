package application2.db;

import java.util.Arrays;
import java.util.List;

public class FakeSource implements ISource {
	final private String recette[] = {"Pour reussir une mayonnaise il faut","mettre les ingredients a temperature ambiante", "mettre un jaune d'oeuf dans un bol", "ajouter une cuillere de moutarde, sel, poivre","verser un peu d'huile", "battre avec une fourchette"};

	@Override
	public void init() {
		System.out.println("Fake source initializing");
	}

	@Override
	public List<String> getStringList(String name) {
		return Arrays.asList(recette);
	}

}
