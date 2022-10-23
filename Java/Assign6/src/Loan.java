package finance;
public abstract class Loan {
	
	private double principle;
	private float period;

	public abstract float getRate();

	public double EMI(){	
		
		double EMI = principle * (1 + getRate() * period / 100 ) / (12 * period);
		return EMI;
	}
	public double getPrinciple() {
		return principle;
	}

	public void setPrinciple(double principle){
		this.principle = principle;
	}

	public float getPeriod() {
		return period;
	}

	public void setPeriod(float period) {
		this.period = period;
	}

}
