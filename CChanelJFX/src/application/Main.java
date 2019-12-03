package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			//Ponemos el FZMLloader
			FXMLLoader loader = new FXMLLoader(getClass().getResource("CChannel.fxml"));//cargar la vista
			//BorderPane root = new BorderPane(); //panel
			AnchorPane root = (AnchorPane) loader.load(); //Creamos esta linea xq tenemos un anchor, no un border
			Scene scene = new Scene(root); //Se mete el panel dentro de una escena
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); 
			primaryStage.setScene(scene); //Y la escena la metemos en el stage
			primaryStage.setTitle("Comedero de fruta");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}