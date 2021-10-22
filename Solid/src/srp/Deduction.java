package srp;

public class Deduction {
	
	public float calculateDeduction(float billAmount, float deductionPercentage) {
		return (billAmount * deductionPercentage) / 100;
	}
	
}
