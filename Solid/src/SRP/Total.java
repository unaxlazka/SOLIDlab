package SRP;

public class Total {
	
	public float calculateTotal(float billAmount, float deductionPercentage, float BEZ) {
		return (billAmount - deductionPercentage) + BEZ;
	}
}
