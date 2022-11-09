namespace finance;

public class Home : Loan , IDiscountable
{
    private double limit = 2500000;

    public double Discountable(double emi)
    {
        return emi * 0.95;
    }

    public Home(double principle, double period)
    {   
        this.principle = principle;
        this.period = period;        
    }

    public override double GetRate()
    {
        double rate;

        if(principle <= 2000000)
            rate = 10;
        else 
            rate = 11;

        if(principle > limit)
            rate = rate + 1;
        
        return rate;
    }
}