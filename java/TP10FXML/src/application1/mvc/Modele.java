package application1.mvc;



import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Modele {

	
	final ObservableList<String> recetteListe = FXCollections.observableArrayList();
	
	

	public void chargerListeRecette(){
		
		
		recetteListe.add("1- Pour reussir une mayonnaise il faut");
		recetteListe.add("2- mettre les ingredients a temperature ambiante");
		recetteListe.add("3- mettre un jeune d'oeuf dans un bol");
		recetteListe.add("4- ajouter un pince de sel, de poivre");
		recetteListe.add("5- verser un peu d'huile");
		recetteListe.add("6- battre avec une fourchette");
		recetteListe.add("7- verser un peu d'huile");
		recetteListe.add("8- battre avec une fourchette");
		

	}
	
	public ObservableList<String> getListRecette(){
		
		return recetteListe;
		
	}
	
}
