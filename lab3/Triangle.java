public class Triangle
{
    public Point getPointA() {
        return this.pointA;
    }
    
    public Point getPointB() {
        return this.pointB;
    }
    
    public Point getPointC() {
        return this.pointC;
    }

    public void setPointA(double x, double y, double z) {
        this.pointA.x = x;
        this.pointA.y = y;
        this.pointA.z = z;
    }    
    
    public void setPointB(double x, double y, double z) {
        this.pointB.x = x;
        this.pointB.y = y;
        this.pointB.z = z;
    } 

    public void setPointC(double x, double y, double z) {
        this.pointC.x = x;
        this.pointC.y = y;
        this.pointC.z = z;
    } 

    public double getArea()	{
        Point AB = new Point(pointB.x - pointA.x, pointB.y - pointA.y, pointB.z- pointA.z);
        Point AC = new Point(pointC.x - pointA.x, pointC.y - pointA.y, pointC.z- pointA.z);

        Point crossProduct = new Point(AB.y * AC.z + AC.y * AB.z, AC.x * AB.z - AB.x * AC.z, AB.x * AC.y + AC.x * AB.y);

        double areaParallelogram = Math.sqrt(Math.pow(crossProduct.x, 2) + Math.pow(crossProduct.y, 2) + Math.pow(crossProduct.y, 2));
		
        return areaParallelogram / 2;
	}

 
    private Point pointA = new Point(0.0, 0.0, 0.0);
    private Point pointB = new Point(0.0, 0.0, 0.0);
    private Point pointC = new Point(0.0, 0.0, 0.0);
}