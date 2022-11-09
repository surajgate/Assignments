using banner;

class Program
{
    public static double BannerPrice(Banner info, int copies)
    {
        float rate = copies < 5 ? 0.08f : 0.75f;
        return copies * rate * info.Area();
    }
    public static void Main(string[] args)
    {
        int n = int.Parse(args [0]);
        var a = new Banner(20, 15);
        var b = new CurvedBanner(20, 15, 0.1f);
        Console.WriteLine("Total price for regular banner = {0:0.00}", BannerPrice(a, n));
        Console.WriteLine("Total price for regular banner = {0:0.00}", BannerPrice(b, n));

    }


}