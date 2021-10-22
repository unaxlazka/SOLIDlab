package isp;

public class Person implements EmailSendable, Telephonable {
	String name, address, email, telephone;

	public Person(String izena, String helbidea, String mail, String telefonoa) {
		this.name = izena;
		this.address = helbidea;
		this.email = mail;
		this.telephone = telefonoa;
	}

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setAddress(String a) {
		address = a;
	}

	public String getAddress() {
		return address;
	}

	public void setEmail(String e) {
		email = e;
	}

	@Override
	public String getEmail() {
		return email;
	}

	public void setTelephone(String t) {
		telephone = t;
	}

	@Override
	public String getTelephone() {
		return telephone;
	}

}