public class Main {
    public static void main(String[] args) {
        BaseFactory factory = new WhiteFactory();
        Triangle triangleWhite = factory.createTriangle();
        Circle circleWhite = factory.createCircle();
        System.out.println(triangleWhite.toString());
        System.out.println(circleWhite.toString());

        factory = new BlackFactory();
        Triangle triangleBlack = factory.createTriangle();;
        Circle circleBlack = factory.createCircle();
        System.out.println(triangleBlack.toString());
        System.out.println(circleBlack.toString());
    }
}