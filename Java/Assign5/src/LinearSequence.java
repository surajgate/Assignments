package series;

public class LinearSequence extends Sequence {

	private double current;
	private float step;

	public LinearSequence(float first, float difference) {
		current = first;
		step = difference;
	}

	public double next() {
		
		double term = current;
		current += step;
		return term;
	}
		

}
