package application1.mvc;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;


public class Controleur implements Initializable  {

	@FXML private ListView<String> listView;
	Stage stage;
	private Modele modele;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}

	
	public void gererClic(ActionEvent event) {
		Button bouton = (Button) event.getSource();
		if (bouton.getText().equalsIgnoreCase("quitter")) {
			stage.close();
		} else {
			Alert dialog = new Alert(AlertType.INFORMATION);
			dialog.setContentText(bouton.getText());
			dialog.show();
		}
		
	}
	
	
	public void gererTouche(KeyEvent event) {
		if (((KeyEvent) event).getCode() == KeyCode.Q) {
			stage.close();
		} else if (((KeyEvent) event).getCode() == KeyCode.U) {
			modele.majRecette();
		}
	}
	
	public void initDonnees(Modele m, Stage s) {
		stage = s;
		modele = m;
        modele.chargeListeRecette();
        listView.setItems(modele.getListeRecette());
        
	}

}
