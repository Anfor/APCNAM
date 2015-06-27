

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class MyEventHandler implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent event) {
		Alert alerte=new Alert(AlertType.INFORMATION);
		alerte.setContentText("click!");
		alerte.show();
		
	}

}
