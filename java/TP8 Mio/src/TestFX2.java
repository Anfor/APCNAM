

import java.util.ArrayList;
import java.util.Iterator;

import javafx.application.Application;
import javafx.collections.ListChangeListener;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TestFX2 extends Application {
	@Override
	public void start(final Stage Stage ) throws Exception {
		
		MyEventHandler myHandler = new MyEventHandler();
		final VBox fCentre = new VBox();
		final BorderPane root = new BorderPane();
		final Scene scene = new Scene(root);
		final Separator sep = new Separator();
		final Separator sep2 = new Separator();
		Stage.setScene(scene);
		
		Stage.setTitle("Premiers pas en JavaFX");
		root.getStylesheets().add("style.css");
		
ArrayList<String> recetteListe =new ArrayList<String>();
		
		recetteListe.add("1- Pour reussir une mayonnaise il faut");
		recetteListe.add("2- mettre les ingredients a temperature ambiante");
		recetteListe.add("3- mettre un jeune d'oeuf dans un bol");
		recetteListe.add("4- ajouter un pince de sel, de poivre");
		recetteListe.add("5- verser un peu d'huile");
		recetteListe.add("6- battre avec une fourchette");
		recetteListe.add("7- verser un peu d'huile");
		recetteListe.add("8- battre avec une fourchette");
		
		
		Iterator<String> itr= recetteListe.iterator();
	
		
		
		root.setCenter(fCentre);
		
		
		Label label1 = new Label("Je suis une etiquette");
		label1.setId("label1");
		
		fCentre.getChildren().add(label1);
		
		sep.setValignment(VPos.CENTER);
		sep.setOrientation(Orientation.HORIZONTAL);
		fCentre.getChildren().add(sep);
		
		Text etiqueta = new Text("Bonjour\n Je suis un text");
		
		fCentre.getChildren().add(etiqueta);
		
		sep2.setValignment(VPos.CENTER);
		sep2.setOrientation(Orientation.HORIZONTAL);
		fCentre.getChildren().add(sep2);
		
		Label label3 = new Label("Les etapes");
		
		
		fCentre.getChildren().add(label3);
		
		
		while (itr.hasNext()) {
			String element = (String)itr.next();
			Label label2 = new Label(element);
			fCentre.getChildren().add(label2);
		}
		
		
	
		VBox panelg = new VBox();
		
		Button but1= new Button("A");
		
		panelg.getChildren().add(but1);
		panelg.getChildren().add(new Button("B"));
		panelg.getChildren().add(new Button("C"));
		panelg.getChildren().add(new Button("D"));
		panelg.getChildren().add(new Button("E"));
		panelg.getChildren().add(new Button("F"));
		panelg.setAlignment(Pos.TOP_RIGHT);
		
		
		
		but1.setOnAction(myHandler);
		
		
		root.setRight(panelg); 
		
	
	
		
		GridPane grid = new GridPane();
		grid.setId("grid");
		
		
		grid.add(new Button("un"), 0, 0);
		grid.add(new Button("deux"), 1, 0);
		grid.add(new Button("trois"), 2, 0);
		grid.add(new Button("quatre"), 0, 1);
		grid.add(new Button("cincq"), 1, 1);
		grid.add(new Button("six"), 2, 1);
		
		
		root.setBottom(grid);
		
		
		

	/*	Iterator<Node> nodo= grid.getChildren().iterator();
		
		for(Node nodeIn:((VBox)nodo).getChildren()){
			
			if(nodeIn instanceof Button){
				
				(((Button) nodeIn.setOnAction(myHandler);
				
			}
		
		}*/
		
		Stage.show();
	}
	
	public static void main (String []args){
		
		Application.launch(args);
		
	}

}
