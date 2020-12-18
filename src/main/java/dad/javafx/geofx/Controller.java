package dad.javafx.geofx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

/**
 * @author Ayoze Amaro
 *
 */
public class Controller implements Initializable {

	// CONSTRUCTOR
	public Controller() throws IOException {
		FXMLLoader loader=new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}

	// INITIALIZE
	@Override
	public void initialize(URL location, ResourceBundle resources) { }
	
}
