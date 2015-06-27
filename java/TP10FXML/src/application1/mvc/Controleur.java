package application1.mvc;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.stage.Stage;


public class Controleur implements Initializable {
	
	private Modele modelo;
	private Stage stg;
	
	@FXML
	private ListView<String> listView;
	
	
	public void gererClic(ActionEvent event){
		
		//System.out.println("Vous avez clické");
		
		stg.close();
	}

	public void initDonnes(Modele m,Stage s){
		
		this.stg=s;
		this.modelo=m;
		
		modelo.chargerListeRecette();
		
		listView.setItems(modelo.getListRecette());
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}



	
	

}
