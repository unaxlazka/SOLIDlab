package isp;

public class Main {

	public static void main(String[] args) {
		Person p = new Person("Unax", "Amute", "ulazkanotegi010@ikasle.ehu.eus", "688825012");
		String mezua = "Hello World!!!";
		EmailSender es = new EmailSender();
		es.sendEmail(p, mezua);
		System.out.println(p.getName() + " pertsonari email mezua bidali zaio: " + mezua);
		
		SMSSender.sendSMS(p, mezua);
		System.out.println(p.getName() + " pertsonari SMS mezua bidali zaio: " + mezua);

		GmailAccount ga = new GmailAccount("Unax","unacen@gmail.com");
		es.sendEmail(ga, mezua);
		System.out.println(ga.getEmail() + " emailari mezua bidali zaio: " + mezua);
	}
}