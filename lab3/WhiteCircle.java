public class WhiteCircle extends Circle{
    
    public WhiteCircle(int radius, Point centerCoordinates)	{
        this.setRadius(radius);
        this.setCenterCoordinates(centerCoordinates.x, centerCoordinates.y, centerCoordinates.z);
	}

	@Override
	public String toString() {
		return "This white circle";
	}
}
