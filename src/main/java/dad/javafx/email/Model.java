package dad.javafx.email;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

/**
 * @author Ayoze Amaro
 *
 */
public class Model {

	private Email email = new SimpleEmail();

	public Email getEmail() {
		return email;
	}
	public void setEmail(Email email) {
		this.email = email;
	}
}
