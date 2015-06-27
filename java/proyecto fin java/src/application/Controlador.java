package application;





import java.net.URL;
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
	
	
	
	
	private Principal principal;
	
	
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
        
         
         stage.setTitle("Ventana Aviso");
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
		
		GuardarBase.apellidobd=null;
		GuardarBase.nombrebd=null;
		GuardarBase.telefonobd=null;
		GuardarBase.emailbd=null;
		GuardarBase.direccionbd=null;
		
		
	
		nombre.setText(null);
		apellido.setText(null);
		telefono.setText(null);
		email.setText(null);
		direccion.setText(null);
		
	
	}
	
	@FXML
	public void botonModifier(ActionEvent event){
		
		
	}
	
	
	@FXML
	public void botonRechercher(ActionEvent event) throws Exception{
		MostrarBd.main(null);
		
		
	}
	
	public String getAreaTexto() {
		return areaTexto.getText();
	}





	@FXML
	public void botonSupprimer(ActionEvent event){
		
		
	}
	
	public void setTextArea(String texto){
		
		areaTexto.setText(texto);
		
	}
	
	
	 public void setMainApp(Principal mainApp) {
	        this.principal = mainApp;
	 }
	
	
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		areaTexto.setEditable(false);
		areaTexto.setText(null);
		nombre.setText(null);
		apellido.setText(null);
		telefono.setText(null);
		email.setText(null);
		direccion.setText(null);
	}

}
