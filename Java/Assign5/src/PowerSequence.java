package series;

public class PowerSequence extends Sequence implements Resetable {

	private double current;
	private float factor;

	public PowerSequence(float ratio) {
		current = 1;
		factor = ratio;
	}

	public double next() {
		
		double term = current;
		current *= factor;
		return term;
	}

	public void reset() {
		current = 1;
	}

		

}
