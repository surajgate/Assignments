namespace Tours;

public class PremiumTours
{
    public double Common(int days, int Noperson) => days * Noperson * 1200;

    public double Senior(int days, int Noperson) => GetDiscount(days, Noperson) - 100;

    public double Woman(int days, int Noperson) => GetDiscount(days, Noperson) - 200;

    private double GetDiscount(int days, int Noperson)
    {
        double total = Common(days, Noperson);
        if ((days > 6) && (Noperson >= 4))
        {
            return total - 200 * days * Noperson;
        }
        else if (days > 6)
        {
            return total - 100 * days * Noperson;
        }
        else if (Noperson >= 4)
        {
            return total - 100 * days * Noperson;
        }
        return days * Noperson * 1200;
    }
}
