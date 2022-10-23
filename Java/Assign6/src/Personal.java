package finance;

public class Personal extends Loan implements Taxable {


	public double GST(double emi) {
		
		return emi * 1.18;
	}
	public float getRate() {

		float rate;

		if(getPrinciple() <= 500000)
			rate = 15;
		else
			rate = 16;

		return rate;
	}

	public Personal(double principle, float period) {

		setPrinciple(principle);
		setPeriod(period);
	}

}
