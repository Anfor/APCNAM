





import java.util.ArrayList;
import java.util.Iterator;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


public class TestFX extends Application {

	@Override
	public void start(final Stage Stage ) throws Exception {
		
		final VBox root = new VBox();
		final Scene scene = new Scene(root);
		final Separator sep = new Separator();
		final Separator sep2 = new Separator();
ArrayList recetteListe =new ArrayList();
		
		recetteListe.add("1- Pour reussir une mayonnaise il faut");
		recetteListe.add("2- mettre les ingredients a temperature ambiante");
		recetteListe.add("3- mettre un jeune d'oeuf dans un bol");
		recetteListe.add("4- ajouter un pince de sel, de poivre");
		recetteListe.add("5- verser un peu d'huile");
		recetteListe.add("6- battre avec une fourchette");
		recetteListe.add("7- verser un peu d'huile");
		recetteListe.add("8- battre avec une fourchette");
		
		
		Iterator itr= recetteListe.iterator();
	
		
		
		
		
		Stage.setScene(scene);
		Stage.setHeight(400);
		Stage.setWidth(500);
		Stage.setTitle("Premiers pas en JavaFX");
		Label label1 = new Label("Je suis une etiquette");
		
		label1.setFont(new Font(29.9));
		label1.setTextFill(Color.RED);
		label1.setEffect(new GaussianBlur());
		root.getChildren().add(label1);
		sep.setValignment(VPos.CENTER);
		
		sep.setOrientation(Orientation.HORIZONTAL);
		root.getChildren().add(sep);
		Text etiqueta = new Text("Bonjour\n Je suis un text");
		
		
		
		etiqueta.setTextAlignment(TextAlignment.JUSTIFY);
		etiqueta.setFont(new Font(35.0));
		root.getChildren().add(etiqueta);
		
		sep2.setValignment(VPos.CENTER);
		
		sep2.setOrientation(Orientation.HORIZONTAL);
		root.getChildren().add(sep2);
		
		Label label3 = new Label("Les etapes");
		label3.setFont(new Font(40));
		label3.setTextFill(Color.CHOCOLATE);

		root.getChildren().add(label3);
		
		
		while (itr.hasNext()) {
			String element = (String)itr.next();
			Label label2 = new Label(element);
			root.getChildren().add(label2);
			
			
		}
		
		
		Stage.show();
	}
	
	public static void main (String []args){
		
		Application.launch(args);
		
	}

}
