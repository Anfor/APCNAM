
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class AppliJeuVideo extends Application {
	
	static ArrayList<Jeu32X> listeJeu=new ArrayList<Jeu32X>();
	static	ObservableList<String> obsListe;


	public static void main(String[] args) {


		//Premier partie de l'exercice
		//traiteFichier("32X.csv");
		
		Application.launch(args);
		
		//Premier partie de l'exercice
	/*for(Jeu32X jeu : listeJeu){
		
		System.out.println("Jeu : "+jeu.getTitre()+" : "+jeu.getNote());
		
	}*/

	}
	
	
	public static String[] decoupeLigne(String ligne){
		
		String[] champs=ligne.split("\",\"");
		
				 
		return champs;
	}
	
	
	
	public static void traiteFichier(String nomFichier){
		
		BufferedReader reader = null;
		String line;
		int count=0;
		
		try {
			FileReader file = new FileReader(nomFichier);
			
			 reader =new BufferedReader(file);
			 double champ5;
			 double champ6;
			 double noteMoyenne;
			 while ((line = reader.readLine()) != null){
				 count++;
				 Jeu32X jeux=new Jeu32X();
				 
				 if (count==1){
					 
				 }else {
					 
					
					 
					 String[]  champs=decoupeLigne(line);
				
					 
					jeux.setTitre(champs[0]);
					
					jeux.setRegion(champs[1]);
					
					try {
						 champ5 = Double.parseDouble(champs[4]);
					} catch (NumberFormatException e) {
						// TODO: handle exception
						champ5=0;
					}
					
					try {
						 champ6 = Double.parseDouble(champs[5]);
					} catch (NumberFormatException e) {
						// TODO: handle exception
						 champ6=0;
					}
					
					noteMoyenne = champ5+champ6/2;
					jeux.setNote(noteMoyenne);
					
					listeJeu.add(jeux);
				}
				
				 
				 
				 
				
				
				 
			 }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	
	public static void chargeListe(int bol){
		
		if(bol==4)
		
		for(Jeu32X jeu : listeJeu){
			
			obsListe.add(jeu.getTitre());
			
		}
		
		if (bol==1) {
			
					
			for(Jeu32X jeu : listeJeu){
				
				if (jeu.getRegion().equalsIgnoreCase("eu")) {
					obsListe.add(jeu.getTitre());
				}
				
				
				
			}
			
		}
		if (bol==2) {
			
			
			for(Jeu32X jeu : listeJeu){
				
				if (jeu.getRegion().equalsIgnoreCase("jp")) {
					obsListe.add(jeu.getTitre());
				}
				
				
				
			}
			
		}
		if (bol==3) {
			
			
			for(Jeu32X jeu : listeJeu){
				
				if (jeu.getRegion().equalsIgnoreCase("us")) {
					obsListe.add(jeu.getTitre());
				}
				
				
				
			}
			
		}
		
		
		
		
	}


	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		traiteFichier("32X.csv");
		
		final BorderPane root = new BorderPane();
		final Scene scene = new Scene(root);
		final VBox panneauDroite = new VBox();
		
		obsListe=FXCollections.observableArrayList();
		ListView<String> listeJeux = new ListView<String>(obsListe);
		chargeListe(4);

		Button eur=new Button("EUR");
		
		eur.setOnAction(new EventHandler<ActionEvent>() {

	        @Override
	        public void handle(ActionEvent event) {
	        	listeJeux.getItems().clear();
	           chargeListe(1);;
	        }
	    });
		Button jap = new Button("JAP");
		jap.setOnAction(new EventHandler<ActionEvent>() {

	        @Override
	        public void handle(ActionEvent event) {
	        	listeJeux.getItems().clear();
	           chargeListe(2);;
	        }
	    });
		Button us = new Button("US");
		us.setOnAction(new EventHandler<ActionEvent>() {

	        @Override
	        public void handle(ActionEvent event) {
	        	listeJeux.getItems().clear();
	           chargeListe(3);;
	        }
	    });
		panneauDroite.getChildren().addAll(eur,jap,us);
		
		root.setCenter(listeJeux);
		
		root.setRight(panneauDroite);
		
		
		Button boutonQuitter = new Button("Quitter");
		boutonQuitter.setOnAction(e -> stage.close());
		root.setBottom(boutonQuitter);
		
		stage.setTitle("Jeux Sega 32X");
		stage.setScene(scene); 
		stage.show();
	}
	
	
	

	

}
