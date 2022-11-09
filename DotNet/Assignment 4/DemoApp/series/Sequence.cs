namespace series;

 public abstract class Sequence
{
    public abstract double Next();

    public double Sum(int count)
    {
        double total = 0;

        for(int i = 1; i <= count; ++i)
        {
            total += Next();
        }
        return total;
    }
}