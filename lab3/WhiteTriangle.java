public class WhiteTriangle extends Triangle
{
	public WhiteTriangle(Point A, Point B, Point C)
	{
		this.setPointA(A);
		this.setPointB(B);
		this.setPointC(C);
	}

	@Override
	public String toString()
	{
		return "This white triangle";
	}
}
