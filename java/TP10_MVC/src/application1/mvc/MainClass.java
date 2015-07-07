package application1.mvc;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainClass extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		try {
			// creation du Modele
			final Modele modele = new Modele();

			// creation de la Vue
			final FXMLLoader loader = new FXMLLoader(getClass().getResource("vue.fxml"));
			final Parent root = (Parent) loader.load();
			root.getStylesheets().add("/application1/mvc/style.css");

			// recuperation du controleur et transmission du modele et de la Vue
			final Controleur controleur = loader.getController();
		    controleur.initDonnees(modele, stage);
		    
			stage.setScene(new Scene(root));
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
