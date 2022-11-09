namespace banner;
class Banner
{
    public float width { get; set; }
    public float height { get; set; }

    public Banner()
    {
        width = 0;
        height = 0;
    }
    public Banner(float width, float height)
    {
        this.width = width;
        this.height = height;

    }

    public virtual double Area()
    {
        return width * height;
    }

}