public class BlackFactory implements BaseFactory
{
	@Override
	public Triangle createTriangle() {
		return new BlackTriangle(Point.randPoint(), Point.randPoint(), Point.randPoint());
	}

	@Override
	public Circle createCircle() {
		return new BlackCircle(1, Point.randPoint());
	}
}
