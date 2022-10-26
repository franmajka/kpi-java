public class BlackTriangle extends Triangle
{
	public BlackTriangle(Point A, Point B, Point C)
	{
		this.setPointA(A);
		this.setPointB(B);
		this.setPointC(C);
	}

	@Override
	public String toString()
	{
		return "This black triangle";
	}
}
