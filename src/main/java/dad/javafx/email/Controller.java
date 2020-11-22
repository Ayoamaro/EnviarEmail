package dad.javafx.email;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 * @author Ayoze Amaro
 *
 */
public class Controller implements Initializable {

	// Model
	private Model modelo = new Model();
	
	// View
	@FXML
	private GridPane view;
	@FXML
	private TextField servidorText, puertoText, remitenteText, destinatarioText, asuntoText;
	@FXML
	private PasswordField remitentePassword;
	@FXML
	private CheckBox sslCheckBox;
	@FXML
	private TextArea mensajeText;
	@FXML
	private Button enviarButton, vaciarButton, cerrarButton;
	
	public Controller() throws IOException{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	@FXML
	void onEnviarButtonAction (ActionEvent e) { }
	@FXML
	void onVaciarButtonAction (ActionEvent e) { }
	@FXML
	void onCerrarButtonAction (ActionEvent e) { }
	
	public void initialize(URL location, ResourceBundle resources) { }
	
	public GridPane getView() {
		return this.view;
	}
}
