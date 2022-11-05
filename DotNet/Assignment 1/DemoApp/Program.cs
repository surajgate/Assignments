using Math.op;
class Assign2 
{		
	public static void Main(string[] args)
	{
		int a = int.Parse(args[0]);
		int b = int.Parse(args[1]);

		if(MathUtil.IsEven(a))
			Console.WriteLine("{0} is Even",a);
		else 
			Console.WriteLine("{0} is Not Even",a);

		if(MathUtil.IsOdd(a))
			Console.WriteLine("{0} is Odd ",a);
		else 
			Console.WriteLine("{0} is Not Odd",a);

		
		if(MathUtil.IsPrime(a))
			Console.WriteLine("{0}  is Prime ",a);
		else 
			Console.WriteLine("{0}  is Not Prime",a);

		
		Console.WriteLine("Total prime numbers between {0} and {1} are : {2} ",a,b,MathUtil.CountPrimes(a,b));

			
		Console.WriteLine("Reverse of {0} is {1} ",a,MathUtil.Reverse(a));

	}	
}
