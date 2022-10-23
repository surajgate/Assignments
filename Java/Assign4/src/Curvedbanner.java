package banner;

public class Curvedbanner extends Banner {

	private float radius;

	public Curvedbanner(float w,float h,float rad) {
		super(w,h);
		radius = rad;
	}
	
	public float getRadius() {
		return radius;
	}
	
	public void setRadius(float rad) {
		radius = rad;
	}
	
	public double area() {

			return super.area() - 0.86 * radius * radius;
		}

}





