package isp;

public class GmailAccount implements EmailSendable {
	String name, emailAddress;

	public GmailAccount(String izena, String helbidea) {
		this.name = izena;
		this.emailAddress = helbidea;
	}

	public String getEmail() {
		return emailAddress;
	}
}
