public class WhiteFactory implements BaseFactory
{
	@Override
	public Triangle createTriangle() {
		return new WhiteTriangle(Point.randPoint(), Point.randPoint(), Point.randPoint());
	}

	@Override
	public Circle createCircle() {
		return new WhiteCircle(1, Point.randPoint());
	}
}
