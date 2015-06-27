package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;



public class VentanaAvisoControlador implements Initializable {
	
	

	@FXML
	private Button buttonYes = new Button();
	
	@FXML
	private Button buttonNot = new Button();
	
	
	@FXML
	private void botonSi(ActionEvent event) throws Exception {
		 
		try {
		
			Stage stage = (Stage) buttonYes.getScene().getWindow();
			CrearBd.main(null);
			stage.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}
	
	
	@FXML
	private void botonNot(ActionEvent event) throws Exception {
		
		Stage stage = (Stage) buttonNot.getScene().getWindow();
		stage.close();
	}
	
	
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
