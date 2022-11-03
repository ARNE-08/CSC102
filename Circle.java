public class Circle {
    private double radius;
    private double xcoor;
    private double ycoor;
    private final double PI = Math.PI;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double r) {
        radius = r;
    }
    public double getArea() {
        return radius*radius*PI;
    }
    public double getPerimeter() {
        return 2*PI*radius;
    }
    public double getDiameter() {
        return 2*radius;
    }
    public void setCenter(double x, double y) {
        xcoor = x;
        ycoor = y;
    }
    public double getAreaOfCircles(int n) {
        return n*getArea();
    }
    public void printInfo() {
        System.out.println("The circle have:");
        System.out.println("radius = " + radius);
        System.out.println("area = " + getArea());
        System.out.println("perimeter = " + getPerimeter());
        System.out.println("diameter = " + getDiameter());
        System.out.println("coordinates = (" + xcoor + "," + ycoor + ")");
    }
}
