namespace series;

class PowerSequence : Sequence , IResetable
{
    private double current;
    private double factor;

    public PowerSequence(double factor)
    {
        this.factor = factor;
        current = 1;
    }

    public override double Next()
    {
        double term = current;
        current *= factor;
        return term;
    }

    public void Reset()
    {
        current = 1;
    }
} 
