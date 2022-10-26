
public class BlackCircle extends Circle {

	public BlackCircle(int radius, Point centerCoordinates)	{
        this.setRadius(radius);
        this.setCenterCoordinates(centerCoordinates.x, centerCoordinates.y, centerCoordinates.z);
	}

	@Override
	public String toString() {
		return "This black circle";
	}
}