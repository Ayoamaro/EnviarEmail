package dad.javafx.email;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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

	// MODEL
	private Model modelo = new Model();
	
	// VIEW
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
	
	public void initialize(URL location, ResourceBundle resources) { }
	
	@FXML
	void onEnviarButtonAction (ActionEvent e) { 
		try {
			modelo.getEmail().setHostName(servidorText.getText());
			modelo.getEmail().setSmtpPort(Integer.parseInt(puertoText.getText()));
			modelo.getEmail().setAuthentication(remitenteText.getText(), remitentePassword.getText());
			modelo.getEmail().setSSLOnConnect(sslCheckBox.isSelected());
			modelo.getEmail().setFrom(remitenteText.getText());
			modelo.getEmail().setSubject(asuntoText.getText());
			modelo.getEmail().setMsg(mensajeText.getText());
			modelo.getEmail().addTo(destinatarioText.getText());
			
			modelo.getEmail().send();
			successAccess();
			} catch(Exception ex) {
				errorAccess();
			}
	}
	
	private void successAccess() {
		Alert alert=new Alert(AlertType.INFORMATION);
		alert.setHeaderText("Mensaje enviado con éxito a '"+ destinatarioText.textProperty().get() +"'.");
		alert.setTitle("Mensaje enviado");
		alert.showAndWait();
	}
	
	private void errorAccess() {
		Alert alert=new Alert(AlertType.ERROR);
		alert.setHeaderText("No se pudo enviar el email");
		alert.setTitle("Error");
		alert.showAndWait();
	}
	
	@FXML
	void onVaciarButtonAction (ActionEvent e) {
		servidorText.clear();
		puertoText.clear();
		remitenteText.clear();
		remitentePassword.clear();
		sslCheckBox.setSelected(false);
		mensajeText.clear();
		destinatarioText.clear();
		asuntoText.clear();
	}
	
	@FXML
	void onCerrarButtonAction (ActionEvent e) { Platform.exit(); }
	
	public GridPane getView() {
		return this.view;
	}
}
