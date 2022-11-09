namespace banner;

class CurvedBanner : Banner
{
    public float radius { get; set;}
     
     public CurvedBanner(float width, float height, float radius)
     {
        base.width = width;
        base.height = height;
        this.radius = radius;
     }
    public override double Area()
    {
        return base.Area() - 0.86 * radius * radius;
    }

}