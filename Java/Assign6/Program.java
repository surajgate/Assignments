import finance.*;

class Program {

	public static double compute(Loan l) {
		return l.EMI();
	}

	public static void main(String[] args) {
		
		double principle = Double.parseDouble(args[0]);
		float period = Float.parseFloat(args[1]);
		var a = new Personal(principle,period);
		var b = new Home(principle,period);

		System.out.printf(" EMI for Personal Loan = %.2f%n ",Program.compute(a));
		System.out.printf(" EMI for Personal Loan with GST = %.2f%n%n ",a.GST(Program.compute(a)));
		System.out.printf(" EMI for Home Loan = %.2f%n ",Program.compute(b));
		System.out.printf(" EMI for Home Loan with discount = %.2f%n ",b.discountable(Program.compute(b)));
	}
}

