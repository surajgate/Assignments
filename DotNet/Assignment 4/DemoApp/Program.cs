using series;

class Program
{
    public static double Compute(Sequence info, int count)
    {
        if(info is IResetable p)
            p.Reset();
        return info.Sum(count) / count;
    }
    public static void Main(string[] args)
    {
        int n = int.Parse(args[0]);

        var a = new LinearSequence(2,5);
        var b = new PowerSequence(3);

        Console.WriteLine("First linear computation result  = {0:0.00}", Program.Compute(a, n));
	    Console.WriteLine("Second linear computation result = {0:0.00}", Program.Compute(a, n));
	    Console.WriteLine("First power computation result   = {0:0.00}", Program.Compute(b, n));
	    Console.WriteLine("Second power computation result  = {0:0.00}", Program.Compute(b, n));
    }
}