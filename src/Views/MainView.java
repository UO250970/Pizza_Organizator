package Views;

import javafx.beans.binding.Bindings;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;

public class MainView {
	
	private static Parent root;
	
	private static Button getBtnAddPerson() {
		return (Button) root.lookup("#btnAddPerson");
	}
	private static BooleanProperty campoTextoVacio;
	
	private static TabPane getTabPanePerson() {
		return (TabPane) root.lookup("#tabPanePerson");
	}
	
	private static TextField getTxtAddPerson() {
		return (TextField) root.lookup("#txtAddPerson");
	}
	private static void clearTxtAddPerson() {
		getTxtAddPerson().clear();
	}
	
	public static void initialize(Parent r) {
		
		root = r;
		campoTextoVacio = new SimpleBooleanProperty();
		campoTextoVacio.bind(Bindings.isEmpty(getTxtAddPerson().textProperty()));
		getBtnAddPerson().disableProperty().bind(campoTextoVacio);
		
		getBtnAddPerson().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				//Cojo el título para crear el objeto tab
				String tabName = getTxtAddPerson().getText();
				Tab tab = new PersonTabView(tabName);

                // Añade la pestaña al panel de pestañas
                getTabPanePerson().getTabs().add(tab);
                
                //Elimina el texto del campo
                clearTxtAddPerson();
			}
			
		});
	}
	
}
