package srp;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;

	// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
		// Dedukzioa kalkulatu
		Deduction a = new Deduction();
		if (billAmount>50000)
			billDeduction = a.calculateDeduction(billAmount, deductionPercentage+5);
		else
			billDeduction = a.calculateDeduction(billAmount, deductionPercentage);

		// VAT kalkulatzen dugu
		VAT b = new VAT();
		VAT=0;
		if(code.equals("0")) {
			VAT = b.calculateVAT(billAmount,(float) 0.18);
		}
		// Totala kalkulatzen dugu
		Total c = new Total();
		billTotal = c.calculateTotal(billAmount, deductionPercentage, VAT);
		
	}
}
