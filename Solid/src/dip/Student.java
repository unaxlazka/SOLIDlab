package dip;

import java.util.HashMap;

public class Student {
	String name;
	String sex;
	String year;
	// matrikulatuta dagoen espedientea
	HashMap<String, Integer> subjectRecord;
	// ikasleak ordaindu behar duena
	String toCharge;

	// Irakasgai batean matrikulatzen duen metodoa.
	public void register(String subject, Preconditions p, Deduction d, SubjectQuotes sq) {
		// Aurrebaldintzak konprobatzen dira
		boolean isPosible = p.isPosible(subject, subjectRecord);
		if (isPosible) {
			// Dedukzioa kalkulatu sex eta edadearen arabera
			int percentage = d.calcDeduction(sex, year);
			// Irakasgaiaren prezioa lortu
			int quote = sq.getPrice(subject);
			// HashMap batean gordetzen du eta ordaindu behar duen balioa eguneratu
			subjectRecord.put(subject, null);
			toCharge = toCharge + (quote - percentage * quote / 100);
		}
	}
}
