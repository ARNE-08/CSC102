public class Circle {
    double radius;
    final double PI = 3.14159;
    double xcoor;
    double ycoor;

    // Exercise 1 + 5
    public static int countCircleObject; // Exercise 6

    public void setRadius(double r) {
        radius = r;
    }

    public static int getNumberOfCircleObjects() {
        return (countCircleObject);
    }

    public double getRadius() {
        return (radius);
    }

    public double getArea() {
        double area = PI * radius * radius;
        return (area);
    }

    public double getPerimeter() {
        return (2 * PI * radius);
    }

    public double getAreaofCircles(int n) {
        return (n * getArea());
    }

    public double getDiameter() {
        return (2 * radius);
    }

    public void setCenter(int x, int y) {
        xcoor = x;
        ycoor = y;
    }

    public void printInfo() {
        System.out.println("The circle have: ");
        System.out.println("radius = " + radius);
        System.out.println("area = " + getArea());
        System.out.println("diameter = " + getDiameter());
        System.out.println("coordinate = (" + xcoor + ", " + ycoor + ")");
    }
}
