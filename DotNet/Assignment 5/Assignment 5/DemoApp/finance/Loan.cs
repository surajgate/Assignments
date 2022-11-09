namespace finance;

public abstract class Loan
{
    public double principle{ get; set; }

    public double period { get; set;}

    public abstract double GetRate();

    public double EMI()
    {
        double EMI = principle * ( 1 + GetRate() * period / 100 ) / ( 12 * period );      
        return EMI;
    }
}
