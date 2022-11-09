namespace finance;

public class Personal : Loan , ITaxable
{
    public Personal(double principle, double period)
    {
        this.principle = principle;
        this.period = period;
    }

    public double GST(double emi)
    {
        return emi * 1.18;
    }

    public override double GetRate()
    {
        double rate;

        if(principle <= 500000)
            rate = 15;

        else
            rate = 16;

        return rate;
    }
}