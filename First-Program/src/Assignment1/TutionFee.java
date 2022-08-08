package Assignment1;

public class TutionFee {

	public static void main(String[] args) {
		double feeForTution = 6000;
		double increasedFeeEachYear = 0.02;
		double percent = 0.0;
		double totalAmount = 0.0;
		double increasedAmount = 0.0;
		
		int i = 1;
		while(i<= 5) {
			percent = feeForTution * increasedFeeEachYear;
			increasedAmount = percent +  feeForTution;
			System.out.println(i+ " years: $"+increasedAmount);
			feeForTution = increasedAmount;
			i++;
		}
	
	}
	

}
