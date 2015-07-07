package application1.mvc;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import com.aigogeek.javred.SimpleRedis;


public class Modele {

	final ObservableList<String> recetteListe = FXCollections.observableArrayList();
    final SimpleRedis sRedis = new SimpleRedis();

	Modele() {
	    sRedis.initConnection("www.aigogeek.com", 9003);
	}
	
	void chargeListeRecette() {
		System.out.println("*** Test avec une ArrayList ***");
	    ArrayList<String> listeIngredients = sRedis.lrange("Ktipiti");
		recetteListe.addAll(listeIngredients.subList(0, listeIngredients.size() - 1));
	}
	
	void majRecette() {
		recetteListe.add("degustez !");
	}
	
    public ObservableList<String> getListeRecette() {
        return recetteListe;
    }
}
