using System.Reflection;
delegate double TourRate(int days, int Noperson);

class Program
{
    static void Main(string[] args)
    {
        int d = int.Parse(args[0]);
        int p = int.Parse(args[1]);
        Type t = Type.GetType(args[2]);
        MethodInfo scheme = t.GetMethod(args[3]);
        object package = Activator.CreateInstance(t);
        TourRate r = scheme.CreateDelegate<TourRate>(package);

        Console.WriteLine($"Total Tour rate:{r(d, p)}");
    }


}