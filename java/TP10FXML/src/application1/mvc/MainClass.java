package application1.mvc;
	


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class MainClass extends Application {
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			
			final FXMLLoader loader = new FXMLLoader(getClass().getResource("vue.fxml"));
			final Parent root =(Parent)loader.load();
			final Controleur controleur = loader.getController();
			Modele modele = new Modele();
			
			controleur.initDonnes(modele, primaryStage);
			
			root.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
			primaryStage.setScene(new Scene(root));
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
