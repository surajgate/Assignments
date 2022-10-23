package banner;

public class Banner {
	
	private float width;
	private float height;

	public Banner(float w, float h) {

		width = w;
		height = h;
	}

	public float getWidth() {
		return width;
	}

	public float getHeight() {
		return height;
	}

	public void setWidth(float w) {
		width = w;
	}

	public void setHeight(float h) {
		height = h;
	}

	public double area() {

		return width * height;
	}

}
	
