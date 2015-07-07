
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppliMeteo extends Application {
	static List<DonneesMeteo> resultatsListe = new ArrayList<DonneesMeteo>();
	static LinkedHashMap<String, Integer> maxTemp = new LinkedHashMap<String, Integer>();
	static LinkedHashMap<String, Integer> maxPression = new LinkedHashMap<String, Integer>();



	public static List<DonneesMeteo> traiteFichier(String nom) {
		List<DonneesMeteo> liste = new ArrayList<DonneesMeteo>();
		try {
			FileReader fr = new FileReader("src/"+nom);
			BufferedReader br = new BufferedReader(fr);
			String ligne;

			// Le decorateur BufferedReader procure la methode readLine
			// qui lit une ligne de fichier sous forme de String et renvoie
			// null si la fin de fichier est atteinte
			while ((ligne = br.readLine()) != null) {
				// on recupere le resultat du decoupage de la ligne dans un String[]
				String[] champs = decoupeLigne(ligne);

				// mais le decoupage peut renvoyer un tableau vide si la ligne n'a pas le bon
				// format, donc on teste la taille du tableau avant d'y acceder
				if (champs.length > 0) {
					// on cree un objet DonneesMeteo que l'on va ajouter a une collection
					DonneesMeteo donnees = new DonneesMeteo();
					donnees.setDateHeure(champs[0]);
					donnees.setAerodrome(champs[2]);
					donnees.setPression(Integer.parseInt(champs[9]));
					donnees.setTemperature(Integer.parseInt(champs[8]));
					// ajout dans l'arrayList d'objets DonneesMeteo
					liste.add(donnees);
				}

			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return liste;
	}

	public static String[] decoupeLigne(String ligne) {
		String[] champs = ligne.replace('=', ' ').split(" ");
		if (champs.length != 10 || !champs[1].equals("METAR")
				|| !champs[9].startsWith("Q"))
			return new String[] {};
		champs[8] = champs[8].substring(0, 2);
		champs[9] = champs[9].substring(1);
		champs[0] = champs[0].substring(0, 8);
		return champs;
	}

	
	@Override
	public void start(Stage stage) throws Exception {
		// On appelle la methode de traitement du fichier, on recupere une collection ArrayList
		resultatsListe = traiteFichier("meteo.txt");

		// on boulce sur la collection que l'on a constituee
		for (DonneesMeteo donnees : resultatsListe) {
			// premiere etape : on verifie d'abord si on arrive a lire qque chose
			// par un bete println
			System.out.println("temperature au " + donnees.getDateHeure() + " : " + donnees.getTemperature());
			
			// La linkedHashMap maxTemp va associer dateHeure (cle) et temperature max
			// Le fait qu'elle soit "linked" va trier automatiquement les cles
			// Si la cle est deja dans la collection
			if (maxTemp.containsKey(donnees.getDateHeure())) {
				// si la temperature lue est > a la temperature max actuelle (celle de la collection)
				if (donnees.getTemperature() > maxTemp.get(donnees.getDateHeure()).intValue()) {
					// Alors on met la nouvelle temperature max dans la collection
					// en remplacement de l'ancienne valeur
					maxTemp.put(donnees.getDateHeure(), donnees.getTemperature());
				}
			} else {
				// Pas de temperature a cette date dans la collection, on ajoute la nouvelle cle
				maxTemp.put(donnees.getDateHeure(), donnees.getTemperature());
			}
			
			// Exactement meme principe pour la pression
			if (maxPression.containsKey(donnees.getDateHeure())) {
				if (donnees.getPression() > maxPression.get(donnees.getDateHeure()).intValue()) {
					maxPression.put(donnees.getDateHeure(), donnees.getPression());
				}
			} else {
				maxPression.put(donnees.getDateHeure(), donnees.getPression());
			}
		}
		

		final BorderPane root = new BorderPane();
		final Scene scene = new Scene(root);
		final VBox panneauCentral = new VBox();
		final VBox panneauDroite = new VBox();
		
		// Je prepare deux labels pour la temperature et la pression
		final Label labelTemp = new Label("0");
		final Label labelPression = new Label("0");
		
		// L'objet combobox est simple a initialiser
		final ComboBox<String> combo = new ComboBox<String>();
		// tout comme pour la liste d'ingredients du dernier TP
		// j'associe les valeurs de la combobox a ma collection convertie en ObservableList
		combo.setItems(FXCollections.observableArrayList(maxTemp.keySet()));
		
		// combobox propose une methode setOnAction, chouette
		combo.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				// Quand je clique sur une valeur de la combo Box, 
				// je change les textes des labels pour afficher temperature 
				// et pression maximum de la date selectionnee
				labelTemp.setText(String.valueOf(maxTemp.get(combo.getSelectionModel().getSelectedItem()))+ "�C");
				labelPression.setText(String.valueOf(maxPression.get(combo.getSelectionModel().getSelectedItem()))+" hPa");
			}
			
		});
		
		// La methode select() permet juste de selectionner une date par defaut
		// ce n'est pas indispensable
		combo.getSelectionModel().select(0);
		// Valeurs initiales de mes labels
		labelTemp.setText(String.valueOf(maxTemp.get(combo.getSelectionModel().getSelectedItem()))+ "�C");
		labelPression.setText(String.valueOf(maxPression.get(combo.getSelectionModel().getSelectedItem()))+" hPa");
		
		panneauDroite.getChildren().add(combo);
		panneauCentral.getChildren().add(labelTemp);
		panneauCentral.getChildren().add(labelPression);
		// par coquetterie, j'ajoute un label pour signaler le code de l'aeroport
		panneauCentral.getChildren().add(new Label("A�rodrome de "+ resultatsListe.get(0).getAerodrome()));
		
		
		
		root.setCenter(panneauCentral);
		root.setRight(panneauDroite);
		
		// ajouter un bouton "Quitter" est simple comme une lambda
		Button boutonQuitter = new Button("Quitter");
		boutonQuitter.setOnAction(e -> stage.close());
		root.setBottom(boutonQuitter);
		
		// On pourrait bien s�r mettre en forme l'application (police, couleur, effets)
		// Mais l'essentiel est fait.
		
		
		stage.setTitle("Application Meteo");
		stage.setScene(scene); 
		stage.show();
		
	}

	public static void main(String[] args) {
		// GOTO start() ^
		Application.launch(args);
	}
}
