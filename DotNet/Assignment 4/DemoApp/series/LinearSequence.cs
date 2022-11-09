namespace series;

class LinearSequence : Sequence
{
    private double current;
    private double step;

    public LinearSequence(double current, double step)
    {
        this.current = current;
        this.step = step;
    }

    public override double Next()
    {
        double term = current;
        current += step;
        return term;   
    }
}