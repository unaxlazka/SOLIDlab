package DIP;

import java.util.HashMap;


public class Student {
	public String name;
	public String sex;
	public String year;
	// matrikulatuta dagoen espedientea
	public HashMap<String, Integer> subjectRecord;
	// ikasleak ordaindu behar duena
	public String toCharge;

	// Irakasgai batean matrikulatzen duen metodoa.
	public void register(String subject) {
		// Aurrebaldintzak konprobatzen dira
		Preconditions1 p = new Preconditions1();
		boolean isPosible = p.isPosible(subject, subjectRecord);
		if (isPosible) {
			// Dedukzioa kalkulatu sex eta edadearen arabera
			Deduction1 d = new Deduction1();
			int percentage = d.calcDeduction(sex, year);
			// Irakasgaiaren prezioa lortu
			SubjectQuotes1 sq = new SubjectQuotes1();
			int quote = sq.getPrice(subject);
			// HashMap batean gordetzen du eta ordaindu behar duen balioa eguneratu
			subjectRecord.put(subject, null);
			toCharge = toCharge + (quote - percentage * quote / 100);
		}
	}
}
