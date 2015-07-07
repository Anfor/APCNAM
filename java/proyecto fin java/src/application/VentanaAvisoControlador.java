package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;



public class VentanaAvisoControlador implements Initializable {
	
	private Principal principal;

	@FXML
	private Button buttonYes = new Button();
	
	@FXML
	private Button buttonNot = new Button();
	
	
	@FXML
	private void botonSi(ActionEvent event) throws Exception {
		 
		try {
		
			Stage stage = (Stage) buttonYes.getScene().getWindow();
			
			CrearBd.main(null);
			principal.controller.limpiar(event);
			principal.controller.setTextArea("Nouvelle agenda créée"+principal.controller.getAreaTexto());
			
			stage.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}
	
	
	@FXML
	private void botonNot(ActionEvent event) throws Exception {
		
		Stage stage = (Stage) buttonNot.getScene().getWindow();
		principal.controller.setTextArea("Action annulée"+principal.controller.getAreaTexto());
		stage.close();
	}
	
	
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
