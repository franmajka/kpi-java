public class WhiteCircle extends Circle{
    
    public WhiteCircle(int radius, Point centerCoordinates)	{
        this.setRadius(radius);
        this.setCenterCoordinates(centerCoordinates);
	}

	@Override
	public String toString() {
		return "This white circle";
	}
}
