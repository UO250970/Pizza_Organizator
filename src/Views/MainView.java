package Views;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;

public class MainView {
	
	private static Parent root;
	
	@FXML
	private static Button btnAddPerson;
	
	public static void initialize(Parent r) {
		
		root = r;
		
		btnAddPerson = (Button) root.lookup("#btnAddPerson");
		btnAddPerson.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Se ha hecho clic en el botón");
			}
			
		});
	}
	
}
