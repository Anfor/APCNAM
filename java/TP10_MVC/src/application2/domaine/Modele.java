package application2.domaine;
import java.util.List;

import application2.db.ISource;
import application2.ui.VueUtils;


public class Modele {

	final List<String> recetteListe = (List<String>) VueUtils.getObservableList();
	ISource dataSource= null;

	Modele() {
		dataSource.init();
	}

	Modele(ISource s) {
		dataSource = s;
		dataSource.init();
	}

	public void chargeListeRecette() {
		System.out.println("*** Test avec une ArrayList ***");
	    List<String> listeIngredients = dataSource.getStringList("Ktipiti");
		recetteListe.addAll(listeIngredients.subList(0, listeIngredients.size() - 1));
	}
	
	public void majRecette() {
		recetteListe.add("degustez !");
	}
	
    public List<String> getListeRecette() {
        return recetteListe;
    }

	public void setDataSource(ISource dataSource) {
		this.dataSource = dataSource;
	}
}
