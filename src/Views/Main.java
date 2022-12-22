/**
 * @author Lulu
 * @date 11/12/2022
 *
 */

package Views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		Parent root = FXMLLoader.load(getClass().getResource("Mainfx.fxml"));
		primaryStage.setTitle("Pizza Organizator");
		primaryStage.setScene(new Scene(root, 400, 400));
		primaryStage.show();
		
		MainView.initialize(root);
	}
	
	public static void main(String[] args) 
	{ 
		launch(args);
	}
	
}
