package hospital;

public class InhousePatient extends Patient {

	private double discount;

	public InhousePatient(int id, String na, int bt, int d, double dis) {
	super(id, na, bt,d);
	discount = dis;
	}

	public double getBillAmount() {
		double amount = super.getBillAmount();{
		discount = amount >= 5000 ? 5.0 : 0;
		}
		return amount-amount * discount /100;
	}
}
