public class WhiteTriangle extends Triangle
{
	public WhiteTriangle(Point A, Point B, Point C)
	{
		this.setPointA(A.x, A.y, A.z);
		this.setPointB(B.x, B.y, B.z);
		this.setPointC(C.x, C.y, C.z);
	}

	@Override
	public String toString()
	{
		return "This white triangle";
	}
}
