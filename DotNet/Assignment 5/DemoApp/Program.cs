using finance;

class Program
{
    public static double compute(Loan l) {
		return l.EMI();
	}

	public static void Main(String[] args) {
		
		double principle = double.Parse(args[0]);
		double period = double.Parse(args[1]);
		var a = new Personal(principle,period);
		var b = new Home(principle,period);

		Console.WriteLine(" EMI for Personal Loan = {0:0.00} ",Program.compute(a));
		Console.WriteLine(" EMI for Personal Loan with GST = {0:0.00}\n ",a.GST(Program.compute(a)));
		Console.WriteLine(" EMI for Home Loan = {0:0.00} ",Program.compute(b));
		Console.WriteLine(" EMI for Home Loan with discount = {0:0.00} ",b.Discountable(Program.compute(b)));
	}
}

