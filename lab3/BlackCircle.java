
public class BlackCircle extends Circle {

	public BlackCircle(int radius, Point centerCoordinates)	{
        this.setRadius(radius);
        this.setCenterCoordinates(centerCoordinates);
	}

	@Override
	public String toString() {
		return "This black circle";
	}
}