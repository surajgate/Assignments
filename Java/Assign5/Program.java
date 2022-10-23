import series.*;

class Program { 
	
	public static double compute(Sequence info, int count) {
		return info.sum(count) / count;
	}

	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);

		var a = new LinearSequence(2.0f,5.0f);
		var b = new PowerSequence(3.0f);

		System.out.printf(" First Linear Sequence Computation result = %f%n",Program.compute(a,n));

		System.out.printf(" Second Linear Sequence Computation result = %f%n",Program.compute(a,n));

		System.out.printf(" First Power Sequence Computation result = %f%n",Program.compute(b,n));
		
		System.out.printf(" Second Power Sequence Computation result = %f%n",Program.compute(b,n));


}

}

