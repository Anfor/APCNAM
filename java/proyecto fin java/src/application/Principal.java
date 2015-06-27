package application;
	




import java.io.IOException;

import javax.sound.midi.ControllerEventListener;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;



public class Principal extends Application {
	
	private Stage primaryStage;
	AnchorPane page = null;
	static String texto;
	static Controlador controller=new Controlador();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		this.primaryStage=primaryStage;
		
		 FXMLLoader fxmlLoader = new FXMLLoader();
		 page= fxmlLoader.load(getClass().getResource("Interfaz.fxml").openStream());
		controller = (Controlador) fxmlLoader.getController();
		 
		 mostrarVentanaPrincipal();
		
		
		
		controller.setTextArea(texto);
	}
	
	
	public void darControlador(){
		
		
		FXMLLoader fxmlLoader = new FXMLLoader();
		 try {
			page= fxmlLoader.load(getClass().getResource("Interfaz.fxml").openStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		controller = (Controlador) fxmlLoader.getController();
		controller.setMainApp(this);
		
	}
	
	public void mostrarVentanaPrincipal(){
		
try {
			
	     //  page = (AnchorPane)FXMLLoader.load(Principal.class.getResource("Interfaz.fxml"));
			
			Scene scene = new Scene(page);
			primaryStage.setScene(scene);
			 primaryStage.setTitle("Contacts");
			 primaryStage.setWidth(600);
			 primaryStage.setHeight(450);
			 primaryStage.setResizable(false);
			 
			
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		
      
		
		launch(args);
	}
	
	
	
}
