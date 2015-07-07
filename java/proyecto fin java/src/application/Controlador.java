package application;





import java.net.URL;


import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;








public class Controlador implements Initializable {
	
	
	MostrarBd mb = new MostrarBd();
	
	private Principal principal;
	private int contador=0;
	int index=0;
	
	
	


	//text fields
	@FXML
	private  TextField nombre = new TextField();
	
	@FXML
	private  TextField apellido = new TextField();
	@FXML
	private  TextField telefono = new TextField();
	@FXML
	private  TextField email = new TextField();
	@FXML
	private  TextField direccion = new TextField();
	
	//buttons
	@FXML
	private Button ajouterb = new Button();
	
	@FXML
	private Button modifierb = new Button();

	@FXML
	private Button rechercherb = new Button();
	
	@FXML
	private Button supprimerb = new Button();
	
	@FXML
	private Button retro = new Button();
	
	@FXML
	private Button avant = new Button();
	
	@FXML
	private Button eliminar = new Button();
	
	
	//area 
	
	@FXML
	private  TextArea areaTexto = new TextArea();
	

	
	
	@FXML
	private MenuItem nuevaB= new MenuItem();
	
	@FXML
	final MenuBar barra = new MenuBar();
	
	
	 @FXML  
	   private void barraAccion(ActionEvent event) throws Exception  
	   {  
		 
		 AnchorPane page2 = (AnchorPane)FXMLLoader.load(Principal.class.getResource("VentanaAviso.fxml"));
	      
         Stage stage = new Stage();
        
         
         stage.setTitle("Nouvelle Base des donées");
         stage.setScene(new Scene(page2));  
         stage.setResizable(false);
         stage.show();
		
		
		
	   }  
	 
	 

	
/**
 * 
 * 
 * 
 * 
 * @param event
 * @throws Exception 
 */
	@FXML
	public void botonAjouter(ActionEvent event) throws Exception{
		
			
		GuardarBase.apellidobd=apellido.getText();
		GuardarBase.nombrebd=nombre.getText();
		GuardarBase.telefonobd=telefono.getText();
		GuardarBase.emailbd=email.getText();
		GuardarBase.direccionbd=direccion.getText();
		GuardarBase.main(null);
		
		
		areaTexto.setText("Données stockées\n"+areaTexto.getText());
		
		GuardarBase.apellidobd=null;
		GuardarBase.nombrebd=null;
		GuardarBase.telefonobd=null;
		GuardarBase.emailbd=null;
		GuardarBase.direccionbd=null;
		
		
		limpiar(event);
		
		
	}
	
	
	@FXML
	public void limpiar (ActionEvent event) throws Exception{
		
		

		nombre.setText(null);
		apellido.setText(null);
		telefono.setText(null);
		email.setText(null);
		direccion.setText(null);
		MostrarBd.listapersona.clear();
		
	}
	
	@FXML
	public void botonModifier(ActionEvent event){
		

		
		ModificarBd.apellidoCambiado=apellido.getText();
		ModificarBd.nombreCambiado=nombre.getText();
		ModificarBd.telefonoCambiado=telefono.getText();
		ModificarBd.emailCambiado=email.getText();
		ModificarBd.direccionCambiado=direccion.getText();
		
		try {
			ModificarBd.main(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		nombre.setText(null);
		apellido.setText(null);
		telefono.setText(null);
		email.setText(null);
		direccion.setText(null);
		
		areaTexto.setText("Contact modifié\n"+areaTexto.getText());
	}
	
	
	@FXML
	public void botonRechercher(ActionEvent event) {
		

		
		if (mb.getApellidoBuscado()!=null) {
			
			mb.setApellidoBuscado(null);
			
		}
		
		index=0;
		
		mb.setApellidoBuscado(apellido.getText());
		try {
			MostrarBd.main(null);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		if (MostrarBd.listapersona.isEmpty()) {
			nombre.setText(null);
			apellido.setText(null);
			telefono.setText(null);
			email.setText(null);
			direccion.setText(null);
		}
		
		
		apellido.setText(MostrarBd.listapersona.get(index).resultadoApellido);
		nombre.setText(MostrarBd.listapersona.get(index).resultadoNombre);
		telefono.setText(MostrarBd.listapersona.get(index).resultadoTelefono);
		email.setText(MostrarBd.listapersona.get(index).resultadoEmail);
		direccion.setText(MostrarBd.listapersona.get(index).resultadoDireccion);
		
		
		areaTexto.setText(MostrarBd.listapersona.size()+" résultats\n"+areaTexto.getText());

		
	}
	
	@FXML
	public void botonAvant(ActionEvent event){
		

		
		try {
			index++;
			
			apellido.setText(MostrarBd.listapersona.get(index).resultadoApellido);
			nombre.setText(MostrarBd.listapersona.get(index).resultadoNombre);
			telefono.setText(MostrarBd.listapersona.get(index).resultadoTelefono);
			email.setText(MostrarBd.listapersona.get(index).resultadoEmail);
			direccion.setText(MostrarBd.listapersona.get(index).resultadoDireccion);
			
		} catch (Exception e) {
			e.printStackTrace();
		index=MostrarBd.listapersona.size()-1;
		}
		
		
		
		
		
	}
	
	@FXML
	public void botonRetro(ActionEvent event){
		
	
		try {
			
			index--;
			apellido.setText(MostrarBd.listapersona.get(index).resultadoApellido);
			nombre.setText(MostrarBd.listapersona.get(index).resultadoNombre);
			telefono.setText(MostrarBd.listapersona.get(index).resultadoTelefono);
			email.setText(MostrarBd.listapersona.get(index).resultadoEmail);
			direccion.setText(MostrarBd.listapersona.get(index).resultadoDireccion);
			
		} catch (Exception e) {

			e.printStackTrace();
			index=0;
		}
		
		
		
	}
	
	






	@FXML
	public void botonSupprimer(ActionEvent event){
		
		EliminarContacto.apellidoEliminado=apellido.getText();
		
		
		try {
			EliminarContacto.main(null);
			limpiar(event);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		areaTexto.setText("Contact effacé\n"+areaTexto.getText());
		
	}
	
	public String getAreaTexto() {
		return areaTexto.getText();
	}
	
	
	public void setTextArea(String texto){
		
		areaTexto.setText(texto+"\n");
		
	}
		
	
	 public void setMainApp(Principal mainApp) {
	        this.principal = mainApp;
	 }

	
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		areaTexto.setEditable(false);
		areaTexto.setText("");
		nombre.setText(null);
		apellido.setText(null);
		telefono.setText(null);
		email.setText(null);
		direccion.setText(null);
	}

}
