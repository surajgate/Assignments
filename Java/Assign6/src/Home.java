package finance;

public class Home extends Loan {

	private double limit = 2500000;


	public double discountable(double emi) {
		return emi * 0.95;
	}
	public float getRate() {

		float rate;

		if(getPrinciple() <= 2000000)
			rate = 10;
		else
			rate = 11;

		if(getPrinciple() > limit)
			rate = rate + 1;


		return rate;
	}

	public Home(double principle, float period) {
		setPrinciple(principle);
		setPeriod(period);
	}

}
