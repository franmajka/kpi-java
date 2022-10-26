public class Circle
{
    public Point getCenterCoordinates() {
        return this.centerCoordinates;
    }
    
    public double getRadius() {
        return this.radius;
    }

    public void setCenterCoordinates(double x, double y, double z) {
        this.centerCoordinates.x = x;
        this.centerCoordinates.y = y;
        this.centerCoordinates.z = z;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
	{
		return Math.PI * radius * radius;
	}

	public double getPerimeter()
	{
		return 2 * Math.PI * radius;
	}

    private Point centerCoordinates = new Point(0.0, 0.0, 0.0);
    private double radius = 1;
}