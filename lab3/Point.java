public class Point {
    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    static public Point randPoint() {
        int max = 10, min = -10;
        double x = (double)(Math.random() * (max - min + 1) + min);  
        double y = (double)(Math.random() * (max - min + 1) + min);  
        double z = (double)(Math.random() * (max - min + 1) + min);  

        return new Point(x, y, z);
    }

    public double x = 0.0;
    public double y = 0.0;
    public double z = 0.0;   
}