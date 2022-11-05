class Employee
{
    private int eid;
    private int age;
    private int hours;
    private double rate;

    public Employee()
    {
        eid= 100;
        age= 25;
        hours= 10;
        rate= 0.6;
    } 
    public Employee(int eid, int age, int hours, double rate)
    {
        this.eid= eid;
        this.age= age;
        this.hours= hours;
        this.rate= rate;
    }

    public double GetNetIncome(int hours, double rate) 
    {
        return hours * rate;
    }




}